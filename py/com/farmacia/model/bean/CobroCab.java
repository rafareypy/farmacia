/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.farmacia.model.bean;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ForeignKey;


@Entity
@SequenceGenerator(name = "seq_cobro_cab"
, sequenceName = "seq_cobro_cab", allocationSize = 1, initialValue = 1)
@Table
public class CobroCab {

    @Id
    @GeneratedValue(generator = "seq_cobro_cab")
    private Integer cc_codigo;
    
    
    @ManyToOne
    @JoinColumn(name = "vc_cabecera")
    @ForeignKey(name = "Fk_venta_cabecera_codigo")
    private VentaCab vc_cabecera;

    
    @ManyToOne
    @JoinColumn(name = "sp_codigo")
    @ForeignKey(name = "Fk_situacion_pagamento_factura_codigo")
    private SituacionPagamento sp_codigo;
    //Esta situacion es del pagamento, ejemplo si la persona gago o no!!!
    
    @ManyToOne
    @JoinColumn(name = "usu_codigo")
    @ForeignKey(name = "Fk_usu_codigo")
    private Usuario usu_codigo;
    
    
    @ManyToOne
    @JoinColumn(name = "es_codigo")
    @ForeignKey(name = "Fk_estado_cobro_codigo")
    private Estado es_codigo;
    //Esta Estado es del pagamento Activo o inactivo!!!    

    
    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinTable(
     name = "CobroCabYDetalles",
     joinColumns = @JoinColumn(name = "detalle_id")
     , inverseJoinColumns = @JoinColumn(name = "cobro_id")
    )
    private List<CobroDet> lista_cobro_det;    
    
    public String toString(){
        if( cc_codigo == null )       {
            return "nulo";
        }else{
            return String.valueOf(cc_codigo);
        }
    }

	public Integer getCc_codigo() {
		return cc_codigo;
	}

	public void setCc_codigo(Integer cc_codigo) {
		this.cc_codigo = cc_codigo;
	}

	public VentaCab getVc_cabecera() {
		return vc_cabecera;
	}

	public void setVc_cabecera(VentaCab vc_cabecera) {
		this.vc_cabecera = vc_cabecera;
	}

	public SituacionPagamento getSp_codigo() {
		return sp_codigo;
	}

	public void setSp_codigo(SituacionPagamento sp_codigo) {
		this.sp_codigo = sp_codigo;
	}

	public Usuario getUsu_codigo() {
		return usu_codigo;
	}

	public void setUsu_codigo(Usuario usu_codigo) {
		this.usu_codigo = usu_codigo;
	}

	public Estado getEs_codigo() {
		return es_codigo;
	}

	public void setEs_codigo(Estado es_codigo) {
		this.es_codigo = es_codigo;
	}

	public List<CobroDet> getLista_cobro_det() {
		return lista_cobro_det;
	}

	public void setLista_cobro_det(List<CobroDet> lista_cobro_det) {
		this.lista_cobro_det = lista_cobro_det;
	}
    
   
    
    
}
