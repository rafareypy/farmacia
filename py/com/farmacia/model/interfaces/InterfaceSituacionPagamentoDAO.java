package py.com.farmacia.model.interfaces;


import py.com.farmacia.model.bean.*;
import py.com.farmacia.hibernate.util.*;
import java.util.List;

public interface InterfaceSituacionPagamentoDAO {

	SituacionPagamento getSituacionPagamento(Integer codigo);

SituacionPagamento getSituacionPagamento( SituacionPagamento bean);

boolean excluirSituacionPagamento(SituacionPagamento bean);

boolean actualizarSituacionPagamento(SituacionPagamento bean);

boolean salvarSituacionPagamento(SituacionPagamento bean);

List<SituacionPagamento> getListaSituacionPagamento();


}

