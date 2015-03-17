package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfacePresentacionDAO {

Presentacion getPresentacion(Integer codigo);

Presentacion getPresentacion( Presentacion bean);

boolean excluirPresentacion(Presentacion bean);

boolean actualizarPresentacion(Presentacion bean);

boolean salvarPresentacion(Presentacion bean);

List<Presentacion> getListaPresentacion();


}

