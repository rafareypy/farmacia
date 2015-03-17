

 package py.com.farmacia.model.dao; 


 import java.util.List;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Marca;
import py.com.farmacia.model.interfaces.InterfaceMarcaDAO;



  public class MarcaDAO implements InterfaceMarcaDAO{




  InterfaceDAO<Marca> marcaDAO ; 
 

  public MarcaDAO(){ 
         super();
  marcaDAO = new HibernateDAO<Marca> (Marca.class);   
 }


 @Override  public Marca getMarca(Integer codigo) { 
   return marcaDAO.getBean(codigo);
}



 @Override  public Marca getMarca(Marca marca) { 
   return marcaDAO.getBean(marca);
}
  @Override  public boolean excluirMarca(Marca marca) { 
   return marcaDAO.excluir(marca);
}
  @Override  public boolean actualizarMarca(Marca marca) { 
   return marcaDAO.actualizar(marca);
}
  @Override  public boolean salvarMarca(Marca marca) { 
   return marcaDAO.salvar(marca);
}
 @Override public List<Marca> getListaMarca() {
 return marcaDAO.getLista();
}

 

}