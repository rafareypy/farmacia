package py.com.farmacia.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(name = "seq_droga", sequenceName = "seq_droga"
, allocationSize = 1, initialValue = 1)
@Table
public class Droga {

    @Id
    @GeneratedValue(generator = "seq_droga")	
	private Integer dg_codigo ;
    
    @Column
    private String dg_nombre ;
    
    
    @Column
    private String dg_descripcion ;


	public Integer getDg_codigo() {
		return dg_codigo;
	}


	public void setDg_codigo(Integer dg_codigo) {
		this.dg_codigo = dg_codigo;
	}


	public String getDg_nombre() {
		return dg_nombre;
	}


	public void setDg_nombre(String dg_nombre) {
		this.dg_nombre = dg_nombre;
	}


	public String getDg_descripcion() {
		return dg_descripcion;
	}


	public void setDg_descripcion(String dg_descripcion) {
		this.dg_descripcion = dg_descripcion;
	}
    
    
    
	
}
