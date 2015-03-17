package py.com.farmacia.services.interfaces;

import java.util.Date;
import java.util.List;

import py.com.farmacia.model.bean.Cliente;
import py.com.farmacia.model.bean.NroDocumento;
import py.com.farmacia.model.bean.SituacionVenta;
import py.com.farmacia.model.bean.TipoCliente;
import py.com.farmacia.model.bean.TipoVenta;
import py.com.farmacia.model.bean.VentaCab;

public interface VentaService {

    VentaCab getVentaCab(Integer vc_codigo);

    VentaCab getVentaCab(VentaCab ventaCab);
    
    List<VentaCab> getListaVentaCabPorNroDocumento(NroDocumento nroDocumento);    

    boolean excluir(VentaCab codigo);

    boolean actualizar(VentaCab ventaCab);

    boolean salvar(VentaCab ventaCab);

    List<VentaCab> getListaVentaCab();
    
    List<VentaCab> getListaVentaPorClienteFechasSitVentTpProdMoneda(
            Cliente cliente, Date fechaIni, Date fechaFin, SituacionVenta situacionVenta );

    List<VentaCab> getListaVentaPorFechasSitVentTpCliente(
                Date fechaIni,Date fechaFin,SituacionVenta situacionVenta
                , TipoCliente tpCliente) ;
    
    
    
    public List<VentaCab> getListaVentaCabFecha(Date fecha);
    
    public List<VentaCab> getListaVentaCabFechas(Date fechaIni,Date fechaFin );
    
    public List<VentaCab> getListaVentaCabFechas(Date fechaIni,Date fechaFin 
    													, TipoVenta tipoVenta);
    
    public List<VentaCab> getListaVentaCabPorCliente(Cliente cliente
                                                    , SituacionVenta sv_codigo);    
}
