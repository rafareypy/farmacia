package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceLaboratorioDAO {

Laboratorio getLaboratorio(Integer codigo);

Laboratorio getLaboratorio( Laboratorio bean);

boolean excluirLaboratorio(Laboratorio bean);

boolean actualizarLaboratorio(Laboratorio bean);

boolean salvarLaboratorio(Laboratorio bean);

List<Laboratorio> getListaLaboratorio();


}

