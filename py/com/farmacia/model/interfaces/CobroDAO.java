package py.com.farmacia.model.interfaces;

import java.util.Date;
import java.util.List;

import py.com.farmacia.model.bean.CobroCab;


public interface CobroDAO {

	
	CobroCab getCobroCab(Integer codigo);

	CobroCab getCobroCab( CobroCab bean);

	boolean excluirCobroCab(CobroCab bean);

	boolean actualizarCobroCab(CobroCab bean);

	boolean salvarCobroCab(CobroCab bean);

	List<CobroCab> getListaCobroCab();
	
	List<CobroCab> getListaCobroCabPorFechas(Date fechaIni, Date fechaFin);

}
