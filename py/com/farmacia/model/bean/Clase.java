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
@SequenceGenerator(name = "seq_clase", sequenceName = "seq_clase", allocationSize = 1, initialValue = 1)
@Table
public class Clase {

    @Id
    @GeneratedValue(generator = "seq_clase")
    private Integer cla_codigo;
    @Column(nullable=true, length=50)    
    private String cla_nombre;
        
    @ManyToOne
    @JoinColumn(name="usu_codigo")
    @ForeignKey(name="fk_usu_codigo")
    private Usuario usu_codigo;

    public String toString(){
        return cla_nombre;
    }
    

    /**
     * @return the cla_codigo
     */
    public Integer getCla_codigo() {
        return cla_codigo;
    }

    /**
     * @param cla_codigo the cla_codigo to set
     */
    public void setCla_codigo(Integer cla_codigo) {
        this.cla_codigo = cla_codigo;
    }

    /**
     * @return the cla_nombre
     */
    public String getCla_nombre() {
        return cla_nombre;
    }

    /**
     * @param cla_nombre the cla_nombre to set
     */
    public void setCla_nombre(String cla_nombre) {
        this.cla_nombre = cla_nombre;
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
}