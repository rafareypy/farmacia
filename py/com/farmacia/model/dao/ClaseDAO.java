

 package py.com.farmacia.model.dao; 


 import py.com.farmacia.model.bean.*;
import py.com.farmacia.model.interfaces.InterfaceClaseDAO;
import py.com.farmacia.hibernate.util.*; import java.util.List;  



  public class ClaseDAO implements InterfaceClaseDAO{




  InterfaceDAO<Clase> claseDAO ; 
 

  public ClaseDAO(){ 
         super();
  claseDAO = new HibernateDAO<Clase> (Clase.class);   
 }


 @Override  public Clase getClase(Integer codigo) { 
   return claseDAO.getBean(codigo);
}



 @Override  public Clase getClase(Clase clase) { 
   return claseDAO.getBean(clase);
}
  @Override  public boolean excluirClase(Clase clase) { 
   return claseDAO.excluir(clase);
}
  @Override  public boolean actualizarClase(Clase clase) { 
   return claseDAO.actualizar(clase);
}
  @Override  public boolean salvarClase(Clase clase) { 
   return claseDAO.salvar(clase);
}
 @Override public List<Clase> getListaClase() {
 return claseDAO.getLista();
}

 

}