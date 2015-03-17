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
@SequenceGenerator(name = "seq_tipo_remedio", sequenceName = "seq_tipo_remedio", allocationSize = 1, initialValue = 1)
@Table         
public class TipoRemedio {

    @Id
    @GeneratedValue(generator = "seq_tipo_remedio")
    private Integer tr_codigo;
    
    @Column(nullable=true, length=50)
    private String tr_nombre;
    
    
    @ManyToOne
    @JoinColumn(name="usu_codigo")
    @ForeignKey(name="Fk_usu_codigo")
    private Usuario usu_codigo;


	public Integer getTr_codigo() {
		return tr_codigo;
	}


	public void setTr_codigo(Integer tr_codigo) {
		this.tr_codigo = tr_codigo;
	}


	public String getTr_nombre() {
		return tr_nombre;
	}


	public void setTr_nombre(String tr_nombre) {
		this.tr_nombre = tr_nombre;
	}


	public Usuario getUsu_codigo() {
		return usu_codigo;
	}


	public void setUsu_codigo(Usuario usu_codigo) {
		this.usu_codigo = usu_codigo;
	}
    


}
