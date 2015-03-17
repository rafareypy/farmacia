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
@SequenceGenerator(name = "seq_forma_pago", sequenceName = "seq_forma_pago", allocationSize = 1, initialValue = 1)
@Table
public class FormaPago {    

    @Id
    @GeneratedValue(generator = "seq_forma_pago")
    private Integer fp_codigo;
    @Column
    private String fp_desc;

    public Integer getFp_codigo() {
        return fp_codigo;
    }


    public void setFp_codigo(Integer fp_codigo) {
        this.fp_codigo = fp_codigo;
    }


    public String getFp_desc() {
        return fp_desc;
    }


    public void setFp_desc(String fp_desc) {
        this.fp_desc = fp_desc;
    }
    
}
