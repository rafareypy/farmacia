package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceEstadoDAO {

Estado getEstado(Integer codigo);

Estado getEstado( Estado bean);

boolean excluirEstado(Estado bean);

boolean actualizarEstado(Estado bean);

boolean salvarEstado(Estado bean);

List<Estado> getListaEstado();


}

