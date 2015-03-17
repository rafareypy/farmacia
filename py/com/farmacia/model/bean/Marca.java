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
@SequenceGenerator(name = "seq_marca", sequenceName = "seq_marca", allocationSize = 1, initialValue = 1)
@Table
public class Marca {
    
        @Id
        @GeneratedValue( generator="seq_marca")
        private Integer mar_codigo ;
        
        @Column(length=50)
        private String mar_nombre ;
        
        @ManyToOne
        @JoinColumn(name="usu_codigo")
        @ForeignKey(name="Fk_usu_codigo")
        private Usuario usu_codigo;

        
        public String toString(){
            return  mar_nombre;
        }
        
    /**
     * @return the mar_codigo
     */
    public Integer getMar_codigo() {
        return mar_codigo;
    }

    /**
     * @param mar_codigo the mar_codigo to set
     */
    public void setMar_codigo(Integer mar_codigo) {
        this.mar_codigo = mar_codigo;
    }

    /**
     * @return the mar_nombre
     */
    public String getMar_nombre() {
        return mar_nombre;
    }

    /**
     * @param mar_nombre the mar_nombre to set
     */
    public void setMar_nombre(String mar_nombre) {
        this.mar_nombre = mar_nombre;
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
