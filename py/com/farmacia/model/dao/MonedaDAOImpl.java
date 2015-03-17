package py.com.farmacia.model.dao;

import java.util.List;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Moneda;
import py.com.farmacia.model.interfaces.MonedaDAO;

public class MonedaDAOImpl implements MonedaDAO {

	
	InterfaceDAO<Moneda> monedaDAO ;
	
	public MonedaDAOImpl() {
		super();
		monedaDAO = new HibernateDAO<Moneda>(Moneda.class);
	}
	
	@Override
	public Moneda getMoneda(Integer codigo) {
		return monedaDAO.getBean(codigo);
		
	}

	@Override
	public Moneda getMoneda(Moneda bean) {
		return monedaDAO.getBean(bean);
		
	}

	@Override
	public boolean excluirMoneda(Moneda bean) {
		return monedaDAO.excluir(bean);
		
	}

	@Override
	public boolean actualizarMoneda(Moneda bean) {
		return monedaDAO.actualizar(bean);
		
	}

	@Override
	public boolean salvarMoneda(Moneda bean) {
		
		return monedaDAO.salvar(bean);
	}

	@Override
	public List<Moneda> getListaMoneda() {
		
		return monedaDAO.getLista();
	}

}
