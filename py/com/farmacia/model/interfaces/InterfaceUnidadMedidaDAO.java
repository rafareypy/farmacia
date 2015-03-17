package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceUnidadMedidaDAO {

UnidadMedida getUnidadMedida(Integer codigo);

UnidadMedida getUnidadMedida( UnidadMedida bean);

boolean excluirUnidadMedida(UnidadMedida bean);

boolean actualizarUnidadMedida(UnidadMedida bean);

boolean salvarUnidadMedida(UnidadMedida bean);

List<UnidadMedida> getListaUnidadMedida();


}

