package py.com.farmacia.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

@Entity
@SequenceGenerator(name = "seq_presentacion",
sequenceName = "seq_presentacion", allocationSize = 1, initialValue = 1)
@Table         //TipoProducto
public class Presentacion {

    @Id
    @GeneratedValue(generator = "seq_presentacion")
    private Integer pr_codigo;
    
    @Column(nullable=true, length=50)
    private String pr_nombre;
    
    
    @ManyToOne
    @JoinColumn(name="usu_codigo")
    @ForeignKey(name="Fk_usu_codigo")
    private Usuario usu_codigo;
    
    

    /**
     * @return the pr_codigo
     */
    public Integer getpr_codigo() {
        return pr_codigo;
    }

    /**
     * @param pr_codigo the pr_codigo to set
     */
    public void setpr_codigo(Integer pr_codigo) {
        this.pr_codigo = pr_codigo;
    }

    /**
     * @return the pr_nombre
     */
    public String getpr_nombre() {
        return pr_nombre;
    }

    /**
     * @param pr_nombre the pr_nombre to set
     */
    public void setpr_nombre(String pr_nombre) {
        this.pr_nombre = pr_nombre;
    }

    /**
     * @return the usu_codigo
     */
    public Usuario getUsu_codigo() {
        return usu_codigo;
    }

    /**
     * @param usu_codigo the usu_codigo to set
     */
    public void setUsu_codigo(Usuario usu_codigo) {
        this.usu_codigo = usu_codigo;
    }
    
    
    public String toString(){
        return pr_nombre;
    }
}
