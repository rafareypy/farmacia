package py.com.farmacia.services.service;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Transaction;
import org.hibernate.Session;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.HibernateUtil;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Cliente;
import py.com.farmacia.model.bean.CobroCab;
import py.com.farmacia.model.bean.NroDocumento;
import py.com.farmacia.model.bean.SituacionVenta;
import py.com.farmacia.model.bean.TipoCliente;
import py.com.farmacia.model.bean.TipoVenta;
import py.com.farmacia.model.bean.VentaCab;
import py.com.farmacia.model.bean.VentaDetalle;
import py.com.farmacia.model.interfaces.VentaDAO;
import py.com.farmacia.services.interfaces.CobroService;
import py.com.farmacia.services.interfaces.VentaService;
import py.com.farmacia.util.Inicializador;

public class VentaServiceImpl implements VentaService {

	
	VentaDAO ventaDAO  ;
	Session sessao ; 
	CobroService cobroService ;
	InterfaceDAO<NroDocumento> nroDucDAO ;
	public VentaServiceImpl() {
		super();
		ventaDAO = Inicializador.getVentaDAO();
		sessao = HibernateUtil.getSessao();
		cobroService = Inicializador.getCobroServiceImpl();
		nroDucDAO = new HibernateDAO<NroDocumento>(NroDocumento.class);
	}
	
	@Override
	public VentaCab getVentaCab(Integer vc_codigo) {
		return ventaDAO.getVentaCab(vc_codigo);		
	}

	@Override
	public VentaCab getVentaCab(VentaCab ventaCab) {		
		return ventaDAO.getVentaCab(ventaCab);
	}

	@Override
	public List<VentaCab> getListaVentaCabPorNroDocumento(NroDocumento nroDocumento) {
		return ventaDAO.getListaVentaCabPorNroDocumento(nroDocumento);
		
	}

	@Override
	public boolean excluir(VentaCab codigo) {		
		jo("No Si puede excluir una venta Maximo POdes desabilitar !!!");
		return false ;
	}

	private void jo(String message) {
		JOptionPane.showMessageDialog(null, message +"\nVentaServiceImpl");
		
	}

	@Override
	public boolean actualizar(VentaCab ventaCab) {
		
		boolean resultado = false ;
		
		Transaction transacao = sessao.beginTransaction();
		
		if( validarCampos(ventaCab) == true )
		{
			if( ventaCab.getVc_codigo() == null ){
				
			}
			else
			{
				if( ventaDAO.actualizar(ventaCab)== true )
				{				
					try {
						transacao.commit();
						resultado = true ;
					} catch (Exception e) {
						so("actualizar - No se Pudo actualizar !!");
						transacao.rollback();
					}
					
				}
			}
		}
		
		return resultado ;
		
	}

	private void so(String string) {
		System.out.println("VentaService \n"+ string);
		
	}

	private boolean validarCampos(VentaCab ventaCab) {

		boolean resultado = false ;
		
		if( ventaCab == null ){
			jo("Favor Ingressar Una venta  !!");
		}else if( ventaCab.getCli_codigo() == null ){
			jo("Favor Ingressar un Cliente !!!");
		}else if( ventaCab.getFp_codigo() == null ){
			jo("FAvor Ingressar una forma de Pago!!!");
		}else if(ventaCab.getLista_detalles() == null ||
				ventaCab.getLista_detalles().isEmpty() ){
			jo("Favor Ingressar Productos a la Venta");		
		}else if( ventaCab.getSv_codigo() == null ){
			jo("Falta SituacionVenta");
		}else if( ventaCab.getTv_codigo()== null ){
			jo("Falta TipoVenta");
		}else if( ventaCab.getVc_fecha()== null ){
			jo("Falta Ingressar Fecha para la Venta !!!");
		}else if( ventaCab.getVc_total_pagar() == null ){
			jo("Falta Ingressar Total a Pagar !!!");
		}else if( ventaCab.getVc_valor_descriptivo() == null ){
			jo("Falta Ingressar Valor descriptivo !!!");
		}else if( verificaSiYaHayVentaConEstenroDocuMento(ventaCab) == true ) {
			jo("Ya existe una Venta con este Nro de Documento !!!");
		}else if( validarDetallesVenta(ventaCab.getLista_detalles()) == false) {
			
		}else if(validarCobro(ventaCab.getCc_codigo()) == false){
			
		}
		else
		{
			resultado = true ;
		}
		
		return resultado ;
		
	}
	
	
	private boolean validarCobro(CobroCab cc_codigo) {

		boolean resultado = false ;
		
		if(  cc_codigo == null){
			return true ;
		}else if( cc_codigo.getEs_codigo() == null ){
			jo("Por Favor Ingresse Un Estado para este Cobro !!");
		}else if( cc_codigo.getLista_cobro_det() == null 
				|| cc_codigo.getLista_cobro_det().isEmpty() ){
			jo("Falta Detalles del Cobro !!");
		}else if( cc_codigo.getSp_codigo() == null ){
			jo("Falta Situacion Pagamento del Detalle del Cobro !!");
		}else if( cc_codigo.getVc_cabecera() == null ){
			jo("Falta Una Venta para este Cobro !!");	
		}else{
			resultado = true ;
		}
		return resultado ;
	}

