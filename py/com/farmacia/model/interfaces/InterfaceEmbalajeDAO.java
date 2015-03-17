package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceEmbalajeDAO {

Embalaje getEmbalaje(Integer codigo);

Embalaje getEmbalaje( Embalaje bean);

boolean excluirEmbalaje(Embalaje bean);

boolean actualizarEmbalaje(Embalaje bean);

boolean salvarEmbalaje(Embalaje bean);

List<Embalaje> getListaEmbalaje();


}

