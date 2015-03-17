package py.com.farmacia.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(name = "seq_nro_doc", sequenceName = "seq_nro_doc", allocationSize = 1, initialValue = 1)
@Table
public class NroDocumento {

    @Id
    @GeneratedValue(generator = "seq_nro_doc")
    private Integer nro_codigo;

	public Integer getNro_codigo() {
		return nro_codigo;
	}

	public void setNro_codigo(Integer nro_codigo) {
		this.nro_codigo = nro_codigo;
	}
    
    
    
    
    
    

}
