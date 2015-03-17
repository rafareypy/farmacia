

 package py.com.farmacia.model.dao; 


 import java.util.List;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Presentacion;
import py.com.farmacia.model.interfaces.InterfacePresentacionDAO;



  public class PresentacionDAO implements InterfacePresentacionDAO{




  InterfaceDAO<Presentacion> presentacionDAO ; 
 

  public PresentacionDAO(){ 
         super();
  presentacionDAO = new HibernateDAO<Presentacion> (Presentacion.class);   
 }


 @Override  public Presentacion getPresentacion(Integer codigo) { 
   return presentacionDAO.getBean(codigo);
}



 @Override  public Presentacion getPresentacion(Presentacion presentacion) { 
   return presentacionDAO.getBean(presentacion);
}
  @Override  public boolean excluirPresentacion(Presentacion presentacion) { 
   return presentacionDAO.excluir(presentacion);
}
  @Override  public boolean actualizarPresentacion(Presentacion presentacion) { 
   return presentacionDAO.actualizar(presentacion);
}
  @Override  public boolean salvarPresentacion(Presentacion presentacion) { 
   return presentacionDAO.salvar(presentacion);
}
 @Override public List<Presentacion> getListaPresentacion() {
 return presentacionDAO.getLista();
}

 

}