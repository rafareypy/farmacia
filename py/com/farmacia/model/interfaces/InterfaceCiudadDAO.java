package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceCiudadDAO {

Ciudad getCiudad(Integer codigo);

Ciudad getCiudad( Ciudad bean);

boolean excluirCiudad(Ciudad bean);

boolean actualizarCiudad(Ciudad bean);

boolean salvarCiudad(Ciudad bean);

List<Ciudad> getListaCiudad();


}

