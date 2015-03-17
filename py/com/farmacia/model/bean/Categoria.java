
package py.com.farmacia.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(name = "seq_categoria", sequenceName = "seq_categoria", allocationSize = 1, initialValue = 1)
@Table
public class Categoria {

    @Id
    @GeneratedValue(generator = "seq_categoria")
    private Integer cat_codigo;
    
    
    @Column
    private String cat_desc ;

    /**
     * @return the cat_codigo
     */
    public Integer getCat_codigo() {
        return cat_codigo;
    }

    /**
     * @param cat_codigo the cat_codigo to set
     */
    public void setCat_codigo(Integer cat_codigo) {
        this.cat_codigo = cat_codigo;
    }

    /**
     * @return the cat_desc
     */
    public String getCat_desc() {
        return cat_desc;
    }

    /**
     * @param cat_desc the cat_desc to set
     */
    public void setCat_desc(String cat_desc) {
        this.cat_desc = cat_desc;
    }
    

    
}
