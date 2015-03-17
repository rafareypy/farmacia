

 package py.com.farmacia.model.dao; 


 import py.com.farmacia.model.bean.*;
import py.com.farmacia.model.interfaces.InterfaceCategoriaDAO;
import py.com.farmacia.hibernate.util.*;
import java.util.List;  



  public class CategoriaDAO implements InterfaceCategoriaDAO{




  InterfaceDAO<Categoria> categoriaDAO ; 
 

  public CategoriaDAO(){ 
         super();
         categoriaDAO = new HibernateDAO<Categoria> (Categoria.class);   
 }


 @Override  public Categoria getCategoria(Integer codigo) { 
   return categoriaDAO.getBean(codigo);
}



 @Override  public Categoria getCategoria(Categoria categoria) { 
   return categoriaDAO.getBean(categoria);
}
  @Override  public boolean excluirCategoria(Categoria categoria) { 
   return categoriaDAO.excluir(categoria);
}
  @Override  public boolean actualizarCategoria(Categoria categoria) { 
   return categoriaDAO.actualizar(categoria);
}
  @Override  public boolean salvarCategoria(Categoria categoria) { 
   return categoriaDAO.salvar(categoria);
}
 @Override public List<Categoria> getListaCategoria() {
 return categoriaDAO.getLista();
}

 

}