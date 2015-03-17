

 package py.com.farmacia.model.dao; 


 import java.util.List;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Embalaje;
import py.com.farmacia.model.interfaces.InterfaceEmbalajeDAO;



  public class EmbalajeDAO implements InterfaceEmbalajeDAO{




  InterfaceDAO<Embalaje> embalajeDAO ; 
 

  public EmbalajeDAO(){ 
         super();
         embalajeDAO = new HibernateDAO<Embalaje> (Embalaje.class);   
 }


 @Override  public Embalaje getEmbalaje(Integer codigo) { 
   return embalajeDAO.getBean(codigo);
}



 @Override  public Embalaje getEmbalaje(Embalaje embalaje) { 
   return embalajeDAO.getBean(embalaje);
}
  @Override  public boolean excluirEmbalaje(Embalaje embalaje) { 
   return embalajeDAO.excluir(embalaje);
}
  @Override  public boolean actualizarEmbalaje(Embalaje embalaje) { 
   return embalajeDAO.actualizar(embalaje);
}
  @Override  public boolean salvarEmbalaje(Embalaje embalaje) { 
   return embalajeDAO.salvar(embalaje);
}
 @Override public List<Embalaje> getListaEmbalaje() {
 return embalajeDAO.getLista();
}

 

}