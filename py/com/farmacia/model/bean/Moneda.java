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
@SequenceGenerator(name = "seq_moneda", sequenceName = "seq_moneda", allocationSize = 1, initialValue = 1)
@Table
public class Moneda {

    @Id
    @GeneratedValue(generator = "seq_moneda")
    private Integer mon_codigo;
    
    @Column
    private String mon_nombre;
    @Column
    private String mon_sigla;
    @ManyToOne
    @JoinColumn(name = "usu_codigo")
    @ForeignKey(name="Fk_usu_codigo")
    private Usuario usu_codigo;
	public Integer getMon_codigo() {
		return mon_codigo;
	}
	public void setMon_codigo(Integer mon_codigo) {
		this.mon_codigo = mon_codigo;
	}
	public String getMon_nombre() {
		return mon_nombre;
	}
	public void setMon_nombre(String mon_nombre) {
		this.mon_nombre = mon_nombre;
	}
	public String getMon_sigla() {
		return mon_sigla;
	}
	public void setMon_sigla(String mon_sigla) {
		this.mon_sigla = mon_sigla;
	}
	public Usuario getUsu_codigo() {
		return usu_codigo;
	}
	public void setUsu_codigo(Usuario usu_codigo) {
		this.usu_codigo = usu_codigo;
	}
    
 

    
    
}
