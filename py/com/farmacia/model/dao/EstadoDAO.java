

 package py.com.farmacia.model.dao; 


 import java.util.List;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Estado;
import py.com.farmacia.model.interfaces.InterfaceEstadoDAO;



  public class EstadoDAO implements InterfaceEstadoDAO{




  InterfaceDAO<Estado> estadoDAO ; 
 

  public EstadoDAO(){ 
         super();
  estadoDAO = new HibernateDAO<Estado> (Estado.class);   
 }


 @Override  public Estado getEstado(Integer codigo) { 
   return estadoDAO.getBean(codigo);
}



 @Override  public Estado getEstado(Estado estado) { 
   return estadoDAO.getBean(estado);
}
  @Override  public boolean excluirEstado(Estado estado) { 
   return estadoDAO.excluir(estado);
}
  @Override  public boolean actualizarEstado(Estado estado) { 
   return estadoDAO.actualizar(estado);
}
  @Override  public boolean salvarEstado(Estado estado) { 
   return estadoDAO.salvar(estado);
}
 @Override public List<Estado> getListaEstado() {
 return estadoDAO.getLista();
}

 

}