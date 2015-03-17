

 package py.com.farmacia.model.dao; 


 import py.com.farmacia.model.bean.*;
import py.com.farmacia.model.interfaces.InterfaceUnidadMedidaDAO;
import py.com.farmacia.hibernate.util.*; import java.util.List;  



  public class UnidadMedidaDAO implements InterfaceUnidadMedidaDAO{




  InterfaceDAO<UnidadMedida> UnidadMedidaDAO ; 
 

  public UnidadMedidaDAO(){ 
         super();
  UnidadMedidaDAO = new HibernateDAO<UnidadMedida> (UnidadMedida.class);   
 }


 @Override  public UnidadMedida getUnidadMedida(Integer codigo) { 
   return UnidadMedidaDAO.getBean(codigo);
}



 @Override  public UnidadMedida getUnidadMedida(UnidadMedida UnidadMedida) { 
   return UnidadMedidaDAO.getBean(UnidadMedida);
}
  @Override  public boolean excluirUnidadMedida(UnidadMedida UnidadMedida) { 
   return UnidadMedidaDAO.excluir(UnidadMedida);
}
  @Override  public boolean actualizarUnidadMedida(UnidadMedida UnidadMedida) { 
   return UnidadMedidaDAO.actualizar(UnidadMedida);
}
  @Override  public boolean salvarUnidadMedida(UnidadMedida UnidadMedida) { 
   return UnidadMedidaDAO.salvar(UnidadMedida);
}
 @Override public List<UnidadMedida> getListaUnidadMedida() {
 return UnidadMedidaDAO.getLista();
}

 

}