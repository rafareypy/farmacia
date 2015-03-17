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
@SequenceGenerator(name = "seq_sictuacion_cuota", sequenceName = "seq_sictuacion_cuota", allocationSize = 1, initialValue = 1)
@Table
public class SituacionCuota {

    @Id
    @GeneratedValue(generator = "seq_sictuacion_cuota")
    private Integer sc_codigo;
    @Column
    private String sc_desc;

    /**
     * @return the sc_codigo
     */
    public Integer getSc_codigo() {
        return sc_codigo;
    }

    /**
     * @param sc_codigo the sc_codigo to set
     */
    public void setSc_codigo(Integer sc_codigo) {
        this.sc_codigo = sc_codigo;
    }

    /**
     * @return the sc_desc
     */
    public String getSc_desc() {
        return sc_desc;
    }

    /**
     * @param sc_desc the sc_desc to set
     */
    public void setSc_desc(String sc_desc) {
        this.sc_desc = sc_desc;
    }

  public String toString(){
      return sc_desc;
  } 
    
}
