
package py.com.farmacia.model.bean;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.IndexColumn;



@Entity
@SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", allocationSize = 1, initialValue = 1)
@Table
public class Cliente    {

    @Id
    @GeneratedValue(generator = "seq_cliente")
    private Integer cli_codigo;
    
    @ManyToOne
    @JoinColumn(name = "ciu_codigo")
    @ForeignKey(name="Fk_ciu_codigo")
    private Ciudad ciu_codigo;


    @ManyToOne
    @JoinColumn(name = "pai_codigo")
    @ForeignKey(name="Fk_pai_codigo")
    private Procedencia procedencia;  
    
    @ManyToOne
    @JoinColumn(name = "tc_codigo")
    @ForeignKey(name="Fk_tc_codigo")
    private TipoCliente tc_codigo;  
    
    
    @CollectionOfElements
    @JoinTable(name="lista_telefonos_cliente", joinColumns=@JoinColumn(name="cli_codigo"))
    @Column(name="telefono",nullable=true)
    @IndexColumn(name="tel_codigo")
    private List<String> listaTelefonosCliente ;
        
    
    @CollectionOfElements
    @JoinTable(name="lista_telefonos_celulares_cliente", joinColumns=@JoinColumn(name="cli_codigo"))
    @Column(name="telefono_celular",nullable=true)
    @IndexColumn(name="tel_cel_codigo")
    private List<String> listaTelefonosCelulares ;
    
    
    @Column(nullable=true)
    private Double limiteCredito ;
    
    @Column(length=50, nullable=true)
    private String cli_nombre;
    
    
    @Column(length=20, nullable=true)
    private String cli_codigo_interno;
    
    @Column(length=20, nullable=true)
    private String cli_ruc;

    
    @Column(length=50, nullable=true)
    private String cli_empresa;
    
    @Column(length=50, nullable=true)
    private String cli_direccion;
    
    @Column(length=50, nullable=true)
    private String cli_direccion_factura;
    
    
    @Column(length=25, nullable=true)
    private String cli_correo1;
    
    @Column(length=25, nullable=true)
    private String cli_correo2;    
    
    @Column(length=20, nullable=true)
    private String cli_fax1;    
    
    
    @Column(length=20, nullable=true)
    private String cli_fax2;    
    
    
    @Column(length=20, nullable=true)
    private String cli_web_site;
    
    
        
    @Column(length=20, nullable=true)
    private String cli_observacion;
    
    
    public String toString(){
        return String.valueOf(cli_codigo_interno);
    }


	public Integer getCli_codigo() {
		return cli_codigo;
	}


	public void setCli_codigo(Integer cli_codigo) {
		this.cli_codigo = cli_codigo;
	}


	public Ciudad getCiu_codigo() {
		return ciu_codigo;
	}


	public void setCiu_codigo(Ciudad ciu_codigo) {
		this.ciu_codigo = ciu_codigo;
	}


	public Procedencia getProcedencia() {
		return procedencia;
	}


	public void setProcedencia(Procedencia procedencia) {
		this.procedencia = procedencia;
	}


	public TipoCliente getTc_codigo() {
		return tc_codigo;
	}


	public void setTc_codigo(TipoCliente tc_codigo) {
		this.tc_codigo = tc_codigo;
	}


	public List<String> getListaTelefonosCliente() {
		return listaTelefonosCliente;
	}


	public void setListaTelefonosCliente(List<String> listaTelefonosCliente) {
		this.listaTelefonosCliente = listaTelefonosCliente;
	}


	public List<String> getListaTelefonosCelulares() {
		return listaTelefonosCelulares;
	}


	public void setListaTelefonosCelulares(List<String> listaTelefonosCelulares) {
		this.listaTelefonosCelulares = listaTelefonosCelulares;
	}


	public Double getLimiteCredito() {
		return limiteCredito;
	}


	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}


	public String getCli_nombre() {
		return cli_nombre;
	}


	public void setCli_nombre(String cli_nombre) {
		this.cli_nombre = cli_nombre;
	}


	public String getCli_codigo_interno() {
		return cli_codigo_interno;
	}


	public void setCli_codigo_interno(String cli_codigo_interno) {
		this.cli_codigo_interno = cli_codigo_interno;
	}


	public String getCli_ruc() {
		return cli_ruc;
	}


	public void setCli_ruc(String cli_ruc) {
		this.cli_ruc = cli_ruc;
	}


	public String getCli_empresa() {
		return cli_empresa;
	}


	public void setCli_empresa(String cli_empresa) {
		this.cli_empresa = cli_empresa;
	}


	public String getCli_direccion() {
		return cli_direccion;
	}


	public void setCli_direccion(String cli_direccion) {
		this.cli_direccion = cli_direccion;
	}


	public String getCli_direccion_factura() {
		return cli_direccion_factura;
	}


	public void setCli_direccion_factura(String cli_direccion_factura) {
		this.cli_direccion_factura = cli_direccion_factura;
	}


	public String getCli_correo1() {
		return cli_correo1;
	}


	public void setCli_correo1(String cli_correo1) {
		this.cli_correo1 = cli_correo1;
	}


	public String getCli_correo2() {
		return cli_correo2;
	}


	public void setCli_correo2(String cli_correo2) {
		this.cli_correo2 = cli_correo2;
	}


	public String getCli_fax1() {
		return cli_fax1;
	}


	public void setCli_fax1(String cli_fax1) {
		this.cli_fax1 = cli_fax1;
	}


	public String getCli_fax2() {
		return cli_fax2;
	}


	public void setCli_fax2(String cli_fax2) {
		this.cli_fax2 = cli_fax2;
	}


	public String getCli_web_site() {
		return cli_web_site;
	}


	public void setCli_web_site(String cli_web_site) {
		this.cli_web_site = cli_web_site;
	}


	public String getCli_observacion() {
		return cli_observacion;
	}


	public void setCli_observacion(String cli_observacion) {
		this.cli_observacion = cli_observacion;
	}

    
    
   
}
