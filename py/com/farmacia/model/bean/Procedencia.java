package py.com.farmacia.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "seq_procedencia", sequenceName = "seq_procedencia", allocationSize = 1, initialValue = 1)
@Table
public class Procedencia {

    @Id
    @GeneratedValue(generator = "seq_procedencia")
    private Integer prc_codigo;
    @Column
    private String prc_nombre;
    
    @ManyToOne
    @JoinColumn(name="usu_codigo")
    private Usuario usu_codigo;

    
    

    /**
     * @return the prc_codigo
     */
    public Integer getPrc_codigo() {
        return prc_codigo;
    }

    /**
     * @param prc_codigo the prc_codigo to set
     */
    public void setPrc_codigo(Integer prc_codigo) {
        this.prc_codigo = prc_codigo;
    }

    /**
     * @return the prc_nombre
     */
    public String getPrc_nombre() {
        return prc_nombre;
    }

    /**
     * @param prc_nombre the prc_nombre to set
     */
    public void setPrc_nombre(String prc_nombre) {
        this.prc_nombre = prc_nombre;
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
