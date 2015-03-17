package py.com.farmacia.services.interfaces;

import java.util.List;

import py.com.farmacia.model.bean.Clase;
import py.com.farmacia.model.bean.Embalaje;
import py.com.farmacia.model.bean.Marca;
import py.com.farmacia.model.bean.Moneda;
import py.com.farmacia.model.bean.Remedio;
import py.com.farmacia.model.bean.UnidadMedida;


public interface RemedioService {
	
	Remedio getRemedio(Integer codigo);

    Remedio getRemedio(Remedio Remedio);

    boolean excluir(Remedio Remedio);

    boolean actualizar(Remedio Remedio);

    boolean salvar(Remedio Remedio);

    List<Remedio> getListaRemedio();
    
    List<Remedio> getListaRemedioPorMoneda(Moneda moneda);
    
    List<Remedio> getListaRemedioPorUnidadMedida(UnidadMedida unidadMedida);
    
    Remedio getRemedioXCodigoInterno( Remedio RemedioCodInterno );
    
    boolean     existeRemedioConCodigoInt( Remedio RemedioCodInterno );
    
    
    List<Remedio> getListaRemedioLikeCodigoInterno(Remedio proSetProNombre );
    
    List<Remedio> getListaRemedioLikeCodigoInternoYMoneda(
                                        Remedio proSetProNombre, Moneda moneda );
    
    List<Remedio> getListaRemedioByExample( Remedio proSetProNombre );                
    
    List<Remedio> getListaRemedioPorMarca( Marca marca );
    
    List<Remedio> getListaRemedioPorEmbalaje( Embalaje embalaje );
    
    List<Remedio> getListaRemedioPorClase( Clase clase );
}
