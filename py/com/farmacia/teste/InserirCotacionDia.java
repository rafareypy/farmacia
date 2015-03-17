package py.com.farmacia.teste;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import py.com.farmacia.model.bean.Cotacion;
import py.com.farmacia.model.interfaces.CotacionDAO;
import py.com.farmacia.model.interfaces.MonedaDAO;
import py.com.farmacia.services.interfaces.CotacionService;
import py.com.farmacia.util.Inicializador;

public class InserirCotacionDia {

	
	MonedaDAO monedaDAO = Inicializador.getMonedaDAOImpl();
	CotacionService cotacionService = Inicializador.getCotacionServiceImpl();
	
	public InserirCotacionDia() {
		super();
		
	}
	
	
	
	private void inserirCotacionDia(Date fecha) {
		
		
		Date fechaAUX = fecha ;
		fechaAUX.setDate(fecha.getDate()+4);
		
		for (int i = 0; i < 3; i++) {
			Cotacion c = new Cotacion();
			c.setMon_codigo(monedaDAO.getMoneda(1));			
			c.setCo_cotacion(new Double(1000.0 *1));			
			c.setCot_fecha(fechaAUX);
			if(cotacionService.salvarCotacion(c)== true)
			{
				System.out.println("Inserido Cotacion ");
			}
			else
			{
				System.out.println("Nao foi inserido a merda da cotacion ");	
			}
			
		}

	}
	
	
	public  void buscarCotacionDelDia() {
	
		Date fechaAUX = new Date() ;
		fechaAUX.setDate(fechaAUX.getDate()+4);
		
		List<Cotacion> listaCotacion = cotacionService.getListaCotacion(fechaAUX);
		jo("Tamano de la lsita de cotaicon " + listaCotacion.size());
		
		

	}
	
	
	private void jo(String string) {
		JOptionPane.showMessageDialog(null, string);
		
	}



	public static void main(String[] args) {
		
		InserirCotacionDia i = new InserirCotacionDia();
		i.inserirCotacionDia(new Date());
		i.buscarCotacionDelDia();
		
		
		
	}
	
}
