package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceFormaPagoDAO {

FormaPago getFormaPago(Integer codigo);

FormaPago getFormaPago( FormaPago bean);

boolean excluirFormaPago(FormaPago bean);

boolean actualizarFormaPago(FormaPago bean);

boolean salvarFormaPago(FormaPago bean);

List<FormaPago> getListaFormaPago();


}

