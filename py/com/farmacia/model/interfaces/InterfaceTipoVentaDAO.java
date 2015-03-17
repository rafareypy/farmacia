package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceTipoVentaDAO {

TipoVenta getTipoVenta(Integer codigo);

TipoVenta getTipoVenta( TipoVenta bean);

boolean excluirTipoVenta(TipoVenta bean);

boolean actualizarTipoVenta(TipoVenta bean);

boolean salvarTipoVenta(TipoVenta bean);

List<TipoVenta> getListaTipoVenta();


}

