
package py.com.farmacia.model.bean;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(name = "seq_tipo_venta", sequenceName = "seq_tipo_venta", allocationSize = 1, initialValue = 1)
@Table
public class TipoVenta {

    @Id
    @GeneratedValue(generator = "seq_tipo_venta")
    private Integer tv_codigo;
    @Column(nullable = true, length = 20)
    private String  tv_nombre ;

    /**
     * @return the tv_codigo
     */
    public Integer getTv_codigo() {
        return tv_codigo;
    }

    /**
     * @param tv_codigo the tv_codigo to set
     */
    public void setTv_codigo(Integer tv_codigo) {
        this.tv_codigo = tv_codigo;
    }

    /**
     * @return the tv_nombre
     */
    public String getTv_nombre() {
        return tv_nombre;
    }

    /**
     * @param tv_nombre the tv_nombre to set
     */
    public void setTv_nombre(String tv_nombre) {
        this.tv_nombre = tv_nombre;
    }

    
    


    
    
}
