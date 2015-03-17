package py.com.farmacia.model.dao;

import java.util.List;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.TipoRemedio;
import py.com.farmacia.model.interfaces.InterfaceTipoRemedioDAO;

public class TipoRemedioDAO implements InterfaceTipoRemedioDAO {

	
	InterfaceDAO<TipoRemedio> tipoRemedioDAO = new HibernateDAO<TipoRemedio>(TipoRemedio.class);
	
	public void TipoClienteDAO() {
		

	}
	
	@Override
	public TipoRemedio getTipoRemedio(Integer codigo) {
		return tipoRemedioDAO.getBean(codigo);
	}

	@Override
	public TipoRemedio getTipoRemedio(TipoRemedio bean) {
		return tipoRemedioDAO.getBean(bean.getTr_codigo());
	}

	@Override
	public boolean excluirTipoRemedio(TipoRemedio bean) {
		return tipoRemedioDAO.excluir(bean);
	}

	@Override
	public boolean actualizarTipoRemedio(TipoRemedio bean) {
		return tipoRemedioDAO.actualizar(bean);
	}

	@Override
	public boolean salvarTipoRemedio(TipoRemedio bean) {
		return tipoRemedioDAO.salvar(bean);
	}

	@Override
	public List<TipoRemedio> getListaTipoRemedio() {
		return tipoRemedioDAO.getLista();
	}

}
