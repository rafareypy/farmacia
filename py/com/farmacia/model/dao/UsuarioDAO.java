

 package py.com.farmacia.model.dao; 


 import py.com.farmacia.model.bean.*;
import py.com.farmacia.model.interfaces.InterfaceUsuarioDAO;
import py.com.farmacia.hibernate.util.*; import java.util.List;  



  public class UsuarioDAO implements InterfaceUsuarioDAO{




  InterfaceDAO<Usuario> usuarioDAO ; 
 

  public UsuarioDAO(){ 
         super();
  usuarioDAO = new HibernateDAO<Usuario> (Usuario.class);   
 }


 @Override  public Usuario getUsuario(Integer codigo) { 
   return usuarioDAO.getBean(codigo);
}



 @Override  public Usuario getUsuario(Usuario usuario) { 
   return usuarioDAO.getBean(usuario);
}
  @Override  public boolean excluirUsuario(Usuario usuario) { 
   return usuarioDAO.excluir(usuario);
}
  @Override  public boolean actualizarUsuario(Usuario usuario) { 
   return usuarioDAO.actualizar(usuario);
}
  @Override  public boolean salvarUsuario(Usuario usuario) { 
   return usuarioDAO.salvar(usuario);
}
 @Override public List<Usuario> getListaUsuario() {
 return usuarioDAO.getLista();
}

 

}