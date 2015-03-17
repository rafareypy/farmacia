package py.com.farmacia.model.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ForeignKey;

@Entity
@SequenceGenerator(name = "seq_cotacion", sequenceName = "seq_cotacion", allocationSize = 1, initialValue = 1)
@Table
public class Cotacion {

    @Id
    @GeneratedValue( generator="seq_cotacion")
    private Integer cot_codigo;
    
    @Column()
    @Temporal( TemporalType.DATE )
    private Date cot_fecha;
    
    
    @ManyToOne
    @JoinColumn(name = "mon_codigo", nullable=false)
    @ForeignKey(name="Fk_moneda_codigo")
    private Moneda mon_codigo;
    
    
    @Column
    private Double co_cotacion;


	public Double getCo_cotacion() {
		return co_cotacion;
	}


	public void setCo_cotacion(Double co_cotacion) {
		this.co_cotacion = co_cotacion;
	}


	public Integer getCot_codigo() {
		return cot_codigo;
	}


	public void setCot_codigo(Integer cot_codigo) {
		this.cot_codigo = cot_codigo;
	}


	

	public Date getCot_fecha() {
		return cot_fecha;
	}


	public void setCot_fecha(Date cot_fecha) {
		this.cot_fecha = cot_fecha;
	}


	public Moneda getMon_codigo() {
		return mon_codigo;
	}


	public void setMon_codigo(Moneda mon_codigo) {
		this.mon_codigo = mon_codigo;
	}


    
    

}
