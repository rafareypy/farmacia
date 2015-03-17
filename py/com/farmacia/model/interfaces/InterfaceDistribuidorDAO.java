package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceDistribuidorDAO {

Distribuidor getDistribuidor(Integer codigo);

Distribuidor getDistribuidor( Distribuidor bean);

boolean excluirDistribuidor(Distribuidor bean);

boolean actualizarDistribuidor(Distribuidor bean);

boolean salvarDistribuidor(Distribuidor bean);

List<Distribuidor> getListaDistribuidor();


}

