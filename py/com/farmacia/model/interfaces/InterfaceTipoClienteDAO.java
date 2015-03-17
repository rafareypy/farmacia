package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceTipoClienteDAO {

TipoCliente getTipoCliente(Integer codigo);

TipoCliente getTipoCliente( TipoCliente bean);

boolean excluirTipoCliente(TipoCliente bean);

boolean actualizarTipoCliente(TipoCliente bean);

boolean salvarTipoCliente(TipoCliente bean);

List<TipoCliente> getListaTipoCliente();


}

