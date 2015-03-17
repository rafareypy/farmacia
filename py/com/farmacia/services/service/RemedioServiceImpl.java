package py.com.farmacia.services.service;

import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

import py.com.farmacia.hibernate.util.HibernateUtil;
import py.com.farmacia.model.bean.Clase;
import py.com.farmacia.model.bean.Embalaje;
import py.com.farmacia.model.bean.Marca;
import py.com.farmacia.model.bean.Moneda;
import py.com.farmacia.model.bean.Remedio;
import py.com.farmacia.model.bean.UnidadMedida;
import py.com.farmacia.model.interfaces.InterfaceRemedioDAO;
import py.com.farmacia.services.interfaces.RemedioService;
import py.com.farmacia.util.Inicializador;

public class RemedioServiceImpl implements RemedioService {

	InterfaceRemedioDAO remedioDAO  = null ;
	Session sessao = null ;
	
	public RemedioServiceImpl() {
		super();
		sessao = HibernateUtil.getSessao();
		remedioDAO = Inicializador.getRemedioDAO();
	}
	
	@Override
	public Remedio getRemedio(Integer codigo) {
		return remedioDAO.getRemedio(codigo);
	}

	@Override
	public Remedio getRemedio(Remedio remedio) {
		return remedioDAO.getRemedio(remedio);
	}

	@Override
	public boolean excluir(Remedio remedio) {
		
		boolean resultado = false ;
		
		Transaction transacao = sessao.beginTransaction() ;
		
		
		if( remedio != null &&  remedio.getRm_codigo() != null  ){
			if( remedioDAO.excluirRemedio(remedio)  == true)
			{
				try {
					transacao.commit();
					resultado = true ;
				} catch (Exception e) {
					sou("Problma al Intentar Exckuir los Datos !!!");
				}
			}
			else
			{
				transacao.rollback();
			}
			
		}
		else
		{
			jopt("Remedio Nulo o Falta ID para el Remadio !!!");
		}
		
					
		return resultado ;
	}

	private void sou(String string) {
		System.out.println(" RemedioServiceImpl\n "  + string);
		
	}

	public boolean validarCampos(Remedio remedio) {
		
		boolean resultado = false ;
		
		if( remedio == null ){
			joptFalta(" Remedio !!! ");
		}else if( remedio.getDroga() == null ){
			joptFalta(" Droga para el Remedio !!! ");
		}else if(remedio.getEmbalaje() == null){
			joptFalta(" Embalaje !!! ");
		}else if(remedio.getFecha_produccion() == null){
			joptFalta(" Fecha de Produccion !!! ");
		}else if(remedio.getFecha_retirada() == null){
			joptFalta(" Fecha Retirada !!! ");
		}else if(remedio.getFecha_vencimiento() == null){
			joptFalta(" Fecha de Vencimiento !!! ");
		}else if(remedio.getFormaADM() == null){
			joptFalta(" Forma de ADM !!! ");
		}else if(remedio.getLaboratorio() == null){
			joptFalta(" Laboratorio !!! ");
//		}else if(remedio.getPresentacion() == null){
//			joptFalta(" Presentacion !!! ");
		}else if(remedio.getProcedencia() == null){
			joptFalta(" Procedencia !!! ");
		}else if(remedio.getQte_dentro() == null){
			joptFalta(" Quantidade !!! ");
		}else if(remedio.getQue_es() == null){
			joptFalta(" Que es !!! ");
		}else if(remedio.getRm_nombre_comercial() == null){
			joptFalta(" Nombre Comercial!!! ");
		}else if(remedio.getRm_nombre_real() == null){
			joptFalta(" Nombre Real!!! ");
		}else if(remedio.getRm_precio() == null){
			joptFalta(" Falta Precio!!! ");
		}
		else if(remedio.getRm_precio2() == null){
			joptFalta(" Falta Precio 2!!! ");
		}		
		else if(remedio.getRm_precio3() == null){
				joptFalta(" Falta Precio 3!!! ");
		}		
		else if(remedio.getTipo_remedio() == null){
			joptFalta(" Tipo Remedio !!! ");
		}else if(remedio.getUnidad_medida() == null){
			joptFalta(" Unidad Medida !!! ");
		}else{
			resultado = true ;
		}

		return resultado ;
		
	}

