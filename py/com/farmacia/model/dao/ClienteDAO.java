

 package py.com.farmacia.model.dao; 


 import java.util.List;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Cliente;
import py.com.farmacia.model.interfaces.InterfaceClienteDAO;



  public class ClienteDAO implements InterfaceClienteDAO{




  InterfaceDAO<Cliente> clienteDAO ; 
 

  public ClienteDAO(){ 
         super();
  clienteDAO = new HibernateDAO<Cliente> (Cliente.class);   
 }


 @Override  public Cliente getCliente(Integer codigo) { 
   return clienteDAO.getBean(codigo);
}



 @Override  public Cliente getCliente(Cliente cliente) { 
   return clienteDAO.getBean(cliente);
}
  @Override  public boolean excluirCliente(Cliente cliente) { 
   return clienteDAO.excluir(cliente);
}
  @Override  public boolean actualizarCliente(Cliente cliente) { 
   return clienteDAO.actualizar(cliente);
}
  @Override  public boolean salvarCliente(Cliente cliente) { 
   return clienteDAO.salvar(cliente);
}
 @Override public List<Cliente> getListaCliente() {
 return clienteDAO.getLista();
}

 

}