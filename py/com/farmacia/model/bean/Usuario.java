package py.com.farmacia.model.bean;

//import java.util.Map;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;



@Entity
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 2)
@Table
public class Usuario  {

    @Id
    @GeneratedValue(generator = "seq_usuario")
    private Integer usu_codigo;
    @Column
    private String nombre;
    @Column(nullable=false, length=10)         
    private String  usu_login;

    @Column(nullable=false, length=10)         
    private String  usu_pin;

	public Integer getUsu_codigo() {
		return usu_codigo;
	}

	public void setUsu_codigo(Integer usu_codigo) {
		this.usu_codigo = usu_codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsu_login() {
		return usu_login;
	}

	public void setUsu_login(String usu_login) {
		this.usu_login = usu_login;
	}

	public String getUsu_pin() {
		return usu_pin;
	}

	public void setUsu_pin(String usu_pin) {
		this.usu_pin = usu_pin;
	}    
    
    

    
    
}
