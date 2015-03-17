

 package py.com.farmacia.model.dao; 


 import java.util.List;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Procedencia;
import py.com.farmacia.model.interfaces.InterfaceProcedenciaDAO;



  public class ProcedenciaDAO implements InterfaceProcedenciaDAO{




  InterfaceDAO<Procedencia> procedenciaDAO ; 
 

  public ProcedenciaDAO(){ 
         super();
  procedenciaDAO = new HibernateDAO<Procedencia> (Procedencia.class);   
 }


 @Override  public Procedencia getProcedencia(Integer codigo) { 
   return procedenciaDAO.getBean(codigo);
}



 @Override  public Procedencia getProcedencia(Procedencia procedencia) { 
   return procedenciaDAO.getBean(procedencia);
}
  @Override  public boolean excluirProcedencia(Procedencia procedencia) { 
   return procedenciaDAO.excluir(procedencia);
}
  @Override  public boolean actualizarProcedencia(Procedencia procedencia) { 
   return procedenciaDAO.actualizar(procedencia);
}
  @Override  public boolean salvarProcedencia(Procedencia procedencia) { 
   return procedenciaDAO.salvar(procedencia);
}
 @Override public List<Procedencia> getListaProcedencia() {
 return procedenciaDAO.getLista();
}

 

}