

 package py.com.farmacia.model.dao; 


 import py.com.farmacia.model.bean.*;
import py.com.farmacia.model.interfaces.InterfaceDistribuidorDAO;
import py.com.farmacia.hibernate.util.*; import java.util.List;  



  public class DistribuidorDAO implements InterfaceDistribuidorDAO{




  InterfaceDAO<Distribuidor> distribuidorDAO ; 
 

  public DistribuidorDAO(){ 
         super();
  distribuidorDAO = new HibernateDAO<Distribuidor> (Distribuidor.class);   
 }


 @Override  public Distribuidor getDistribuidor(Integer codigo) { 
   return distribuidorDAO.getBean(codigo);
}



 @Override  public Distribuidor getDistribuidor(Distribuidor distribuidor) { 
   return distribuidorDAO.getBean(distribuidor);
}
  @Override  public boolean excluirDistribuidor(Distribuidor distribuidor) { 
   return distribuidorDAO.excluir(distribuidor);
}
  @Override  public boolean actualizarDistribuidor(Distribuidor distribuidor) { 
   return distribuidorDAO.actualizar(distribuidor);
}
  @Override  public boolean salvarDistribuidor(Distribuidor distribuidor) { 
   return distribuidorDAO.salvar(distribuidor);
}
 @Override public List<Distribuidor> getListaDistribuidor() {
 return distribuidorDAO.getLista();
}

 

}