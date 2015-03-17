package py.com.farmacia.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(name = "seq_forma_adm", sequenceName = "seq_forma_adm"
, allocationSize = 1, initialValue = 1)
@Table
public class FormaADM {

    @Id
    @GeneratedValue(generator = "seq_forma_adm")
    private Integer frm_codigo;
    
    
    @Column
    private String frm_desc ;


	public Integer getFrm_codigo() {
		return frm_codigo;
	}


	public void setFrm_codigo(Integer frm_codigo) {
		this.frm_codigo = frm_codigo;
	}


	public String getFrm_desc() {
		return frm_desc;
	}


	public void setFrm_desc(String frm_desc) {
		this.frm_desc = frm_desc;
	}
    
    
    
    
    


}
