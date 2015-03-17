package py.com.farmacia.teste;

import java.util.Date;

import javax.swing.JOptionPane;

import org.hibernate.Transaction;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.HibernateUtil;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Categoria;
import py.com.farmacia.model.bean.Clase;
import py.com.farmacia.model.bean.Cliente;
import py.com.farmacia.model.bean.Distribuidor;
import py.com.farmacia.model.bean.Droga;
import py.com.farmacia.model.bean.Embalaje;
import py.com.farmacia.model.bean.Estado;
import py.com.farmacia.model.bean.FormaADM;
import py.com.farmacia.model.bean.FormaPago;
import py.com.farmacia.model.bean.Laboratorio;
import py.com.farmacia.model.bean.Moneda;
import py.com.farmacia.model.bean.Procedencia;
import py.com.farmacia.model.bean.Remedio;
import py.com.farmacia.model.bean.SituacionCuota;
import py.com.farmacia.model.bean.SituacionPagamento;
import py.com.farmacia.model.bean.SituacionVenta;
import py.com.farmacia.model.bean.TipoRemedio;
import py.com.farmacia.model.bean.TipoVenta;
import py.com.farmacia.model.bean.UnidadMedida;
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
import py.com.farmacia.model.interfaces.MonedaDAO;
import py.com.farmacia.services.interfaces.RemedioService;
import py.com.farmacia.util.Inicializador;

public class InserirValoresBasicos {
	
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
	InterfaceClienteDAO			clienteDAO		= Inicializador.getClienteDAO();
	InterfaceFormaPagoDAO       formaPagoDAO	= Inicializador.getFormaPagoDAO();
	InterfaceSituacionVentaDAO  situacionVentaDAO = Inicializador.getSituacionVenta();
	InterfaceTipoVentaDAO		tipoVentaDAO		= Inicializador.getTipoVentaDAO();
	InterfaceSituacionCuotaDAO  situacionCuotaDAO = Inicializador.getSituacionCuotaDAO();
	InterfaceSituacionPagamentoDAO situacionPagamentoDAO = Inicializador.getSituacionPagamentoDAO();
	MonedaDAO moneDao = Inicializador.getMonedaDAOImpl();
	
	
	
	
	
	RemedioService remedioService = Inicializador.getRemedioServiceImpl();
	
	
	
	public InserirValoresBasicos() {
		super();
	}
	
	
	public void inserirMoneda() {
		
		
		for (int i = 0; i < 5; i++) {
			
			Moneda m = new Moneda();
			m.setMon_nombre("Moneda"+i);
			m.setMon_sigla("M"+i);
			moneDao.salvarMoneda(m);
			
		}

	}
	
	private void inserirSituacuionPagamento() {
	
		
		SituacionPagamento sp = new SituacionPagamento();
		sp.setSp_desc("Pagado");
		
		SituacionPagamento sp2 = new SituacionPagamento();
		sp2.setSp_desc("Pendiente");
		
		
		situacionPagamentoDAO.salvarSituacionPagamento(sp);
		situacionPagamentoDAO.salvarSituacionPagamento(sp2);
		
		
	}
	
	private void inserirSituacionCuota() {

		SituacionCuota s = new SituacionCuota();
	 s.setSc_desc("Pagado");
		
	 SituacionCuota c = new SituacionCuota();
	 c.setSc_desc("Pendiente");	 
	 
	 situacionCuotaDAO.salvarSituacionCuota(s);
	 situacionCuotaDAO.salvarSituacionCuota(c);
	 

	}
	
	private void inserirEstado() {
	
		
		Estado e = new Estado();
		e.setEst_nombre("Activo");
		
		Estado d = new Estado();
		d.setEst_nombre("Inactivo");
		
		estadoDAO.salvarEstado(e);
		
		

	}
	
	private void inserirTipoVenta() {
	
		TipoVenta t = new TipoVenta();
		t.setTv_nombre("Contado");
		
		TipoVenta a = new TipoVenta();
		a.setTv_nombre("Cuota");
		
		tipoVentaDAO.salvarTipoVenta(t);
		tipoVentaDAO.salvarTipoVenta(a);
		
	}
	
	
	private void inserirSituacionVenta() {
	
		
			
			SituacionVenta s = new SituacionVenta();
			s.setSv_desc("Activo");
			
			SituacionVenta v = new SituacionVenta();
			v.setSv_desc("Inactivo");


			situacionVentaDAO.salvarSituacionVenta(s);
			situacionVentaDAO.salvarSituacionVenta(v);
			
	}
	
	
public void guardarRemedio(String codigoInterno){
		
		Integer codigo = 11 ;
		
		Remedio r = new Remedio();
		r.setDroga(drogaDAO.getDroga(11));
		r.setEmbalaje(embalajeDAO.getEmbalaje(codigo));
		r.setFecha_produccion(new Date());
		r.setFecha_retirada(new Date());
		r.setFecha_vencimiento(new Date());
		r.setFormaADM(formaAdmDAO.getFormaADM(codigo));
		r.setLaboratorio(laboratorioDAO.getLaboratorio(1));
		r.setProcedencia(procedenciaDAO.getProcedencia(codigo));
		r.setQte_dentro(1000);
		r.setQue_es("asdfas");

		r.setRm_nombre_comercial(new String("Nombre Comercial")); 
		r.setRm_nombre_real(new String("Nombre Real"));
		r.setRm_precio(new Double(100.0));
		r.setRm_precio2(new Double(100.0 *2));
		r.setRm_precio3(new Double(100.0*3));
		r.setRm_codigo_interno(codigoInterno);
		r.setTipo_remedio(tipoRemedioDAO.getTipoRemedio(codigo));
		r.setUnidad_medida(unidadMedidaDAO.getUnidadMedida(codigo));
		
		
		if( remedioService.salvar(r) == true ){
			System.out.println("Deu certinho");
		}else{
			System.out.println("Nao funciono");
		}
		
		
		
		
	}
	

	
	private void inserirFormaPago() {
	
		
		for (int i = 0; i < 10; i++) {
			FormaPago f = new FormaPago();
			f.setFp_desc("FormaPago"+i);
			formaPagoDAO.salvarFormaPago(f);
		}

	}
	
