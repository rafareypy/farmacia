package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceUsuarioDAO {

Usuario getUsuario(Integer codigo);

Usuario getUsuario( Usuario bean);

boolean excluirUsuario(Usuario bean);

boolean actualizarUsuario(Usuario bean);

boolean salvarUsuario(Usuario bean);

List<Usuario> getListaUsuario();


}

