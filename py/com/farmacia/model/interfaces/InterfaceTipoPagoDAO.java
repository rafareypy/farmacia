package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceTipoPagoDAO {

TipoPago getTipoPago(Integer codigo);

TipoPago getTipoPago( TipoPago bean);

boolean excluirTipoPago(TipoPago bean);

boolean actualizarTipoPago(TipoPago bean);

boolean salvarTipoPago(TipoPago bean);

List<TipoPago> getListaTipoPago();


}

