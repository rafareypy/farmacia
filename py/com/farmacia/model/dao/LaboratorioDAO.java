

 package py.com.farmacia.model.dao; 


 import java.util.List;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Laboratorio;
import py.com.farmacia.model.interfaces.InterfaceLaboratorioDAO;



  public class LaboratorioDAO implements InterfaceLaboratorioDAO{




  InterfaceDAO<Laboratorio> laboratorioDAO ; 
 

  public LaboratorioDAO(){ 
         super();
  laboratorioDAO = new HibernateDAO<Laboratorio> (Laboratorio.class);   
 }


 @Override  public Laboratorio getLaboratorio(Integer codigo) { 
   return laboratorioDAO.getBean(codigo);
}



 @Override  public Laboratorio getLaboratorio(Laboratorio laboratorio) { 
   return laboratorioDAO.getBean(laboratorio);
}
  @Override  public boolean excluirLaboratorio(Laboratorio laboratorio) { 
   return laboratorioDAO.excluir(laboratorio);
}
  @Override  public boolean actualizarLaboratorio(Laboratorio laboratorio) { 
   return laboratorioDAO.actualizar(laboratorio);
}
  @Override  public boolean salvarLaboratorio(Laboratorio laboratorio) { 
   return laboratorioDAO.salvar(laboratorio);
}
 @Override public List<Laboratorio> getListaLaboratorio() {
 return laboratorioDAO.getLista();
}

 

}