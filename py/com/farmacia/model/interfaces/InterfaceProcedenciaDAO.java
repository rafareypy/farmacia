package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceProcedenciaDAO {

Procedencia getProcedencia(Integer codigo);

Procedencia getProcedencia( Procedencia bean);

boolean excluirProcedencia(Procedencia bean);

boolean actualizarProcedencia(Procedencia bean);

boolean salvarProcedencia(Procedencia bean);

List<Procedencia> getListaProcedencia();


}

