/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.farmacia.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(name = "seq_estado", sequenceName = "seq_estado", allocationSize = 1, initialValue = 1)
@Table
public class Estado {

    @Id
    @GeneratedValue(generator = "seq_estado")
    private Integer est_codigo;
    @Column(nullable = true, length = 20)
    private String est_nombre ;

    public String toString(){
        return est_nombre;
    }
    
    /**
     * @return the est_codigo
     */
    public Integer getEst_codigo() {
        return est_codigo;
    }

    /**
     * @param est_codigo the est_codigo to set
     */
    public void setEst_codigo(Integer est_codigo) {
        this.est_codigo = est_codigo;
    }

    /**
     * @return the est_nombre
     */
    public String getEst_nombre() {
        return est_nombre;
    }

    /**
     * @param est_nombre the est_nombre to set
     */
    public void setEst_nombre(String est_nombre) {
        this.est_nombre = est_nombre;
    }
}
