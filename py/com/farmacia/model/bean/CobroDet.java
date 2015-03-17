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
import org.hibernate.annotations.ForeignKey;


@Entity
@SequenceGenerator(name = "seq_cobro_det", sequenceName = "seq_cobro_det"
, allocationSize = 1, initialValue = 1)
@Table
public class CobroDet implements java.lang.Comparable<CobroDet>{

    @Id
    @GeneratedValue(generator = "seq_cobro_det")
    private Integer cd_codigo;

    
    @Column
    private Double cd_saldo ;
    
    @Column
    private Double cd_entrega ;
    

    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date cd_fecha_pago_cuota;
    
    
    @Column(length=30)
    private String cd_recibo ;
    
    
    @Column(length=150)
    private String cd_valor_descritivo ;
    
    @Column(length=250)
    private String cd_observacion ;
        
         
    @ManyToOne //Este es la Situacion de la cuota
    @JoinColumn(name = "cob_situacion_cuota")
    @ForeignKey(name = "Fk_situacion_cuota_codigo")
    private SituacionCuota sc_codigo;
       
    @ManyToOne
    @JoinColumn(name = "cob_estado_cobro")
    @ForeignKey(name = "Fk_estado_cobro_codigo")
    private Estado es_codigo;
    
    
    @ManyToOne
    @JoinColumn(name = "usu_codigo")
    @ForeignKey(name = "Fk_usu_codigo")
    private Usuario usu_codigo;

    
    @Override
    public String toString(){
        if( cd_codigo == null ){
            return "nulo";
        }else{
            return String.valueOf(cd_codigo);
        }
    }


	@Override
	public int compareTo(CobroDet arg0) {
		return 0;
	}


	public Integer getCd_codigo() {
		return cd_codigo;
	}


	public void setCd_codigo(Integer cd_codigo) {
		this.cd_codigo = cd_codigo;
	}


	public Double getCd_saldo() {
		return cd_saldo;
	}


	public void setCd_saldo(Double cd_saldo) {
		this.cd_saldo = cd_saldo;
	}


	public Double getCd_entrega() {
		return cd_entrega;
	}


	public void setCd_entrega(Double cd_entrega) {
		this.cd_entrega = cd_entrega;
	}


	public Date getCd_fecha_pago_cuota() {
		return cd_fecha_pago_cuota;
	}


	public void setCd_fecha_pago_cuota(Date cd_fecha_pago_cuota) {
		this.cd_fecha_pago_cuota = cd_fecha_pago_cuota;
	}


	public String getCd_recibo() {
		return cd_recibo;
	}


	public void setCd_recibo(String cd_recibo) {
		this.cd_recibo = cd_recibo;
	}


	public String getCd_valor_descritivo() {
		return cd_valor_descritivo;
	}


	public void setCd_valor_descritivo(String cd_valor_descritivo) {
		this.cd_valor_descritivo = cd_valor_descritivo;
	}


	public String getCd_observacion() {
		return cd_observacion;
	}


	public void setCd_observacion(String cd_observacion) {
		this.cd_observacion = cd_observacion;
	}


	public SituacionCuota getSc_codigo() {
		return sc_codigo;
	}


	public void setSc_codigo(SituacionCuota sc_codigo) {
		this.sc_codigo = sc_codigo;
	}


	public Estado getEs_codigo() {
		return es_codigo;
	}


	public void setEs_codigo(Estado es_codigo) {
		this.es_codigo = es_codigo;
	}


	public Usuario getUsu_codigo() {
		return usu_codigo;
	}


	public void setUsu_codigo(Usuario usu_codigo) {
		this.usu_codigo = usu_codigo;
	}
    
   
    

   
}
