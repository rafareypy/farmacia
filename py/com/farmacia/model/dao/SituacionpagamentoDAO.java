

 package py.com.farmacia.model.dao; 


 import py.com.farmacia.model.bean.SituacionPagamento;
import py.com.farmacia.model.interfaces.InterfaceSituacionPagamentoDAO;
import py.com.farmacia.hibernate.util.*;
import java.util.List;  



  public class SituacionpagamentoDAO implements InterfaceSituacionPagamentoDAO{




  InterfaceDAO<SituacionPagamento> situacionpagamentoDAO ; 
 

  public SituacionpagamentoDAO(){ 
         super();
         situacionpagamentoDAO = new HibernateDAO<SituacionPagamento> (SituacionPagamento.class);   
 }


@Override
public SituacionPagamento getSituacionPagamento(Integer codigo) {
	
	return situacionpagamentoDAO.getBean(codigo);
}


@Override
public SituacionPagamento getSituacionPagamento(SituacionPagamento bean) {
	
	return situacionpagamentoDAO.getBean(bean.getSp_codigo());
}


@Override
public boolean excluirSituacionPagamento(SituacionPagamento bean) {
	
	return situacionpagamentoDAO.excluir(bean);
}


@Override
public boolean actualizarSituacionPagamento(SituacionPagamento bean) {
	
	return situacionpagamentoDAO.actualizar(bean);
}


@Override
public boolean salvarSituacionPagamento(SituacionPagamento bean) {
	
	return situacionpagamentoDAO.salvar(bean);
}


@Override
public List<SituacionPagamento> getListaSituacionPagamento() {
	
	return situacionpagamentoDAO.getLista();
}


}