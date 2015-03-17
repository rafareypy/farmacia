package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceMarcaDAO {

Marca getMarca(Integer codigo);

Marca getMarca( Marca bean);

boolean excluirMarca(Marca bean);

boolean actualizarMarca(Marca bean);

boolean salvarMarca(Marca bean);

List<Marca> getListaMarca();


}

