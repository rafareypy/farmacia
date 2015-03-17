

 package py.com.farmacia.model.dao; 


 import py.com.farmacia.model.bean.*;
import py.com.farmacia.model.interfaces.InterfaceTipoVentaDAO;
import py.com.farmacia.hibernate.util.*; import java.util.List;  



  public class TipoVentaDAO implements InterfaceTipoVentaDAO{




  InterfaceDAO<TipoVenta> TipoVentaDAO ; 
 

  public TipoVentaDAO(){ 
         super();
  TipoVentaDAO = new HibernateDAO<TipoVenta> (TipoVenta.class);   
 }


 @Override  public TipoVenta getTipoVenta(Integer codigo) { 
   return TipoVentaDAO.getBean(codigo);
}



 @Override  public TipoVenta getTipoVenta(TipoVenta TipoVenta) { 
   return TipoVentaDAO.getBean(TipoVenta);
}
  @Override  public boolean excluirTipoVenta(TipoVenta TipoVenta) { 
   return TipoVentaDAO.excluir(TipoVenta);
}
  @Override  public boolean actualizarTipoVenta(TipoVenta TipoVenta) { 
   return TipoVentaDAO.actualizar(TipoVenta);
}
  @Override  public boolean salvarTipoVenta(TipoVenta TipoVenta) { 
   return TipoVentaDAO.salvar(TipoVenta);
}
 @Override public List<TipoVenta> getListaTipoVenta() {
 return TipoVentaDAO.getLista();
}

 

}