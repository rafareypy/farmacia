
package py.com.farmacia.model.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "seq_tipo_cliente", sequenceName = "seq_tipo_cliente", allocationSize = 1, initialValue = 1)
@Table
public class TipoCliente {

    @Id
    @GeneratedValue(generator = "seq_tipo_cliente")
    private Integer tc_codigo;

    @Column
    private String tc_descripcion;

    /**
     * @return the tc_codigo
     */
    public Integer getTc_codigo() {
        return tc_codigo;
    }

    /**
     * @param tc_codigo the tc_codigo to set
     */
    public void setTc_codigo(Integer tc_codigo) {
        this.tc_codigo = tc_codigo;
    }

    /**
     * @return the tc_descripcion
     */
    public String getTc_descripcion() {
        return tc_descripcion;
    }

    /**
     * @param tc_descripcion the tc_descripcion to set
     */
    public void setTc_descripcion(String tc_descripcion) {
        this.tc_descripcion = tc_descripcion;
    }

   
  public String toString(){
      return tc_descripcion;
  } 
    
}
