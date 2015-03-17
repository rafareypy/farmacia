package py.com.farmacia.teste;

import java.util.Date;

import org.hibernate.Transaction;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.HibernateUtil;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Droga;
import py.com.farmacia.model.bean.Remedio;
import py.com.farmacia.model.dao.DrogaDAO;
import py.com.farmacia.model.interfaces.InterfaceCategoriaDAO;
import py.com.farmacia.model.interfaces.InterfaceClaseDAO;
import py.com.farmacia.model.interfaces.InterfaceDistribuidorDAO;
import py.com.farmacia.model.interfaces.InterfaceDrogaDAO;
import py.com.farmacia.model.interfaces.InterfaceEmbalajeDAO;
import py.com.farmacia.model.interfaces.InterfaceEstadoDAO;
import py.com.farmacia.model.interfaces.InterfaceFormaADMDAO;
import py.com.farmacia.model.interfaces.InterfaceLaboratorioDAO;
import py.com.farmacia.model.interfaces.InterfaceMarcaDAO;
import py.com.farmacia.model.interfaces.InterfacePresentacionDAO;
import py.com.farmacia.model.interfaces.InterfaceProcedenciaDAO;
import py.com.farmacia.model.interfaces.InterfaceTipoRemedioDAO;
import py.com.farmacia.model.interfaces.InterfaceUnidadMedidaDAO;
import py.com.farmacia.services.interfaces.RemedioService;
import py.com.farmacia.util.Inicializador;

public class TesteRemedio {

	
	RemedioService remedioService = Inicializador.getRemedioServiceImpl();
	

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
	InterfaceTipoRemedioDAO 	tipoRemedioDAO  = Inicializador.getTipoRemedioDAO();
	InterfaceUnidadMedidaDAO 	unidadMedidaDAO	= Inicializador.getUnidadMedidaDAO();
	
	
		
	
	public TesteRemedio() {
		super();
		
	}
	
	
	
	
	public void guardarRemedio(){
		
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
		r.setRm_codigo_interno("qw");
		r.setTipo_remedio(tipoRemedioDAO.getTipoRemedio(codigo));
		r.setUnidad_medida(unidadMedidaDAO.getUnidadMedida(codigo));
		

		
		InterfaceDAO<Remedio> remedioDAO = new HibernateDAO<Remedio>(Remedio.class);
		
		
		
		if( remedioService.salvar(r) == true ){
			System.out.println("Deu certinho");
		}else{
			System.out.println("Nao funciono");
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		TesteRemedio t = new TesteRemedio();
		t.guardarRemedio();
		
	}
	
}
