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
import py.com.farmacia.model.bean.Cotacion;
import py.com.farmacia.model.bean.VentaCab;
import py.com.farmacia.model.interfaces.CotacionDAO;

public class CotacionDAOImpl implements CotacionDAO {

	
	InterfaceDAO<Cotacion> cotacionDAO ;
	Session session  ;
	
	public CotacionDAOImpl() {
		super();
		cotacionDAO = new HibernateDAO<Cotacion>(Cotacion.class);
		session 	= HibernateUtil.getSessao(); 
	}
	
	@Override
	public Cotacion getCotacion(Integer codigo) {
		
		return cotacionDAO.getBean(codigo);
	}

	@Override
	public Cotacion getCotacion(Cotacion bean) {
		return cotacionDAO.getBean(bean.getCot_codigo());
		
	}

	@Override
	public boolean excluirCotacion(Cotacion bean) {
		return cotacionDAO.excluir(bean);
		
	}

	@Override
	public boolean actualizarCotacion(Cotacion bean) {
		
		return cotacionDAO.actualizar(bean);
	}

	@Override
	public boolean salvarCotacion(Cotacion bean) {
		return cotacionDAO.salvar(bean);
		
	}

	@Override
	public List<Cotacion> getListaCotacion() {
		return cotacionDAO.getLista();
		
	}

	@Override
	public List<Cotacion> getListaCotacionFechas(Date fechaIni, Date fechaFin) {
		
		jop("Falta Implementar el Metodo  getListaCotacionFechas");
		return getListaCotacion(fechaIni) ;
	}

	private void jop(String string) {
		JOptionPane.showMessageDialog(null, string+" \nCotacionDAO ");		
	}

	@Override
	public List<Cotacion> getListaCotacion(Date fecha) {
		
		List<Cotacion> lista = new ArrayList<Cotacion>();
		
		Criteria criteria = session.createCriteria(Cotacion.class, "c");
		criteria.add(Restrictions.between("c.cot_fecha", fecha, fecha));
		

		try {
			lista = criteria.list() ;
		} catch (Exception e) {
				so("No se encontro Datos  - getListaCotacion " );
		}

		return lista ;

		
	}

	private void so(String string) {
		System.out.println("CotacionDAO " + string );
		
	}

}
