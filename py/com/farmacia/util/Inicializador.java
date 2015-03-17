package py.com.farmacia.util;

import py.com.farmacia.model.bean.FormaADM;
import py.com.farmacia.model.bean.SituacionPagamento;
import py.com.farmacia.model.bean.TipoRemedio;
import py.com.farmacia.model.dao.CategoriaDAO;
import py.com.farmacia.model.dao.ClaseDAO;
import py.com.farmacia.model.dao.ClienteDAO;
import py.com.farmacia.model.dao.CobroDAOImpl;
import py.com.farmacia.model.dao.CotacionDAOImpl;
import py.com.farmacia.model.dao.DistribuidorDAO;
import py.com.farmacia.model.dao.DrogaDAO;
import py.com.farmacia.model.dao.EmbalajeDAO;
import py.com.farmacia.model.dao.EstadoDAO;
import py.com.farmacia.model.dao.FormaAdmDAO;
import py.com.farmacia.model.dao.FormaPagoDAO;
import py.com.farmacia.model.dao.LaboratorioDAO;
import py.com.farmacia.model.dao.MarcaDAO;
import py.com.farmacia.model.dao.MonedaDAOImpl;
import py.com.farmacia.model.dao.PresentacionDAO;
import py.com.farmacia.model.dao.ProcedenciaDAO;
import py.com.farmacia.model.dao.RemedioDAO;
import py.com.farmacia.model.dao.SituacionCuotaDAO;
import py.com.farmacia.model.dao.SituacionVentaDAO;
import py.com.farmacia.model.dao.SituacionpagamentoDAO;
import py.com.farmacia.model.dao.TipoRemedioDAO;
import py.com.farmacia.model.dao.TipoVentaDAO;
import py.com.farmacia.model.dao.UnidadMedidaDAO;
import py.com.farmacia.model.dao.VentaDAOImpl;
import py.com.farmacia.model.interfaces.CobroDAO;
import py.com.farmacia.model.interfaces.CotacionDAO;
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
import py.com.farmacia.model.interfaces.InterfaceRemedioDAO;
import py.com.farmacia.model.interfaces.InterfaceSituacionCuotaDAO;
import py.com.farmacia.model.interfaces.InterfaceSituacionPagamentoDAO;
import py.com.farmacia.model.interfaces.InterfaceSituacionVentaDAO;
import py.com.farmacia.model.interfaces.InterfaceTipoRemedioDAO;
import py.com.farmacia.model.interfaces.InterfaceTipoVentaDAO;
import py.com.farmacia.model.interfaces.InterfaceUnidadMedidaDAO;
import py.com.farmacia.model.interfaces.MonedaDAO;
import py.com.farmacia.model.interfaces.VentaDAO;
import py.com.farmacia.services.interfaces.CobroService;
import py.com.farmacia.services.interfaces.CotacionService;
import py.com.farmacia.services.interfaces.RemedioService;
import py.com.farmacia.services.interfaces.VentaService;
import py.com.farmacia.services.service.CobroServiceImpl;
import py.com.farmacia.services.service.CotacionServiceImpl;
import py.com.farmacia.services.service.RemedioServiceImpl;
import py.com.farmacia.services.service.VentaServiceImpl;

public class Inicializador {

	public static InterfaceRemedioDAO getRemedioDAO() {
		return new RemedioDAO();
	}

	public static InterfaceCategoriaDAO getCategoriaDAO() {
		return new CategoriaDAO();
	}

	public static InterfaceClaseDAO getClaseDAO() {
		return new ClaseDAO();
	}

	public static InterfaceDistribuidorDAO getDistribuidorDAO() {
		return new DistribuidorDAO();
	}

	public static InterfaceDrogaDAO getDrogaDAO() {
		return new DrogaDAO() ;
	}

	public static InterfaceEmbalajeDAO getEmbalajeDAO() {
		return new EmbalajeDAO();
	}

	public static InterfaceEstadoDAO getEstadoDAO() {
		return new EstadoDAO() ;
	}

	public static InterfaceFormaADMDAO getFormaAdmDAO() {
		return new FormaAdmDAO() ;
	}

	public static InterfaceLaboratorioDAO getLaboratorioDAO() {
		return new LaboratorioDAO();
	}

	public static InterfaceMarcaDAO getMarcaDAO() {
		return new MarcaDAO();
	}

	public static InterfacePresentacionDAO getPresentacionDAO() {
		return new PresentacionDAO();
	}

	public static InterfaceProcedenciaDAO getProcedenciaDAO() {
		return new ProcedenciaDAO();
	}

	public static RemedioService getRemedioServiceImpl() {
		return new RemedioServiceImpl();
	}

	public static InterfaceTipoRemedioDAO getTipoRemedioDAO() {
		return new TipoRemedioDAO();
	}

	public static InterfaceUnidadMedidaDAO getUnidadMedidaDAO() {
		return new UnidadMedidaDAO();
	}

	public static VentaDAO getVentaDAO() {
		return new VentaDAOImpl();
	}

	public static VentaService getVentaServiceImpl() {
		return new VentaServiceImpl();
	}

	public static InterfaceClienteDAO getClienteDAO() {
		return new ClienteDAO() ;
	}

	public static InterfaceFormaPagoDAO getFormaPagoDAO() {
		return new FormaPagoDAO() ;
	}

	public static InterfaceSituacionVentaDAO getSituacionVenta() {
		return new SituacionVentaDAO();
	}

	public static InterfaceTipoVentaDAO getTipoVentaDAO() {
		return new TipoVentaDAO();
	}

	public static InterfaceSituacionCuotaDAO getSituacionCuotaDAO() {
		return new SituacionCuotaDAO();
	}

	public static InterfaceSituacionPagamentoDAO getSituacionPagamentoDAO() {
		return new SituacionpagamentoDAO();
	}

	public static CobroDAO CobroDAOImpl() {
		return new CobroDAOImpl();
	}

	public static CobroService getCobroServiceImpl() {
		return new CobroServiceImpl();
	}

	public static MonedaDAO getMonedaDAOImpl() {
		return new MonedaDAOImpl();
	}

	public static CotacionDAO getCotacionDAOImpl() {
		return new CotacionDAOImpl();
	}

	public static CotacionService getCotacionServiceImpl() {
		return new CotacionServiceImpl();
	}

}
