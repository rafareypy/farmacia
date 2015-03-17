package py.com.farmacia.services.service;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

import py.com.farmacia.hibernate.util.HibernateUtil;
import py.com.farmacia.model.bean.Cotacion;
import py.com.farmacia.model.interfaces.CotacionDAO;
import py.com.farmacia.services.interfaces.CotacionService;
import py.com.farmacia.util.Inicializador;

public class CotacionServiceImpl implements CotacionService {

	
	CotacionDAO cotacionDAO ;
	Session sessao ;
	
	
	public CotacionServiceImpl() {
		super();
		cotacionDAO = Inicializador.getCotacionDAOImpl();
		sessao = HibernateUtil.getSessao();
		
	}
	
	@Override
	public Cotacion getCotacion(Integer codigo) {
		return cotacionDAO.getCotacion(codigo);
	}

	@Override
	public Cotacion getCotacion(Cotacion bean) {
		return cotacionDAO.getCotacion(bean);		
	}

	@Override
	public boolean excluirCotacion(Cotacion bean) {
		
		Transaction transaction = sessao.beginTransaction();
		
		boolean resultado = false ;
		
		if(cotacionDAO.excluirCotacion(bean)== true)
		{
			
			try {
				transaction.commit();
				resultado = true ;
			} catch (Exception e) {
				transaction.rollback();
			}
			
		}
	
		return resultado ;
		
	}
	
	

	@Override
	public boolean actualizarCotacion(Cotacion bean) {
		
		Transaction transaction = sessao.beginTransaction();
		
		boolean resultado = false ;
		
		if(cotacionDAO.actualizarCotacion(bean)== true)
		{
			
			try {
				transaction.commit();
				resultado = true ;
			} catch (Exception e) {
				transaction.rollback();
			}
			
		}
	
		return resultado ;
	}

	@Override
	public boolean salvarCotacion(Cotacion bean) {
				
		Transaction transaction = sessao.beginTransaction();
		
		boolean resultado = false ;
		
		
		if(validarCampos(bean) == true)
		{
			if(cotacionDAO.salvarCotacion(bean)== true)
			{
				
				try {
					transaction.commit();
					resultado = true ;
				} catch (Exception e) {
					transaction.rollback();
				}
				
			}
			
		}		
		
		
		return resultado ;
		
	}

	private boolean validarCampos(Cotacion bean) {
				
		boolean resultado = false ;
		
		if( bean == null){
			jo("Por favor Ingresse Una Cotacion !!!");
		}else if( bean.getCo_cotacion() == null ){
			jo("Por favor ingresse un valor para la Cotacion !!!");
		}else if(bean.getCot_fecha() == null){
			jo("Por favor ingresse una fecha para la Cotacion !!!");
		}else if(bean.getMon_codigo() == null){
			jo("Por favor ingresse una Moneda !!!");
		}else {
			resultado = true ;
		}
		
		return resultado ;
	}

	private void jo(String string) {
		JOptionPane.showMessageDialog(null, string);
		
	}

	@Override
	public List<Cotacion> getListaCotacion() {
		return cotacionDAO.getListaCotacion();		
	}

	@Override
	public List<Cotacion> getListaCotacionPorFechas(Date fechaIni, Date fechaFin) {
		return cotacionDAO.getListaCotacionFechas(fechaIni, fechaFin);		
	}

	@Override
	public List<Cotacion> getListaCotacion(Date fecha) {
		return cotacionDAO.getListaCotacion(fecha);
	}

}
