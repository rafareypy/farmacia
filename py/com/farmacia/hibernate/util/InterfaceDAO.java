package py.com.farmacia.hibernate.util;



import java.util.List;
public interface InterfaceDAO<T> {


T getBean(Integer bean);

T getBean(T bean);

boolean excluir(T bean);

boolean actualizar(T bean);

 boolean salvar(T bean);

List<T> getLista();


List<T> getListaBean(T bean);

}


