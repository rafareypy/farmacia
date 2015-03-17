/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
@SequenceGenerator(name = "seq_distribuidor", sequenceName = "seq_distribuidor", allocationSize = 1, initialValue = 1)
@Table
public class Distribuidor {

    @Id
    @GeneratedValue(generator = "seq_distribuidor")
    private Integer dis_codigo;
    
    @Column(nullable=true, length=50)
    private String dis_nombre ;
    
    
    @Column(nullable=true, length=5)
    private String dis_sigla ;

    
    public String toString(){
        return dis_nombre;
    }
    
    /**
     * @return the dis_codigo
     */
    public Integer getDis_codigo() {
        return dis_codigo;
    }

    /**
     * @param dis_codigo the dis_codigo to set
     */
    public void setDis_codigo(Integer dis_codigo) {
        this.dis_codigo = dis_codigo;
    }

    /**
     * @return the dis_nombre
     */
    public String getDis_nombre() {
        return dis_nombre;
    }

    /**
     * @param dis_nombre the dis_nombre to set
     */
    public void setDis_nombre(String dis_nombre) {
        this.dis_nombre = dis_nombre;
    }

    /**
     * @return the dis_sigla
     */
    public String getDis_sigla() {
        return dis_sigla;
    }

    /**
     * @param dis_sigla the dis_sigla to set
     */
    public void setDis_sigla(String dis_sigla) {
        this.dis_sigla = dis_sigla;
    }
    

    
}
