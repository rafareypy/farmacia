package py.com.farmacia.services.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import py.com.farmacia.hibernate.util.HibernateUtil;
import py.com.farmacia.model.bean.Cliente;
import py.com.farmacia.model.bean.CobroCab;
import py.com.farmacia.model.bean.CobroDet;
import py.com.farmacia.model.bean.Moneda;
import py.com.farmacia.model.bean.SituacionPagamento;
import py.com.farmacia.model.bean.SituacionVenta;
import py.com.farmacia.model.bean.VentaCab;
import py.com.farmacia.model.interfaces.CobroDAO;
import py.com.farmacia.services.interfaces.CobroService;
import py.com.farmacia.util.Inicializador;

public class CobroServiceImpl implements CobroService {

	
	Session sessao ;
	
	CobroDAO cobroDAO = null ;
	
	public CobroServiceImpl() {
		super();
		this.sessao = HibernateUtil.getSessao() ;
		cobroDAO = Inicializador.CobroDAOImpl();
	}
	
	@Override
	public List<CobroCab> getListaCobroCabPorCliente(Cliente cliente,
										SituacionVenta sv_codigo) {
		
		StringBuilder hql = new StringBuilder(" from CobroCab cc");
		
		if( sv_codigo != null && cliente != null ){
			hql.append(" where cc.vc_cabecera.sv_codigo.sv_codigo = ")
			.append(sv_codigo.getSv_codigo().toString())
			.append(" and cc.vc_cabecera.cli_codigo.cli_codigo = ")
			.append(cliente.getCli_codigo().toString());
		}else if( sv_codigo == null && cliente != null ){
			hql.append(" where cc.vc_cabecera.cli_codigo.cli_codigo = ")
			.append(cliente.getCli_codigo().toString());			
		}else if( sv_codigo != null && cliente == null ){			
			hql.append(" where cc.vc_cabecera.sv_codigo.sv_codigo = ")
			.append(sv_codigo.getSv_codigo().toString());
		}else{
			
		}
		
		return obtnerListaDeHQL(hql);
		
		
		
	}

	private List<CobroCab> obtnerListaDeHQL(StringBuilder hql) {

		 List<CobroCab> lista = new ArrayList<CobroCab>();
		 
		try {
			lista = sessao.createQuery(String.valueOf(hql)).list();
		} catch (Exception e) {
			so("getListaCobroCabPorCliente - No se encontro Datos");
		}
		return lista ;
		
	}

	private void so(String string) {
		System.out.println("CobroServiceImpl \n" + string);
		
	}

	@Override
	public List<CobroCab> getListaCobroCabPorVentaCab(VentaCab ventaCab) {
		
		StringBuilder hql = new StringBuilder(" from CobroCab cc");
		
		if( ventaCab != null )
		{
			hql.append(" where  cc.vc_codigo.vc_codigo =  ")
			.append(ventaCab.getVc_codigo().toString());			
		}
				
		return obtnerListaDeHQL(hql);
		
	}

	@Override
	public List<CobroCab> getListaCobroCab() {	
		return cobroDAO.getListaCobroCab();		
	}

	@Override
	public List<CobroCab> getListaCobroCabPorFechaVenc(Date fecha) {
		return cobroDAO.getListaCobroCabPorFechas(fecha, fecha);		
	}

	@Override
	public List<CobroCab> getListaCobroCabPorFechasVenc(Date fechaIni,
			Date fechaFin) {		
		return cobroDAO.getListaCobroCabPorFechas(fechaIni, fechaFin);		
	}

	@Override
	public List<CobroCab> getListaCobroCabPorSituacion(
			SituacionPagamento situacionPagamento) {
		
		StringBuilder hql = obtnerPrimerHQLCobroCab();
		
		if( situacionPagamento != null )
		{
			hql.append(" where cc.sp_codigo.sp_codigo = ")
			.append(situacionPagamento.getSp_codigo().toString());
		}
				
		return obtnerListaDeHQL(hql);
		
		
	}

	private StringBuilder obtnerPrimerHQLCobroCab() {

		return new StringBuilder(" from CobroCab cc ");
	}

	@Override
	public List<CobroCab> getListaCobroCabPorSituacionYMoneda(
				SituacionPagamento situacionPagamento, Moneda moneda) {		
		return getListaCobroCabPorSituacion(situacionPagamento);
	}

	@Override
	public List<CobroCab> getListaCobroCabPorListaVentaCab(
							List<VentaCab> listaVentaCab, SituacionVenta situacionVenta) {		
		jo(" Metodo No Implementado en el Sistema !! - getListaCobroCabPorListaVentaCab - ");
		return null;
	}

	private void jo(String string) {
		JOptionPane.showMessageDialog(null, string +"\nCobroServiceImpl");
	}

	@Override
	public CobroCab getCobroCab(Integer codigo) {		
		return cobroDAO.getCobroCab(codigo);
	}

	@Override
	public CobroCab getCobroCab(CobroCab cobroCab) {
		return cobroDAO.getCobroCab(cobroCab);		
	}

	@Override
	public boolean salvar(CobroCab cobroCab) {		
		
		boolean resultado = true ;
		
		if( cobroDAO.salvarCobroCab(cobroCab) == true )
		{			
				Transaction transacao = sessao.beginTransaction();				
				try {
					transacao.commit();
				} catch (Exception e) {
					resultado = false ;
					transacao.rollback();					
				}					
		}
		else
		{
			resultado = false ;	
		}
			
		return resultado ;
	}

	@Override
	public boolean eliminar(CobroCab cobroCab) {	

		boolean resultado = true ;
		
		  if(cobroDAO.excluirCobroCab(cobroCab) == true)
		  {			  							
					Transaction transacao = sessao.beginTransaction();				
					try {
						transacao.commit();
					} catch (Exception e) {
						resultado = false ;
						transacao.rollback();					
					}												
			}
			else
			{
				resultado = false ;	
			}

		  return resultado ;
	}

	@Override
	public boolean actualizar(CobroCab cobroCab) {	

		boolean resultado = true ;
		
		  if(cobroDAO.actualizarCobroCab(cobroCab) == true)
		  {			  
				
					Transaction transacao = sessao.beginTransaction();				
					try {
						transacao.commit();
					} catch (Exception e) {
						resultado = false ;
						transacao.rollback();					
					}									
			
			}
			else
			{
				resultado = false ;	
			}

		  return resultado ;
		
		 
	}

	@Override
	public boolean actualizarSituacionPagamentoCobroCab(CobroDet cobro,
			SituacionPagamento situacionPagamento) {		
		jo("No Esta implementado p Metodo actualizarSituacionPagamentoCobroCab ");
		return false ;	
	}

}
