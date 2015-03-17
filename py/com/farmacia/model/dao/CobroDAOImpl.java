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
import py.com.farmacia.model.bean.CobroCab;
import py.com.farmacia.model.bean.CobroDet;
import py.com.farmacia.model.bean.VentaCab;
import py.com.farmacia.model.interfaces.CobroDAO;

public class CobroDAOImpl implements CobroDAO {

	
	InterfaceDAO<CobroCab> cobroCabDAO = null ;
	Session sessao = null ;
	
	
	public CobroDAOImpl() {
		super();
		cobroCabDAO = new HibernateDAO<CobroCab>(CobroCab.class);
		sessao = HibernateUtil.getSessao() ;
	}
	
	@Override
	public CobroCab getCobroCab(Integer codigo) {
		
		return cobroCabDAO.getBean(codigo);
	}

	@Override
	public CobroCab getCobroCab(CobroCab bean) {
		return cobroCabDAO.getBean(bean.getCc_codigo());		
	}

	@Override
	public boolean excluirCobroCab(CobroCab bean) {
		return cobroCabDAO.excluir(bean);		
	}

	@Override
	public boolean actualizarCobroCab(CobroCab bean) {
		return cobroCabDAO.actualizar(bean);	
	}

	@Override
	public boolean salvarCobroCab(CobroCab bean) {
		
		if( bean.getLista_cobro_det() == null 
				|| bean.getLista_cobro_det().isEmpty() )
		{
			jo("Favor ingressar Valores para Delles del Cobro");
			return false ;
		}
		
//		for (CobroDet cobroDet : bean.getLista_cobro_det()) {
//			sessao.persist(cobroDet);
//		}
		
		return cobroCabDAO.salvar(bean) ;
		
	}

	private void jo(String string) {
		JOptionPane.showMessageDialog(null, string+" \n CobroDAOImpl !!! ");		
	}

	@Override
	public List<CobroCab> getListaCobroCab() {
		
		return cobroCabDAO.getLista();
	}

	@Override
	public List<CobroCab> getListaCobroCabPorFechas(Date fechaIni, Date fechaFin) {
		
		
		List<CobroCab> lista = new ArrayList<CobroCab>();
		
		if( fechaIni == null || fechaFin == null ){
			jp("Favor Verificar las Fechas!!");
			return lista ;
		}
					 
		Criteria criteria = sessao.createCriteria(CobroCab.class, "cc");
		criteria.add(Restrictions.between("cc.vc_cabecera.vc_fecha", fechaIni, fechaFin));	
		
		try {
			lista = criteria.list() ;
		} catch (Exception e) {
				System.out.println(" CobroDAOImpl \n No se encontro Datos  - getListaVentaPorClienteFechasSitVentTpProdMoneda " );
		}

		return lista ;
		
	}

	private void jp(String string) {
		JOptionPane.showMessageDialog(null, string+" CobroDAOImpl ");
		
	}

}
