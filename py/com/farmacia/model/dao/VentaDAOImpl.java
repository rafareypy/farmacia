package py.com.farmacia.model.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.HibernateUtil;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Cliente;
import py.com.farmacia.model.bean.NroDocumento;
import py.com.farmacia.model.bean.SituacionVenta;
import py.com.farmacia.model.bean.TipoCliente;
import py.com.farmacia.model.bean.TipoVenta;
import py.com.farmacia.model.bean.VentaCab;
import py.com.farmacia.model.bean.VentaDetalle;
import py.com.farmacia.model.interfaces.VentaDAO;

public class VentaDAOImpl implements VentaDAO {

	
	InterfaceDAO<VentaCab> ventaDAO ;
	Session sessao  ;
	
	
	public VentaDAOImpl() {
		super();
		ventaDAO = new HibernateDAO<VentaCab>(VentaCab.class);
		sessao = HibernateUtil.getSessao();
	}
	
	@Override
	public VentaCab getVentaCab(Integer vc_codigo) {
		return ventaDAO.getBean(vc_codigo);
	}

	@Override
	public VentaCab getVentaCab(VentaCab ventaCab) {
		
		return ventaDAO.getBean(ventaCab.getVc_codigo());
	}

	@Override
	public List<VentaCab> getListaVentaCabPorNroDocumento(NroDocumento nroDocumento) {
		
		
		try {        	

			StringBuffer hql = new StringBuffer();
			hql.append("from VentaCab vc ")
			.append(" where vc.nroDocumento.nroDocumento = ")
			.append(nroDocumento.getNro_codigo().toString()) ;		
		
			
        	return sessao.createQuery(String.valueOf(hql)).list();
        	
        } catch (Exception e) {
            so("No se encontro Datos en "
                    + "getVentaCabPorNroDocumento(integer nroDocumento)");
            return null;
        }		
		
		
		
	}

	private void so(String string) {
		
		
		System.out.println(" VentaDAOImpl\n " + string);
	}

	@Override
	public boolean excluir(VentaCab codigo) {
		
		jp("No se Puede Excuir una Venta Penas Colcoar como innactivo !!!");
		
		return false ;
	}

	private void jp(String string) {
		JOptionPane.showMessageDialog(null, string+"VentaDAOImpl");
		
	}

	@Override
	public boolean actualizar(VentaCab ventaCab) {
				
		boolean resultado = false ;
		
//		for (VentaDetalle detalle : ventaCab.getLista_detalles()) {			
//			sessao.persist(detalle);			
//		}
		
		try {
			sessao.update(ventaCab);
			resultado = true ;
		} catch (Exception e) {
			so("Problemas al Actualizar La Venta");
		}		
		 
		return resultado ;
		
	}

	@Override
	public boolean salvar(VentaCab ventaCab) {
		
		boolean resultado = false ;
		
//		for (VentaDetalle detalle : ventaCab.getLista_detalles()) {			
//			sessao.persist(detalle);			
//		}
		
		try {
			sessao.save(ventaCab);
			resultado = true ;
		} catch (Exception e) {
			so("Problemas al Guardar La Venta");
		}		
		 
		return resultado ;
		
	}

	@Override
	public List<VentaCab> getListaVentaCab() {
		
		return ventaDAO.getLista();
	}

	@Override
	public List<VentaCab> getListaVentaPorClienteFechasSitVentTpProdMoneda(
			Cliente cliente, Date fechaIni, Date fechaFin,
			SituacionVenta situacionVenta) {
		
		 List<VentaCab> lista = obtnerVentasPorFecha(fechaIni, fechaFin);
		 List<VentaCab> listaAUX = new ArrayList<VentaCab>();		 

		
		for (VentaCab ventaCab : lista) {
			
			if( cliente != null &&  situacionVenta != null){
				
				if( ventaCab.getCli_codigo().getCli_codigo().equals(
						cliente.getCli_codigo()) ){
					
					if( situacionVenta.getSv_codigo().equals(
							ventaCab.getSv_codigo().getSv_codigo()) ){
						listaAUX.add(ventaCab);
					}
					
				}
				
				
			}else if( cliente != null &&  situacionVenta == null ){
				if( ventaCab.getCli_codigo().getCli_codigo().equals(
						cliente.getCli_codigo()) ){
										
						listaAUX.add(ventaCab);
					
				}
				
			}else if( cliente == null &&  situacionVenta != null ){

				if( situacionVenta.getSv_codigo().equals(
						ventaCab.getSv_codigo().getSv_codigo()) ){
					listaAUX.add(ventaCab);
				}
			}else if( cliente == null &&  situacionVenta == null ){

					listaAUX.add(ventaCab);				
			}
			
		}
		return listaAUX ;
	}

