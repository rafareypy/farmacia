

 package py.com.farmacia.model.dao; 


 import py.com.farmacia.model.bean.*;
import py.com.farmacia.model.interfaces.InterfaceCiudadDAO;
import py.com.farmacia.hibernate.util.*; 
import java.util.List;  



  public class CiudadDAO implements InterfaceCiudadDAO{




  InterfaceDAO<Ciudad> ciudadDAO ; 
 

  public CiudadDAO(){ 
         super();
  ciudadDAO = new HibernateDAO<Ciudad> (Ciudad.class);   
 }


 @Override  public Ciudad getCiudad(Integer codigo) { 
   return ciudadDAO.getBean(codigo);
}



 @Override  public Ciudad getCiudad(Ciudad ciudad) { 
   return ciudadDAO.getBean(ciudad);
}
  @Override  public boolean excluirCiudad(Ciudad ciudad) { 
   return ciudadDAO.excluir(ciudad);
}
  @Override  public boolean actualizarCiudad(Ciudad ciudad) { 
   return ciudadDAO.actualizar(ciudad);
}
  @Override  public boolean salvarCiudad(Ciudad ciudad) { 
   return ciudadDAO.salvar(ciudad);
}
 @Override public List<Ciudad> getListaCiudad() {
 return ciudadDAO.getLista();
}

 

}