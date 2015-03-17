package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceSituacionCuotaDAO {

SituacionCuota getSituacionCuota(Integer codigo);

SituacionCuota getSituacionCuota( SituacionCuota bean);

boolean excluirSituacionCuota(SituacionCuota bean);

boolean actualizarSituacionCuota(SituacionCuota bean);

boolean salvarSituacionCuota(SituacionCuota bean);

List<SituacionCuota> getListaSituacionCuota();


}

