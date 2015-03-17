
package py.com.farmacia.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "seq_sictuacion_venta", sequenceName = "seq_sictuacion_venta", allocationSize = 1, initialValue = 1)
@Table
public class SituacionVenta {

    @Id
    @GeneratedValue(generator = "seq_sictuacion_venta")
    private Integer sv_codigo;
    @Column
    private String sv_desc;

    /**
     * @return the sv_codigo
     */
    public Integer getSv_codigo() {
        return sv_codigo;
    }

    /**
     * @param sv_codigo the sv_codigo to set
     */
    public void setSv_codigo(Integer sv_codigo) {
        this.sv_codigo = sv_codigo;
    }

    /**
     * @return the sv_desc
     */
    public String getSv_desc() {
        return sv_desc;
    }

    /**
     * @param sv_desc the sv_desc to set
     */
    public void setSv_desc(String sv_desc) {
        this.sv_desc = sv_desc;
    }

public String toString(){
    return sv_desc;
}
    
}
