package py.com.farmacia.model.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import py.com.farmacia.hibernate.util.HibernateUtil;


public class AbstratoDAO {

//    public final Session sessao = HibernateUtil.getSessao();
    public Transaction transacao ;

    //Este metodo vai executar todas as opcao de CRUD
    //crud = c = Criar/ crud = u = Upadte /crud = d = delete
    public boolean executaOperacion( Object objeto, char crud) {
        
        
        try {

            Session sessao = HibernateUtil.getSessao() ;

            if (crud ==  'c' || crud ==  'u'  ) {
                sessao.saveOrUpdate(objeto);            
            }else if (crud == 'd') {
                sessao.delete(objeto);
            }else if(crud ==  'u' ){
                sessao.update(objeto);
            }

            
            return true;
        } catch (HibernateException e) {
            StringBuilder s = new StringBuilder("  - \n Problemas ao tentar excluir ");
            s.append(crud).append(" os dados \nErro.: ").append(e);
            envMsj(String.valueOf(s));
            return false;
        }catch (Exception e) {
            envMsj("Excecao " + e );
            return false;
        }finally{
            
        }
    }

    public void envMsj(String string) {
        System.out.println();

    }

//    private Transaction beginTransaction() {
//        return sessao.beginTransaction();
//    }
//    
  
    
}
