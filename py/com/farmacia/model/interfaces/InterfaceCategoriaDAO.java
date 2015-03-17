package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceCategoriaDAO {

Categoria getCategoria(Integer codigo);

Categoria getCategoria( Categoria bean);

boolean excluirCategoria(Categoria bean);

boolean actualizarCategoria(Categoria bean);

boolean salvarCategoria(Categoria bean);

List<Categoria> getListaCategoria();


}

