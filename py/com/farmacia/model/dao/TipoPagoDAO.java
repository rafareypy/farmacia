

 package py.com.farmacia.model.dao; 


 import py.com.farmacia.model.bean.*;
import py.com.farmacia.model.interfaces.InterfaceTipoPagoDAO;
import py.com.farmacia.hibernate.util.*; import java.util.List;  



  public class TipoPagoDAO implements InterfaceTipoPagoDAO{




  InterfaceDAO<TipoPago> TipoPagoDAO ; 
 

  public TipoPagoDAO(){ 
         super();
  TipoPagoDAO = new HibernateDAO<TipoPago> (TipoPago.class);   
 }


 @Override  public TipoPago getTipoPago(Integer codigo) { 
   return TipoPagoDAO.getBean(codigo);
}



 @Override  public TipoPago getTipoPago(TipoPago TipoPago) { 
   return TipoPagoDAO.getBean(TipoPago);
}
  @Override  public boolean excluirTipoPago(TipoPago TipoPago) { 
   return TipoPagoDAO.excluir(TipoPago);
}
  @Override  public boolean actualizarTipoPago(TipoPago TipoPago) { 
   return TipoPagoDAO.actualizar(TipoPago);
}
  @Override  public boolean salvarTipoPago(TipoPago TipoPago) { 
   return TipoPagoDAO.salvar(TipoPago);
}
 @Override public List<TipoPago> getListaTipoPago() {
 return TipoPagoDAO.getLista();
}

 

}