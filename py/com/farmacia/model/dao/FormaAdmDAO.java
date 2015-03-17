package py.com.farmacia.model.dao;

import java.util.List;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.FormaADM;
import py.com.farmacia.model.interfaces.InterfaceFormaADMDAO;

public class FormaAdmDAO extends AbstratoDAO  implements InterfaceFormaADMDAO {

	
	InterfaceDAO<FormaADM> formaAdmDAO  ;
	
	public FormaAdmDAO() {
		super();
		formaAdmDAO = new HibernateDAO<FormaADM>(FormaADM.class);
	}
	
	@Override
	public FormaADM getFormaADM(Integer codigo) {
		
		return formaAdmDAO.getBean(codigo);
	}

	@Override
	public FormaADM getFormaADM(FormaADM formaad) {
		
		return formaAdmDAO.getBean(formaad.getFrm_codigo());
	}

	@Override
	public boolean excluirFormaADM(FormaADM bean) {
		
		return formaAdmDAO.excluir(bean);
	}

	@Override
	public boolean actualizarFormaADM(FormaADM bean) {
		
		return formaAdmDAO.actualizar(bean);
	}

	@Override
	public boolean salvarFormaADM(FormaADM bean) {
		
		return formaAdmDAO.salvar(bean);
		
	}

	@Override
	public List<FormaADM> getListaFormaADM() {
		return formaAdmDAO.getLista();
		
	}

}
