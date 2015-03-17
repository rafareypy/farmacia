package py.com.farmacia.model.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(name = "seq_laboratorio", sequenceName = "seq_laboratorio", allocationSize = 1, initialValue = 1)
@Table
public class Laboratorio {

    @Id
    @GeneratedValue(generator = "seq_laboratorio")
    private Integer lb_codigo;
    
    
    @Column
    private String lb_nombre ;
    

    @Column
    private String lb_descripcion ;


	public Integer getLb_codigo() {
		return lb_codigo;
	}


	public void setLb_codigo(Integer lb_codigo) {
		this.lb_codigo = lb_codigo;
	}


	public String getLb_nombre() {
		return lb_nombre;
	}


	public void setLb_nombre(String lb_nombre) {
		this.lb_nombre = lb_nombre;
	}


	public String getLb_descripcion() {
		return lb_descripcion;
	}


	public void setLb_descripcion(String lb_descripcion) {
		this.lb_descripcion = lb_descripcion;
	}
    
    



}
