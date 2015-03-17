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
@SequenceGenerator(name = "seq_remedio", sequenceName = "seq_remedio", allocationSize = 1, initialValue = 1)
@Table
public class Remedio {

    @Id
    @GeneratedValue(generator = "seq_remedio")
    private Integer rm_codigo;
    
    @Column(length=60, nullable=true)
    private String rm_nombre_real ;
    

    @Column(length=60, nullable=true)
    private String rm_nombre_comercial ;

    
    @Column(length=30, nullable=true)
    private String rm_codigo_interno ;
    
    
    @ManyToOne
    @JoinColumn(name="dg_codigo")
    @ForeignKey(name="Fk_droga_codigo")
    private Droga droga;
    
    @ManyToOne
    @JoinColumn(name="usu_codigo")
    @ForeignKey(name="Fk_laboratorio_codigo")
    private Laboratorio laboratorio;
    
//    @ManyToOne
//    @JoinColumn(name="pr_codigo")
//    @ForeignKey(name="Fk_presentacion_codigo")
//    private Presentacion presentacion;
    
    @ManyToOne
    @JoinColumn(name="fm_codigo")
    @ForeignKey(name="Fk_forma_adm_codigo")
    private FormaADM formaADM;
    
    @ManyToOne
    @JoinColumn(name="um_codigo")
    @ForeignKey(name="Fk_unidad_medida_codigo")
    private UnidadMedida unidad_medida;


    @ManyToOne
    @JoinColumn(name="em_codigo")
    @ForeignKey(name="Fk_embalaje_codigo")
    private Embalaje embalaje;
        

    @ManyToOne
    @JoinColumn(name="pr_codigo")
    @ForeignKey(name="Fk_procedencia_codigo")
    private Procedencia procedencia;
                
        

    @ManyToOne
    @JoinColumn(name="tr_codigo")
    @ForeignKey(name="Fk_tipo_remedio_codigo")
    private TipoRemedio tipo_remedio;
    
    @Column
    private Integer qte_dentro;

    @Column(nullable= true)
    private Double rm_precio;
    

    @Column(nullable= true)
    private Double rm_precio2;

    @Column(nullable= true)
    private Double rm_precio3;
    
    
    @Column(length=20)
    private String pro_imagen;

    
    @Column(length=100)
    private String que_es;    
    
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_produccion;

    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_vencimiento;

    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_retirada;


	public Integer getRm_codigo() {
		return rm_codigo;
	}


	public void setRm_codigo(Integer rm_codigo) {
		this.rm_codigo = rm_codigo;
	}


	public String getRm_nombre_real() {
		return rm_nombre_real;
	}


	public void setRm_nombre_real(String rm_nombre_real) {
		this.rm_nombre_real = rm_nombre_real;
	}


	public String getRm_nombre_comercial() {
		return rm_nombre_comercial;
	}


	public void setRm_nombre_comercial(String rm_nombre_comercial) {
		this.rm_nombre_comercial = rm_nombre_comercial;
	}


	public String getRm_codigo_interno() {
		return rm_codigo_interno;
	}


	public void setRm_codigo_interno(String rm_codigo_interno) {
		this.rm_codigo_interno = rm_codigo_interno;
	}


	public Droga getDroga() {
		return droga;
	}


	public void setDroga(Droga droga) {
		this.droga = droga;
	}


	public Laboratorio getLaboratorio() {
		return laboratorio;
	}


	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}


	public FormaADM getFormaADM() {
		return formaADM;
	}


	public void setFormaADM(FormaADM formaADM) {
		this.formaADM = formaADM;
	}


	public UnidadMedida getUnidad_medida() {
		return unidad_medida;
	}


	public void setUnidad_medida(UnidadMedida unidad_medida) {
		this.unidad_medida = unidad_medida;
	}


	public Embalaje getEmbalaje() {
		return embalaje;
	}


	public void setEmbalaje(Embalaje embalaje) {
		this.embalaje = embalaje;
	}


	public Procedencia getProcedencia() {
		return procedencia;
	}


	public void setProcedencia(Procedencia procedencia) {
		this.procedencia = procedencia;
	}


	public TipoRemedio getTipo_remedio() {
		return tipo_remedio;
	}


	public void setTipo_remedio(TipoRemedio tipo_remedio) {
		this.tipo_remedio = tipo_remedio;
	}


	public Integer getQte_dentro() {
		return qte_dentro;
	}


	public void setQte_dentro(Integer qte_dentro) {
		this.qte_dentro = qte_dentro;
	}





	public Double getRm_precio() {
		return rm_precio;
	}


	public void setRm_precio(Double rm_precio) {
		this.rm_precio = rm_precio;
	}


	public Double getRm_precio2() {
		return rm_precio2;
	}


	public void setRm_precio2(Double rm_precio2) {
		this.rm_precio2 = rm_precio2;
	}


	public Double getRm_precio3() {
		return rm_precio3;
	}


	public void setRm_precio3(Double rm_precio3) {
		this.rm_precio3 = rm_precio3;
	}


	public String getPro_imagen() {
		return pro_imagen;
	}


	public void setPro_imagen(String pro_imagen) {
		this.pro_imagen = pro_imagen;
	}


	public String getQue_es() {
		return que_es;
	}


	public void setQue_es(String que_es) {
		this.que_es = que_es;
	}


	public Date getFecha_produccion() {
		return fecha_produccion;
	}


	public void setFecha_produccion(Date fecha_produccion) {
		this.fecha_produccion = fecha_produccion;
	}


	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}


	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}


	public Date getFecha_retirada() {
		return fecha_retirada;
	}


	public void setFecha_retirada(Date fecha_retirada) {
		this.fecha_retirada = fecha_retirada;
	}


    
    

}
