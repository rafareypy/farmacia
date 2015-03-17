
package py.com.farmacia.model.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ForeignKey;


//-----


@Entity
@SequenceGenerator(name = "seq_venta_cab", sequenceName = "seq_venta_cab"
        , allocationSize = 1, initialValue = 1)
@Table
public class VentaCab  {
    
    @Id
    @GeneratedValue(generator = "seq_venta_cab")
    private Integer vc_codigo;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date vc_fecha ;
    
    @ManyToOne
    @JoinColumn(name = "sv_codigo", nullable=false)
    @ForeignKey(name="Fk_situacion_venta_codigo")
    private SituacionVenta sv_codigo;
    
    
    
    @ManyToOne
    @JoinColumn(name = "usu_codigo", nullable=true)
    @ForeignKey(name="Fk_usu_codigo")
    private Usuario usu_codigo;
    
    @ManyToOne
    @JoinColumn(name = "fp_codigo", nullable=true)
    @ForeignKey(name="Fk_forma_pago_codigo")
    private FormaPago fp_codigo;    
     

    
    
    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "ndr_codigo", nullable=true)
    @ForeignKey(name="Fk_nro_doc_codigo")
    private NroDocumento nroDocumento ;    
   
    
    @ManyToOne
    @JoinColumn(name = "cli_codigo", nullable=true)
    @ForeignKey(name="Fk_cli_codigo")
    private Cliente cli_codigo;
   
    

    @ManyToOne  
    @JoinColumn(name = "tv_codigo", nullable=true)
    @ForeignKey(name="Fk_tipo_venta_codigo")
    private TipoVenta tv_codigo;
    
    
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date vc_prazo_pago ;
    
    
    @Column
    private Double vc_total_pagar ;
    
    
    @Column(length=150)
    private String vc_valor_descriptivo ;
    
    
    
    @ManyToOne(cascade = { CascadeType.ALL, CascadeType.MERGE })
    @JoinColumn(name = "cc_codigo", nullable=true)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @ForeignKey(name="Fk_cobro_cab_codigo")
    private CobroCab cc_codigo;    
    
    
    
    
    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinTable(
     name = "VentaCabYDetalles",
     joinColumns = @JoinColumn(name = "detalle_id")
     , inverseJoinColumns = @JoinColumn(name = "venta_id")
    )
    private List<VentaDetalle> lista_detalles;





    
    

    public String toString(){
    	if( nroDocumento == null ){
    		return null;
    	}
    	else
    	{
    		return nroDocumento.getNro_codigo().toString();
    	}
    }
    

	public CobroCab getCc_codigo() {
		return cc_codigo;
	}














	public void setCc_codigo(CobroCab cc_codigo) {
		this.cc_codigo = cc_codigo;
	}














	public Integer getVc_codigo() {
		return vc_codigo;
	}







	






	public void setVc_codigo(Integer vc_codigo) {
		this.vc_codigo = vc_codigo;
	}







	public Date getVc_fecha() {
		return vc_fecha;
	}







	public void setVc_fecha(Date vc_fecha) {
		this.vc_fecha = vc_fecha;
	}







	public SituacionVenta getSv_codigo() {
		return sv_codigo;
	}







	public void setSv_codigo(SituacionVenta sv_codigo) {
		this.sv_codigo = sv_codigo;
	}







	public Usuario getUsu_codigo() {
		return usu_codigo;
	}







	public void setUsu_codigo(Usuario usu_codigo) {
		this.usu_codigo = usu_codigo;
	}







	public FormaPago getFp_codigo() {
		return fp_codigo;
	}







	public void setFp_codigo(FormaPago fp_codigo) {
		this.fp_codigo = fp_codigo;
	}

	public NroDocumento getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(NroDocumento nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public Cliente getCli_codigo() {
		return cli_codigo;
	}

	public void setCli_codigo(Cliente cli_codigo) {
		this.cli_codigo = cli_codigo;
	}


	public TipoVenta getTv_codigo() {
		return tv_codigo;
	}

	public void setTv_codigo(TipoVenta tv_codigo) {
		this.tv_codigo = tv_codigo;
	}







	public Date getVc_prazo_pago() {
		return vc_prazo_pago;
	}







	public void setVc_prazo_pago(Date vc_prazo_pago) {
		this.vc_prazo_pago = vc_prazo_pago;
	}







	public Double getVc_total_pagar() {
		return vc_total_pagar;
	}







	public void setVc_total_pagar(Double vc_total_pagar) {
		this.vc_total_pagar = vc_total_pagar;
	}







	public String getVc_valor_descriptivo() {
		return vc_valor_descriptivo;
	}







	public void setVc_valor_descriptivo(String vc_valor_descriptivo) {
		this.vc_valor_descriptivo = vc_valor_descriptivo;
	}







	public List<VentaDetalle> getLista_detalles() {
		return lista_detalles;
	}







	public void setLista_detalles(List<VentaDetalle> lista_detalles) {
		this.lista_detalles = lista_detalles;
	}
    
    
    
    


    
}
