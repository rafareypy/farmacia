package py.com.farmacia.hibernate.util;







import java.util.List;

import org.hibernate.Session;

import py.com.farmacia.model.dao.AbstratoDAO;





public class HibernateDAO<T> extends AbstratoDAO  implements InterfaceDAO<T> {

  private Class<T> classe ;
  private final Session sessao ;
  public HibernateDAO(Class<T> classe){
  super();
  this.classe = classe;
  this.sessao = HibernateUtil.getSessao();
  }
  
  
@Override
public T getBean(Integer bean) {
	return (T) sessao.get(classe, bean);
}
@Override
public T getBean(T bean) {
	throw new UnsupportedOperationException("No se puede implementar este metodo.");
}
@Override
public boolean excluir(T bean) {
	return executaOperacion( bean,'d' );
}
@Override
public boolean actualizar(T bean) {
	return executaOperacion( bean,'u' );
}
@Override
public boolean salvar(T bean) {
	return executaOperacion( bean,'c' );
}
@Override
public List<T> getLista() {
	  return  (List<T>) sessao.createCriteria(classe).list();
}
@Override
public List<T> getListaBean(T bean) {
	throw new UnsupportedOperationException("No se puede implementar este metodo.");
}
  
  
   
  


}