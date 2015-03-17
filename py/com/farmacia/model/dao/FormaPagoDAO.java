

 package py.com.farmacia.model.dao; 


 import java.util.List;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.FormaPago;
import py.com.farmacia.model.interfaces.InterfaceFormaPagoDAO;



  public class FormaPagoDAO implements InterfaceFormaPagoDAO{




  InterfaceDAO<FormaPago> FormaPagoDAO ; 
 

  public FormaPagoDAO(){ 
         super();
  FormaPagoDAO = new HibernateDAO<FormaPago> (FormaPago.class);   
 }


 @Override  public FormaPago getFormaPago(Integer codigo) { 
   return FormaPagoDAO.getBean(codigo);
}



 @Override  public FormaPago getFormaPago(FormaPago FormaPago) { 
   return FormaPagoDAO.getBean(FormaPago);
}
  @Override  public boolean excluirFormaPago(FormaPago FormaPago) { 
   return FormaPagoDAO.excluir(FormaPago);
}
  @Override  public boolean actualizarFormaPago(FormaPago FormaPago) { 
   return FormaPagoDAO.actualizar(FormaPago);
}
  @Override  public boolean salvarFormaPago(FormaPago FormaPago) { 
   return FormaPagoDAO.salvar(FormaPago);
}
 @Override public List<FormaPago> getListaFormaPago() {
 return FormaPagoDAO.getLista();
}

 

}