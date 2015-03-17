

 package py.com.farmacia.model.dao; 


 import java.util.List;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Droga;
import py.com.farmacia.model.interfaces.InterfaceDrogaDAO;



  public class DrogaDAO implements InterfaceDrogaDAO{




  InterfaceDAO<Droga> drogaDAO ; 
 

  public DrogaDAO(){ 
         super();
  drogaDAO = new HibernateDAO<Droga> (Droga.class);   
 }


 @Override  public Droga getDroga(Integer codigo) { 
   return drogaDAO.getBean(codigo);
}



 @Override  public Droga getDroga(Droga droga) { 
   return drogaDAO.getBean(droga);
}
  @Override  public boolean excluirDroga(Droga droga) { 
   return drogaDAO.excluir(droga);
}
  @Override  public boolean actualizarDroga(Droga droga) { 
   return drogaDAO.actualizar(droga);
}
  @Override  public boolean salvarDroga(Droga droga) { 
   return drogaDAO.salvar(droga);
}
 @Override public List<Droga> getListaDroga() {
 return drogaDAO.getLista();
}

 

}