	private boolean validarDetallesVenta(List<VentaDetalle> listaVentaDetalle) {
		
		boolean resultado = true ;
		
		if( listaVentaDetalle == null || listaVentaDetalle.isEmpty() ){
			jo(" No hay valores en los Detallhes !!! ");
			resultado = false ;
		}else{
			
		
			
			for (VentaDetalle ventaDetalle : listaVentaDetalle) {
				if( ventaDetalle == null )
				{
					jo("Algun campo falta en Detalle de la Venta !!!");
					resultado = false ;
				}
				else if( ventaDetalle.getRemedio() == null )
				{
					jo("Falta Remedio para la Venta !!!");
					resultado = false ;
				}
				else if( ventaDetalle.getVd_cantidad() == null || 
						ventaDetalle.getVd_cantidad() < 0)
				{
					jo("favor ingresse la cantidad !!!");
					resultado = false ;
				}
				else if( ventaDetalle.getVd_precio() == null  || 
						  ventaDetalle.getVd_precio() < 0)
				{
					jo("verifique los Precios de los Productos !!!");
					resultado = false ;
				}
				else if( ventaDetalle.getVd_total() == null || 
						ventaDetalle.getVd_total() < 0)
				{
					jo("verifique el valor Total !!!");
					resultado = false ;
				}
				
			}
			
		}
		
		return resultado ;
	}

	private boolean verificaSiYaHayVentaConEstenroDocuMento(VentaCab ventaCab) {
		
		List<VentaCab> lista = getListaVentaCabPorNroDocumento(ventaCab.getNroDocumento());
		if(  lista == null || lista.isEmpty())
			return false ;
		
		return true ;
		
	}

	@Override
	public boolean salvar(VentaCab ventaCab) {
		boolean resultado = false ;
		
		Transaction transacao = sessao.beginTransaction();
		
		if( validarCampos(ventaCab) == true )
		{					
			if( ventaDAO.salvar(ventaCab) == true )
			{
				try 
				{
					transacao.commit();
					resultado =  true ;
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
					so("salvar - No se Pudo salar la Venta Junto con Cobro !!");
					transacao.rollback();
					resultado = false ;
				}										
			}		
		}
		return resultado ;
		
	}

	@Override
	public List<VentaCab> getListaVentaCab() {
		
		return ventaDAO.getListaVentaCab();
	}

	@Override
	public List<VentaCab> getListaVentaPorClienteFechasSitVentTpProdMoneda(
			Cliente cliente, Date fechaIni, Date fechaFin,
			SituacionVenta situacionVenta) {
		
		return ventaDAO.getListaVentaPorClienteFechasSitVentTpProdMoneda(
								cliente, fechaIni, fechaFin, situacionVenta);
		
	}

	@Override
	public List<VentaCab> getListaVentaPorFechasSitVentTpCliente(Date fechaIni,
			Date fechaFin, SituacionVenta situacionVenta, TipoCliente tpCliente) {
		
		return ventaDAO.getListaVentaPorFechasSitVentTpCliente(
							fechaIni, fechaFin, situacionVenta, tpCliente);
	}

	@Override
	public List<VentaCab> getListaVentaCabFecha(Date fecha) {		
		return ventaDAO.getListaVentaCabFecha(fecha);		
	}

	@Override
	public List<VentaCab> getListaVentaCabFechas(Date fechaIni, Date fechaFin) {
		return ventaDAO.getListaVentaCabFechas(fechaIni, fechaFin);
		
	}

	@Override
	public List<VentaCab> getListaVentaCabFechas(Date fechaIni, Date fechaFin,
			TipoVenta tipoVenta) {
		return ventaDAO.getListaVentaCabFechas(fechaIni, fechaFin, tipoVenta);
		
	}

	@Override
	public List<VentaCab> getListaVentaCabPorCliente(Cliente cliente,
			SituacionVenta sv_codigo) {
		
		return ventaDAO.getListaVentaCabPorCliente(cliente, sv_codigo);
	}

}
