package py.com.farmacia.teste;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import py.com.farmacia.model.bean.CobroCab;
import py.com.farmacia.model.bean.CobroDet;
import py.com.farmacia.model.bean.NroDocumento;
import py.com.farmacia.model.bean.VentaCab;
import py.com.farmacia.model.bean.VentaDetalle;
import py.com.farmacia.model.interfaces.InterfaceCategoriaDAO;
import py.com.farmacia.model.interfaces.InterfaceClaseDAO;
import py.com.farmacia.model.interfaces.InterfaceClienteDAO;
import py.com.farmacia.model.interfaces.InterfaceDistribuidorDAO;
import py.com.farmacia.model.interfaces.InterfaceDrogaDAO;
import py.com.farmacia.model.interfaces.InterfaceEmbalajeDAO;
import py.com.farmacia.model.interfaces.InterfaceEstadoDAO;
import py.com.farmacia.model.interfaces.InterfaceFormaADMDAO;
import py.com.farmacia.model.interfaces.InterfaceFormaPagoDAO;
import py.com.farmacia.model.interfaces.InterfaceLaboratorioDAO;
import py.com.farmacia.model.interfaces.InterfaceMarcaDAO;
import py.com.farmacia.model.interfaces.InterfacePresentacionDAO;
import py.com.farmacia.model.interfaces.InterfaceProcedenciaDAO;
import py.com.farmacia.model.interfaces.InterfaceSituacionCuotaDAO;
import py.com.farmacia.model.interfaces.InterfaceSituacionPagamentoDAO;
import py.com.farmacia.model.interfaces.InterfaceSituacionVentaDAO;
import py.com.farmacia.model.interfaces.InterfaceTipoRemedioDAO;
import py.com.farmacia.model.interfaces.InterfaceTipoVentaDAO;
import py.com.farmacia.model.interfaces.InterfaceUnidadMedidaDAO;
import py.com.farmacia.services.interfaces.RemedioService;
import py.com.farmacia.services.interfaces.VentaService;
import py.com.farmacia.util.Inicializador;

public class InserirVenta {

	
	InterfaceCategoriaDAO 		categoriaDAO 	= Inicializador.getCategoriaDAO();
	InterfaceClaseDAO 			claseDAO 		= Inicializador.getClaseDAO();
	InterfaceDistribuidorDAO	distribuidorDAO	= Inicializador.getDistribuidorDAO();
	InterfaceDrogaDAO			drogaDAO		= Inicializador.getDrogaDAO();
	InterfaceEmbalajeDAO		embalajeDAO 	= Inicializador.getEmbalajeDAO();
	InterfaceEstadoDAO			estadoDAO 		= Inicializador.getEstadoDAO();
	InterfaceFormaADMDAO		formaAdmDAO 	= Inicializador.getFormaAdmDAO();
	InterfaceLaboratorioDAO     laboratorioDAO	= Inicializador.getLaboratorioDAO();
	InterfaceMarcaDAO			marcaDAO 		= Inicializador.getMarcaDAO();
	InterfacePresentacionDAO	presentacionDAO	= Inicializador.getPresentacionDAO() ;
	InterfaceProcedenciaDAO     procedenciaDAO	= Inicializador.getProcedenciaDAO();
	InterfaceTipoRemedioDAO 	tipoRemedioDAO	= Inicializador.getTipoRemedioDAO();
	InterfaceUnidadMedidaDAO   unidadMedidaDAO	= Inicializador.getUnidadMedidaDAO();

	VentaService 				ventaService	= Inicializador.getVentaServiceImpl();
	
	InterfaceClienteDAO			clienteDAO		= Inicializador.getClienteDAO();
	InterfaceFormaPagoDAO       formaPagoDAO	= Inicializador.getFormaPagoDAO();
	RemedioService remedioService = Inicializador.getRemedioServiceImpl();
	InterfaceSituacionVentaDAO  situacionVentaDAO = Inicializador.getSituacionVenta();
	InterfaceTipoVentaDAO		tipoVentaDAO	= Inicializador.getTipoVentaDAO();
	InterfaceSituacionCuotaDAO	situacionCuotaDAO = Inicializador.getSituacionCuotaDAO();
	InterfaceSituacionPagamentoDAO situacionPagamentoDAO = Inicializador.getSituacionPagamentoDAO();
	
	
	
