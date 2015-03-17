
package py.com.farmacia.model.bean;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@SequenceGenerator(name = "seq_ciudad", sequenceName = "seq_ciudad", allocationSize = 1, initialValue = 1)
@Table
public  class Ciudad {

    @Id
    @GeneratedValue(generator = "seq_ciudad")
    private Integer ciu_codigo;
    
    @Column(length=30, nullable=false)
    private String ciu_nombre ;

    /**
     * @return the ciu_codigo
     */
    public Integer getCiu_codigo() {
        return ciu_codigo;
    }

    /**
     * @param ciu_codigo the ciu_codigo to set
     */
    public void setCiu_codigo(Integer ciu_codigo) {
        this.ciu_codigo = ciu_codigo;
    }

    /**
     * @return the ciu_nombre
     */
    public String getCiu_nombre() {
        return ciu_nombre;
    }

    /**
     * @param ciu_nombre the ciu_nombre to set
     */
    public void setCiu_nombre(String ciu_nombre) {
        this.ciu_nombre = ciu_nombre;
    }
    
  public String toString(){
      return ciu_nombre;
  }  
    
}
