package py.com.farmacia.services.interfaces;

import java.util.Date;
import java.util.List;

import py.com.farmacia.model.bean.Cotacion;

public interface CotacionService {
	Cotacion getCotacion(Integer codigo);

	Cotacion getCotacion( Cotacion bean);

	boolean excluirCotacion(Cotacion bean);

	boolean actualizarCotacion(Cotacion bean);

	boolean salvarCotacion(Cotacion bean);

	List<Cotacion> getListaCotacion();
	
	List<Cotacion> getListaCotacion(Date fecha);
	
	List<Cotacion> getListaCotacionPorFechas(Date fechaIni, Date fechaFin);

}
