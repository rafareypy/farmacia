

 package py.com.farmacia.model.dao; 


 import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import py.com.farmacia.hibernate.util.HibernateDAO;
import py.com.farmacia.hibernate.util.HibernateUtil;
import py.com.farmacia.hibernate.util.InterfaceDAO;
import py.com.farmacia.model.bean.Remedio;
import py.com.farmacia.model.bean.UnidadMedida;
import py.com.farmacia.model.interfaces.InterfaceRemedioDAO;



  public class RemedioDAO implements InterfaceRemedioDAO{




  InterfaceDAO<Remedio> remedioDAO ; 
 
  Session sessao = null ;

  public RemedioDAO(){ 
         super();
         remedioDAO = new HibernateDAO<Remedio> (Remedio.class);  
         sessao = HibernateUtil.getSessao();
 }


 @Override  public Remedio getRemedio(Integer codigo) { 
   return remedioDAO.getBean(codigo);
}



 @Override  public Remedio getRemedio(Remedio remedio) { 
   return remedioDAO.getBean(remedio.getRm_codigo());
}
  @Override  public boolean excluirRemedio(Remedio remedio) { 
   return remedioDAO.excluir(remedio);
}
  @Override  public boolean actualizarRemedio(Remedio remedio) { 
   return remedioDAO.actualizar(remedio);
}
  @Override  public boolean salvarRemedio(Remedio remedio) { 
   return remedioDAO.salvar(remedio);
}
 @Override public List<Remedio> getListaRemedio() {
 return remedioDAO.getLista();
}


@Override
public List<Remedio> getListaRemedioPorUnidadMedida(UnidadMedida unidadMedida) {
	
	List<Remedio> lista = getListaRemedio();
	
	List<Remedio> listaAUX = new ArrayList<Remedio>();
	
	for (Remedio remedio : lista) {
		
		if( unidadMedida ==  null ){
			listaAUX.add(remedio);
		}
		else
		{			
			if( unidadMedida.getUm_codigo().equals(
					remedio.getUnidad_medida().getUm_codigo()) ){
				listaAUX.add(remedio);
			}
			
		}
	}
	
	return listaAUX ;	
}


@Override
public Remedio getRemedioXCodigoInterno(Remedio remedioCodInterno) {
		
	Remedio remedio = null ;
	try {
	  List<Remedio>	listaRemedio = getListaRemedioLikeCodigoInterno(remedioCodInterno);
	  remedio = listaRemedio.get(0);
	} catch (Exception e) {
		so("getRemedioXCodigoInterno");
	}
	
	return remedio ;	
	
}


private void so(String string) {
	System.out.println("Remedio DAO "  + string);
	
}


@Override
public boolean existeRemedioConCodigoInt(Remedio remedioCodInterno) {
	
	if(getRemedioXCodigoInterno(remedioCodInterno) == null){
		return false ;
	}
	else
	{
		return true ;
	}
}


@Override
public List<Remedio> getListaRemedioLikeCodigoInterno(Remedio remedioCodInterno) {
	StringBuilder hql = new StringBuilder("from Remedio r " );
	hql.append(" where r.rm_codigo_interno = '")
	.append(remedioCodInterno.getRm_codigo_interno())
	.append("'");
	
	List<Remedio> lista = null ;
	
	try {		
		
		lista = sessao.createQuery(String.valueOf(hql)).list();	  
				
	} catch (Exception e) {		
		so("getListaRemedioLikeCodigoInterno \nNo se encontro datos  " );
	}
	
	return lista ;	
}


private void jo(String string) {
	JOptionPane.showMessageDialog(null, string +"\nRemedioDAO");
	
}

 

}