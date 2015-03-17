package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceTipoRemedioDAO {

TipoRemedio getTipoRemedio(Integer codigo);

TipoRemedio getTipoRemedio( TipoRemedio bean);

boolean excluirTipoRemedio(TipoRemedio bean);

boolean actualizarTipoRemedio(TipoRemedio bean);

boolean salvarTipoRemedio(TipoRemedio bean);

List<TipoRemedio> getListaTipoRemedio();


}

