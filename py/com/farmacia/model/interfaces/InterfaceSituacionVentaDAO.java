package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceSituacionVentaDAO {

SituacionVenta getSituacionVenta(Integer codigo);

SituacionVenta getSituacionVenta( SituacionVenta bean);

boolean excluirSituacionVenta(SituacionVenta bean);

boolean actualizarSituacionVenta(SituacionVenta bean);

boolean salvarSituacionVenta(SituacionVenta bean);

List<SituacionVenta> getListaSituacionVenta();


}

