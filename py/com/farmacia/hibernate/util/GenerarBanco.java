
package py.com.farmacia.hibernate.util;

import py.com.farmacia.teste.InserirValoresBasicos;
import py.com.farmacia.teste.InserirVenta;


public class GenerarBanco {
    
    
    public void generarBanco(){

    }
    
    public static void main(String args[]) {
        GeneraTablasBanco generaTablasBanco = new GeneraTablasBanco();
        
        InserirValoresBasicos i = new InserirValoresBasicos();
		i.excutarTudo();
		
		
		
        
        //        TesteVendaProducto t = new TesteVendaProducto();
        //        t.inserirVentaCompleta();        
    }
    
}
