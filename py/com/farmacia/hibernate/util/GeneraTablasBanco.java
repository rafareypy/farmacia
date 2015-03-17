
package py.com.farmacia.hibernate.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import py.com.farmacia.model.bean.*;

public class GeneraTablasBanco {

    

    public GeneraTablasBanco() {
        super();
        System.out.println("Vamos generar las Tablas en el Banco de Datos");

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
                
                

        SchemaExport se = new SchemaExport(cfg);
        se.create(true, true);
        System.out.println("Terminamo el Processo de criar tabelas no Banco");
        System.out.println("VAmos inserir los datos Basicos");



        try {


            
            
            
            
            System.out.println("\n  Ufff por fin  Terminamos de inserir los datos basicos");


        } catch (Exception ex) {
            Logger.getLogger(GeneraTablasBanco.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

      
}
