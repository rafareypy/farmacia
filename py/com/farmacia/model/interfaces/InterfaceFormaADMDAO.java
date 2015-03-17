package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceFormaADMDAO {

FormaADM getFormaADM(Integer codigo);

FormaADM getFormaADM( FormaADM bean);

boolean excluirFormaADM(FormaADM bean);

boolean actualizarFormaADM(FormaADM bean);

boolean salvarFormaADM(FormaADM bean);

List<FormaADM> getListaFormaADM();


}

