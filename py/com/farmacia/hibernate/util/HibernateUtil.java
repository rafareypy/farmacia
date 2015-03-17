package py.com.farmacia.hibernate.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import py.com.farmacia.model.bean.*;

public class HibernateUtil {
    public static SessionFactory fabricaSessoes ;
    static Session sessao ;
	
	static {
		try {
			//fabricaSessoes = new Configuration().configure().buildSessionFactory();
			
            AnnotationConfiguration cfg = new AnnotationConfiguration();
   
            cfg.addAnnotatedClass(Categoria.class);
            cfg.addAnnotatedClass(Ciudad.class);
            cfg.addAnnotatedClass(Clase.class);
            cfg.addAnnotatedClass(Cliente.class);
            cfg.addAnnotatedClass(Distribuidor.class);
            
            cfg.addAnnotatedClass(Droga.class);
            cfg.addAnnotatedClass(Embalaje.class);
            cfg.addAnnotatedClass(Estado.class);
            cfg.addAnnotatedClass(FormaADM.class);
            cfg.addAnnotatedClass(FormaPago.class);
            
            
            cfg.addAnnotatedClass(Laboratorio.class);
            cfg.addAnnotatedClass(Marca.class);
            cfg.addAnnotatedClass(Presentacion.class);
            cfg.addAnnotatedClass(Procedencia.class);
            cfg.addAnnotatedClass(Remedio.class);
            cfg.addAnnotatedClass(SituacionCuota.class);
            cfg.addAnnotatedClass(SituacionPagamento.class);
            cfg.addAnnotatedClass(SituacionVenta.class);
            
            cfg.addAnnotatedClass(TipoCliente.class);
            cfg.addAnnotatedClass(TipoPago.class);
            cfg.addAnnotatedClass(TipoRemedio.class);
            cfg.addAnnotatedClass(TipoVenta.class);
            cfg.addAnnotatedClass(UnidadMedida.class);
            cfg.addAnnotatedClass(FormaPago.class);
            cfg.addAnnotatedClass(Usuario.class);
            
            cfg.addAnnotatedClass(VentaCab.class);
            cfg.addAnnotatedClass(VentaDetalle.class);
            cfg.addAnnotatedClass(CobroCab.class);
            cfg.addAnnotatedClass(CobroDet.class);
            
            cfg.addAnnotatedClass(NroDocumento.class);
            cfg.addAnnotatedClass(Moneda.class);
            cfg.addAnnotatedClass(Cotacion.class);
            
            
                        
            
            
            
                
                
                 
                fabricaSessoes = cfg.buildSessionFactory();
			
			
		} catch (Exception e) {
			System.out.println("Problemas com HibernateUtil \n" + e );	
		}
	}
	
	public static Session getSessao(){
            
            if( sessao == null )
                sessao =fabricaSessoes.openSession(); 
                
            
		return sessao ;
	}
        
}
