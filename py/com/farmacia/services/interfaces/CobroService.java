package py.com.farmacia.services.interfaces;

import java.util.Date;
import java.util.List;

import py.com.farmacia.model.bean.Cliente;
import py.com.farmacia.model.bean.CobroCab;
import py.com.farmacia.model.bean.CobroDet;
import py.com.farmacia.model.bean.Moneda;
import py.com.farmacia.model.bean.SituacionPagamento;
import py.com.farmacia.model.bean.SituacionVenta;
import py.com.farmacia.model.bean.VentaCab;

public interface CobroService {

		    List<CobroCab> getListaCobroCabPorCliente(Cliente cliente
		            ,SituacionVenta sv_codigo);
		
		
		List<CobroCab> getListaCobroCabPorVentaCab(VentaCab ventaCab);    
		
		List<CobroCab> getListaCobroCab();
		
		List<CobroCab> getListaCobroCabPorFechaVenc(Date fecha);
		
		List<CobroCab> getListaCobroCabPorFechasVenc(Date fechaIni, Date fachaFin); 
		
		List<CobroCab> getListaCobroCabPorSituacion(
						SituacionPagamento situacionPagamento);
		
		List<CobroCab> getListaCobroCabPorSituacionYMoneda(
						SituacionPagamento situacionPagamento, Moneda moneda) ;  
		
		public List<CobroCab> getListaCobroCabPorListaVentaCab(List<VentaCab> listaVentaCab,
		                SituacionVenta situacionVenta ) ;    
		
		public CobroCab getCobroCab(Integer codigo);
		
		public CobroCab getCobroCab(CobroCab cobroCab);
		
		public boolean salvar(CobroCab cobroCab );
		
		public boolean eliminar(CobroCab cobroCab );
		
		public boolean actualizar(CobroCab cobroCab );
		
		public boolean actualizarSituacionPagamentoCobroCab(
						CobroDet cobro, SituacionPagamento situacionPagamento) ;

	
}
