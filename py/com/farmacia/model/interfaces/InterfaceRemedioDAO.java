package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceRemedioDAO {

Remedio getRemedio(Integer codigo);

Remedio getRemedio( Remedio bean);

boolean excluirRemedio(Remedio bean);

boolean actualizarRemedio(Remedio bean);

boolean salvarRemedio(Remedio bean);

List<Remedio> getListaRemedio();

List<Remedio> getListaRemedioPorUnidadMedida(UnidadMedida unidadMedida);

Remedio getRemedioXCodigoInterno( Remedio RemedioCodInterno );

boolean     existeRemedioConCodigoInt( Remedio RemedioCodInterno );

public List<Remedio> getListaRemedioLikeCodigoInterno(
							Remedio proSetProNombre) ;


}

