package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceDrogaDAO {

Droga getDroga(Integer codigo);

Droga getDroga( Droga bean);

boolean excluirDroga(Droga bean);

boolean actualizarDroga(Droga bean);

boolean salvarDroga(Droga bean);

List<Droga> getListaDroga();


}

