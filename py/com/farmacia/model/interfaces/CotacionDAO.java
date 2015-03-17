package py.com.farmacia.model.interfaces;

import java.util.Date;
import java.util.List;

import py.com.farmacia.model.bean.Cotacion;

public interface CotacionDAO {
	Cotacion getCotacion(Integer codigo);

	Cotacion getCotacion( Cotacion bean);

	boolean excluirCotacion(Cotacion bean);

	boolean actualizarCotacion(Cotacion bean);

	boolean salvarCotacion(Cotacion bean);

	List<Cotacion> getListaCotacion();
	
	List<Cotacion> getListaCotacion(Date fecha);	
	
	List<Cotacion> getListaCotacionFechas(Date fechaIni, Date fechaFin);

}
