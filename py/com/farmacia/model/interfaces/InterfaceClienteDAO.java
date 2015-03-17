package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceClienteDAO {

Cliente getCliente(Integer codigo);

Cliente getCliente( Cliente bean);

boolean excluirCliente(Cliente bean);

boolean actualizarCliente(Cliente bean);

boolean salvarCliente(Cliente bean);

List<Cliente> getListaCliente();


}

