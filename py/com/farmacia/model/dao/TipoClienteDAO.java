

 package py.com.farmacia.model.dao; 


 import py.com.farmacia.model.bean.*;
import py.com.farmacia.model.interfaces.InterfaceTipoClienteDAO;
import py.com.farmacia.hibernate.util.*; import java.util.List;  



  public class TipoClienteDAO implements InterfaceTipoClienteDAO{




  InterfaceDAO<TipoCliente> TipoClienteDAO ; 
 

  public TipoClienteDAO(){ 
         super();
  TipoClienteDAO = new HibernateDAO<TipoCliente> (TipoCliente.class);   
 }


 @Override  public TipoCliente getTipoCliente(Integer codigo) { 
   return TipoClienteDAO.getBean(codigo);
}



 @Override  public TipoCliente getTipoCliente(TipoCliente TipoCliente) { 
   return TipoClienteDAO.getBean(TipoCliente);
}
  @Override  public boolean excluirTipoCliente(TipoCliente TipoCliente) { 
   return TipoClienteDAO.excluir(TipoCliente);
}
  @Override  public boolean actualizarTipoCliente(TipoCliente TipoCliente) { 
   return TipoClienteDAO.actualizar(TipoCliente);
}
  @Override  public boolean salvarTipoCliente(TipoCliente TipoCliente) { 
   return TipoClienteDAO.salvar(TipoCliente);
}
 @Override public List<TipoCliente> getListaTipoCliente() {
 return TipoClienteDAO.getLista();
}

 

}