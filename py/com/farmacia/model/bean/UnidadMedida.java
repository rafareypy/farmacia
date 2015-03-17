
package py.com.farmacia.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "seq_unidad_medida", sequenceName = "seq_unidad_medida", allocationSize = 1, initialValue = 1)
@Table
public class UnidadMedida {

    @Id
    @GeneratedValue(generator = "seq_unidad_medida")
    private Integer um_codigo;

    @Column
    private String descripcion ;

    
    public Integer getUm_codigo() {
        return um_codigo;
    }

    
    public void setUm_codigo(Integer um_codigo) {
        this.um_codigo = um_codigo;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String toString(){
      return descripcion.toString();  
    }
}
