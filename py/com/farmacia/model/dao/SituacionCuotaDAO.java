

 package py.com.farmacia.model.dao; 


 import java.util.List;

import py.com.farmacia.hibernate.util.*;
import py.com.farmacia.model.bean.*;
import py.com.farmacia.model.interfaces.InterfaceSituacionCuotaDAO;



  public class SituacionCuotaDAO implements InterfaceSituacionCuotaDAO{




  InterfaceDAO<SituacionCuota> situacioncuotaDAO ; 
 

  public SituacionCuotaDAO(){ 
         super();
         situacioncuotaDAO = new HibernateDAO<SituacionCuota> (SituacionCuota.class);   
 }


@Override
public SituacionCuota getSituacionCuota(Integer codigo) {
	// TODO Auto-generated method stub
	return null;
}


@Override
public SituacionCuota getSituacionCuota(SituacionCuota bean) {
	// TODO Auto-generated method stub
	return null;
}


@Override
public boolean excluirSituacionCuota(SituacionCuota bean) {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean actualizarSituacionCuota(SituacionCuota bean) {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean salvarSituacionCuota(SituacionCuota bean) {
	// TODO Auto-generated method stub
	return false;
}


@Override
public List<SituacionCuota> getListaSituacionCuota() {
	// TODO Auto-generated method stub
	return null;
}



 

}