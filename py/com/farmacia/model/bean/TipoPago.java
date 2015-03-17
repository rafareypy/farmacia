
package py.com.farmacia.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(name = "seq_tipo_pago", sequenceName = "seq_tipo_pago", allocationSize = 1, initialValue = 1)
@Table
public class TipoPago {

    @Id
    @GeneratedValue(generator = "seq_tipo_pago")
    private Integer tp_codigo;
    @Column(nullable = true, length = 20)
    private String tp_nombre ;

    /**
     * @return the tp_codigo
     */
    public Integer getTp_codigo() {
        return tp_codigo;
    }

    /**
     * @param tp_codigo the tp_codigo to set
     */
    public void setTp_codigo(Integer tp_codigo) {
        this.tp_codigo = tp_codigo;
    }

    /**
     * @return the tp_nombre
     */
    public String getTp_nombre() {
        return tp_nombre;
    }

    /**
     * @param tp_nombre the tp_nombre to set
     */
    public void setTp_nombre(String tp_nombre) {
        this.tp_nombre = tp_nombre;
    }

    
}