	private boolean verificaYaExisteRemedioConCodigoInterno(Remedio remedioCodInterno) {
		
		Remedio r = getRemedioXCodigoInterno(remedioCodInterno);
		
		if(r == null)
			return false ;
		
				
		
		return true ;			
		
	}

	private void jopt(String string) {
		JOptionPane.showMessageDialog(null, string+"\nRemedioService !!!");
		
	}

	private void joptFalta(String string) {
		JOptionPane.showMessageDialog(null,  "Favor Ingressar "+string+"\nRemedioService !!!");
		
	}
	
	@Override
	public boolean actualizar(Remedio remedio) {
		
		boolean resultado = false ;
		
		Transaction transacao = sessao.beginTransaction() ;
		
		
		if( validarCampos(remedio) == true  ){
			if( remedioDAO.actualizarRemedio(remedio)  == true)
			{
				try {
					transacao.commit();
					resultado = true ;
				} catch (Exception e) {
					sou("Problma al Intentar actualizar los Datos !!!");
				}
			}
			else
			{
				transacao.rollback();
			}
			
		}
		else
		{
			jopt("Remedio Nulo o Falta ID para el Remadio !!!");
		}
		
					
		return resultado ;		
		
	}

	@Override
	public boolean salvar(Remedio remedio) {
		
		boolean resultado = false ;
		
		Transaction transacao = sessao.beginTransaction() ;
		
		
		if( validarCampos(remedio) == true  )
		{					
			if( verificaYaExisteRemedioConCodigoInterno(remedio) == true ){
				jopt("Ya existe este Codigo de Remedio Cargado por Favor insira Otro Codigo");
			}
			else
			{				
				if( remedioDAO.salvarRemedio(remedio)  == true)
				{
					try {
						transacao.commit();
						resultado = true ;
					} catch (Exception e) {
						transacao.rollback();
						sou("Problma al Intentar Salvar los Datos !!!");
					}
				}
				else
				{
					transacao.rollback();
				}				
			}			
		}
		else
		{
			jopt("Remedio Nulo o Falta ID para el Remadio !!!");
		}
		
					
		return resultado ;		
				
	}

	@Override
	public List<Remedio> getListaRemedio() {
		return remedioDAO.getListaRemedio() ;
	}

	@Override
	public List<Remedio> getListaRemedioPorMoneda(Moneda moneda) {
		sou("Falta Implementar este Metodo ");
		return null ;
	}

	@Override
	public List<Remedio> getListaRemedioPorUnidadMedida(
			UnidadMedida unidadMedida) {
		sou("Falta Implementar este Metodo ");
		return null ;
	}

	@Override
	public Remedio getRemedioXCodigoInterno(Remedio remedioCodInterno) {
		return remedioDAO.getRemedioXCodigoInterno(remedioCodInterno);
	}

	@Override
	public boolean existeRemedioConCodigoInt(Remedio remedioCodInterno) {
		return remedioDAO.existeRemedioConCodigoInt(remedioCodInterno);
	}

	@Override
	public List<Remedio> getListaRemedioLikeCodigoInterno(
			Remedio proSetProNombre) {
		return remedioDAO.getListaRemedioLikeCodigoInterno(proSetProNombre);
	}

	@Override
	public List<Remedio> getListaRemedioLikeCodigoInternoYMoneda(
			Remedio proSetProNombre, Moneda moneda) {
		sou("Falta Implementar este Metodo ");
		return null ;
	}
	

	@Override
	public List<Remedio> getListaRemedioByExample(Remedio proSetProNombre) {
		sou("Falta Implementar este Metodo ");
		return null ;
	}

	@Override
	public List<Remedio> getListaRemedioPorMarca(Marca marca) {
		sou("Falta Implementar este Metodo ");
		return null ;
	}

	@Override
	public List<Remedio> getListaRemedioPorEmbalaje(Embalaje embalaje) {
		sou("Falta Implementar este Metodo ");
		return null ;
	}

	@Override
	public List<Remedio> getListaRemedioPorClase(Clase clase) {
		sou("Falta Implementar este Metodo ");
		return null ;
	}

}
