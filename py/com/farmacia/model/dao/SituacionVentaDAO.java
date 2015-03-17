

 package py.com.farmacia.model.dao; 


 import py.com.farmacia.model.bean.*;
import py.com.farmacia.model.interfaces.InterfaceSituacionVentaDAO;
import py.com.farmacia.hibernate.util.*; import java.util.List;  



  public class SituacionVentaDAO implements InterfaceSituacionVentaDAO{




  InterfaceDAO<SituacionVenta> SituacionVentaDAO ; 
 

  public SituacionVentaDAO(){ 
         super();
  SituacionVentaDAO = new HibernateDAO<SituacionVenta> (SituacionVenta.class);   
 }


 @Override  
 public SituacionVenta getSituacionVenta(Integer codigo) { 
   return SituacionVentaDAO.getBean(codigo);
}



 @Override  public SituacionVenta getSituacionVenta(SituacionVenta SituacionVenta) { 
   return SituacionVentaDAO.getBean(SituacionVenta);
}
  @Override  public boolean excluirSituacionVenta(SituacionVenta SituacionVenta) { 
   return SituacionVentaDAO.excluir(SituacionVenta);
}
  @Override  public boolean actualizarSituacionVenta(SituacionVenta SituacionVenta) { 
   return SituacionVentaDAO.actualizar(SituacionVenta);
}
  @Override  public boolean salvarSituacionVenta(SituacionVenta SituacionVenta) { 
   return SituacionVentaDAO.salvar(SituacionVenta);
}
 @Override public List<SituacionVenta> getListaSituacionVenta() {
 return SituacionVentaDAO.getLista();
}

 

}