	private void inserirCliente() {
	
		for (int i = 0; i < 30; i++) {
			
			Cliente c  = new Cliente();
			c.setCli_codigo_interno("codigo"+i);
			c.setCli_nombre("NOmbre000"+i);
			clienteDAO.salvarCliente(c);
		}
		

	}
	
	private void isnerirProcedencia() {
	
		for (int i = 0; i < 20; i++) {
			
			Procedencia bean = new Procedencia();
			bean.setPrc_nombre("procedencia"+i);
			procedenciaDAO.salvarProcedencia(bean);
			
		}
		

	}
	
	
	private void inserirLaboratorio() {
	
		
		for (int i = 0; i < 10; i++) {
			
			Laboratorio laboratorio = new Laboratorio();
			laboratorio.setLb_descripcion("la,boratorio " + i);
			
			laboratorioDAO.salvarLaboratorio(laboratorio);
			
		}

	}
	
	private void inserirFormaADM() {
	
		
		for (int i = 0; i < 50; i++) {
			
			FormaADM formaADM = new FormaADM();
			formaADM.setFrm_desc(""+i);
			
			formaAdmDAO.salvarFormaADM(formaADM);
			
			
		}

	}
	
	private void inserirUNidadMedida() {
	
		
		for (int i = 0; i < 10; i++) {
			UnidadMedida remedio = new UnidadMedida();
			remedio.setDescripcion("UnidadMedida"+i);
			unidadMedidaDAO.salvarUnidadMedida(remedio);
			
			
		}
		

	}
	
	private void inserirTipoRemedio() {
	
		
		
		for (int i = 0; i < 10; i++) {
			TipoRemedio remedio = new TipoRemedio();
			remedio.setTr_nombre("TipoRemedio"+i);
			tipoRemedioDAO.salvarTipoRemedio(remedio);
			
			
		}
		

	}
	
	
	private void inserirEmbalaje() {
	
		for (int i = 0; i < 10; i++) {
			Embalaje embalaje = new Embalaje();
			embalaje.setEmb_nombre("Embalaje"+i);
			embalajeDAO.salvarEmbalaje(embalaje);
		}
		
	}
	
	private void inserirDroga() {
	
		
		
		
		
//		String nombre = JOptionPane.showInputDialog("");
		
		
		
		for (int i = 0; i < 50; i++) {
			Droga droga = new Droga();
			droga.setDg_descripcion("Droga " +i);
			droga.setDg_nombre("Nombre"+i);
			drogaDAO.salvarDroga(droga);
			
			
		}
			
		
		
	}
	
	private void inserirCategoria() {
	
		for (int i = 0; i < 10; i++) {
			Categoria c = new Categoria();
			c.setCat_desc("Categoria"+i);
			categoriaDAO.salvarCategoria(c);
		}
		
	}
	
	
	private void inserirClasse() {
		
		for (int i = 0; i < 10; i++) {
			Clase c = new Clase();
			c.setCla_nombre(""+i);
			claseDAO.salvarClase(c);
		}	

	}
	
	
	private void inserirDistribuidor() {
	
		for (int i = 0; i < 10; i++) {
			Distribuidor c = new Distribuidor();
			c.setDis_nombre(""+i);
			distribuidorDAO.salvarDistribuidor(c);
		}	
		
	}
	
	
	public void excutarTudo() {
	
		Transaction transacao = HibernateUtil.getSessao().beginTransaction();
		
		
		for (int u = 0; u < 30; u++) {
			InserirValoresBasicos i = new InserirValoresBasicos();
		
			i.inserirCategoria();
			i.inserirClasse();
			i.inserirDistribuidor();
			i.inserirDroga();
			i.inserirEmbalaje();
			i.inserirTipoRemedio();
			i.inserirUNidadMedida();
			i.inserirFormaADM();
			i.inserirLaboratorio();
			i.isnerirProcedencia();
			i.inserirCliente();
					
			i.inserirSituacionVenta();
			i.inserirTipoVenta();
			i.inserirEstado();
			
			
			i.inserirSituacionCuota();
			i.inserirFormaPago();
			i.inserirSituacuionPagamento();
			i.inserirMoneda();
			
			
			
			
		}
		
		
		
		try {
			transacao.commit();
			System.out.println("Funciono beleza");
		} catch (Exception e) {
			System.out.println("NO Funciono");
			transacao.rollback();
		}
		
		
		
		InserirValoresBasicos t = new InserirValoresBasicos();
		for (int i = 0; i < 10; i++) {
			t.guardarRemedio(""+i);
		}

	}
	
	
	public static void main(String[] args) {
		
		
		InserirValoresBasicos i = new InserirValoresBasicos();
		i.excutarTudo();
		

	}
	
}