	private List<VentaCab> obtnerVentasPorFecha(Date fechaIni, Date fechaFin) {
		
		List<VentaCab> lista = new ArrayList<VentaCab>();
		
		if( fechaIni == null || fechaFin == null ){
			jp("Favor Verificar las Fechas!!");
			return lista ;
		}
			
		 
		Criteria criteria = sessao.createCriteria(VentaCab.class, "vc");
		criteria.add(Restrictions.between("vc.vc_fecha", fechaIni, fechaFin));
		
		
		try {
			lista = criteria.list() ;
		} catch (Exception e) {
				so("No se encontro Datos  - getListaVentaPorClienteFechasSitVentTpProdMoneda " );
		}

		return lista ;
		
	}

	@Override
	public List<VentaCab> getListaVentaPorFechasSitVentTpCliente(
			Date fechaIni, Date fechaFin, SituacionVenta situacionVenta,
			 TipoCliente tpCliente) {
		
		List<VentaCab> lista = obtnerVentasPorFecha(fechaIni, fechaFin);
		List<VentaCab> listaAUX = new ArrayList<VentaCab>();
		
		for (VentaCab ventaCab : lista) {
		
			
			if(  situacionVenta != null && tpCliente != null ){
			
				if( ventaCab.getSv_codigo().getSv_codigo().equals(
						situacionVenta.getSv_codigo()) )
				{				
					if( tpCliente.getTc_codigo().equals(
							ventaCab.getCli_codigo().getTc_codigo().getTc_codigo()))
					{					
						listaAUX.add(ventaCab);					
					}				
				}				
			}
			else if(  situacionVenta == null && tpCliente != null )
			{			
				if( tpCliente.getTc_codigo().equals(
						ventaCab.getCli_codigo().getTc_codigo().getTc_codigo()))
				{				
					listaAUX.add(ventaCab);				
				}			
			}
			else if(  situacionVenta != null && tpCliente == null )
			{			
				if( ventaCab.getSv_codigo().getSv_codigo().equals(
						situacionVenta.getSv_codigo()) )
				{				
					listaAUX.add(ventaCab);				
				}			
			}
			else if(  situacionVenta != null && tpCliente == null )
			{			
					listaAUX.add(ventaCab);							
			}
			
		}
		
		return listaAUX ;
		
	}

	@Override
	public List<VentaCab> getListaVentaCabFecha(Date fecha) {		
		return obtnerVentasPorFecha(fecha, fecha);
	}

	@Override
	public List<VentaCab> getListaVentaCabFechas(Date fechaIni, Date fechaFin) {		
		return obtnerVentasPorFecha(fechaIni, fechaFin);
	}

	@Override
	public List<VentaCab> getListaVentaCabFechas(Date fechaIni, Date fechaFin,
			TipoVenta tipoVenta) {
		
		List<VentaCab> lista = obtnerVentasPorFecha(fechaIni, fechaFin);
		List<VentaCab> listaAUX = new ArrayList<VentaCab>();
		
		for (VentaCab ventaCab : listaAUX) {
			
			if( tipoVenta != null ){
				
				if( ventaCab.getTv_codigo().getTv_codigo().equals(
						tipoVenta.getTv_codigo()))
				{
					listaAUX.add(ventaCab);
				}
				
			}
			else
			{
				listaAUX.add(ventaCab);
			}
			
		}
		
		return listaAUX ;
	}

	@Override
	public List<VentaCab> getListaVentaCabPorCliente(Cliente cliente,
			SituacionVenta sv_codigo) {
		
		List<VentaCab> lista = new ArrayList<VentaCab>();
		
		StringBuilder hql = new StringBuilder(" from VentaCab v");

        if( cliente != null ){
            hql.append("  where v.cli_codigo.cli_codigo = ");
            hql.append(cliente.getCli_codigo().toString());            
        }
        
                
                if( sv_codigo == null   || sv_codigo.getSv_codigo() == null 
                                        || sv_codigo.getSv_codigo() < 0){                    
                }else{                    
                   
                    if( cliente == null ){
                        hql.append(" where v.sv_codigo.sv_codigo =  " )
                        .append(sv_codigo.getSv_codigo().toString());                        
                    }else{
                        hql.append(" and v.sv_codigo.sv_codigo =  " )
                        .append(sv_codigo.getSv_codigo().toString());                       
                    }                    
                }                
                                		
                try {
					lista = sessao.createQuery(String.valueOf(hql)).list();
                } catch (Exception e) {
                	so("No se encontro datos - getListaVentaCabPorCliente ");
				}	
                		
		return lista ;
		
	}

}