	public InserirVenta() {
		super();
	}
	
	
	public void inserirVetna() {
		Integer codigo = 1 ;
		
		so("Vamos Inserir la Vetna");
		
		VentaCab v = new VentaCab();
		v.setCli_codigo(clienteDAO.getCliente(codigo));
		v.setFp_codigo(formaPagoDAO.getFormaPago(codigo));
		v.setLista_detalles(obtnerListaDetallesVenta());
		v.setSv_codigo(situacionVentaDAO.getSituacionVenta(codigo));
		v.setTv_codigo(tipoVentaDAO.getTipoVenta(codigo));
		v.setVc_fecha(new Date());
		v.setVc_prazo_pago(new Date());
		v.setVc_total_pagar(obtnerTotalPagar(v.getLista_detalles()));
		v.setVc_valor_descriptivo("Valor Descriptivo");
		v.setCc_codigo(obtnerCobro(v));
		v.setNroDocumento(new NroDocumento());
		
		so("Completamos o Objeto com valores");		
		
		if( ventaService.salvar(v) == true ){
			so("Datos Inseridos com exito");
		}
		else
		{
			so("No fue Possibel inserir los datos");
		}
		
		
		VentaCab ventaObtida = ventaService.getVentaCab(v);
		
		
		
		
		
		
	

	}
	
	public CobroCab obtnerCobro(VentaCab v) {
		
		
		CobroCab c = new CobroCab();
		c.setEs_codigo(estadoDAO.getEstado(1));
		c.setLista_cobro_det(obtnerLita());
		c.setSp_codigo(situacionPagamentoDAO.getSituacionPagamento(1));
		c.setVc_cabecera(v);
		
		return c ;
		
	}


	public List<CobroDet> obtnerLita() {
		
		String cd_observacion = "cd_observacion";
		
		List<CobroDet> litaCobroDet = new ArrayList<CobroDet>();
		
		for (int i = 0; i < 3; i++) {
			CobroDet d = new CobroDet();
			d.setCd_entrega(new Double(100.0));
			d.setCd_fecha_pago_cuota(new Date());
			d.setCd_observacion(cd_observacion);
			d.setCd_recibo(cd_observacion);
			d.setCd_saldo(new Double(50.0));
			d.setCd_valor_descritivo(cd_observacion);
			d.setEs_codigo(estadoDAO.getEstado(1));
			d.setSc_codigo(situacionCuotaDAO.getSituacionCuota(1));
			litaCobroDet.add(d);
			
		}
		
		return litaCobroDet ;
		
	}


	public Double obtnerTotalPagar(List<VentaDetalle> lista_detalles) {
	
		Double total = 0.0 ;
		
		for (VentaDetalle ventaDetalle : lista_detalles) {
			total = total + ventaDetalle.getVd_total() ;
		}
		return total ;
	}


	public List<VentaDetalle> obtnerListaDetallesVenta() {

		 List<VentaDetalle> lista = new ArrayList<VentaDetalle>();
		
		for (int i = 0; i < 10; i++) {
			
			VentaDetalle d = new VentaDetalle();
			d.setRemedio(remedioService.getRemedio(1));
			d.setVd_cantidad(3*i);
			d.setVd_precio(new Double(200.0));
			d.setVd_total(d.getVd_precio() * d.getVd_cantidad());
			
			lista.add(d);
			
		}
		
		return lista ;
		
	}


	public void so(String string) {
		System.err.println(string);
		
	}


	public static void main(String[] args) {
		
		InserirVenta i = new InserirVenta();
		i.inserirVetna();
		
	}
	
}
