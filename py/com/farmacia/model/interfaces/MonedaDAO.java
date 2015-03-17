package py.com.farmacia.model.interfaces;

import java.util.List;

import py.com.farmacia.model.bean.Moneda;

public interface MonedaDAO {

	Moneda getMoneda(Integer codigo);
	
	Moneda getMoneda( Moneda bean);
	
	boolean excluirMoneda(Moneda bean);
	
	boolean actualizarMoneda(Moneda bean);
	
	boolean salvarMoneda(Moneda bean);
	
	List<Moneda> getListaMoneda();
}
