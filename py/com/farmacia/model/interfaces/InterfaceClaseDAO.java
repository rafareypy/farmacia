package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceClaseDAO {

Clase getClase(Integer codigo);

Clase getClase( Clase bean);

boolean excluirClase(Clase bean);

boolean actualizarClase(Clase bean);

boolean salvarClase(Clase bean);

List<Clase> getListaClase();


}

