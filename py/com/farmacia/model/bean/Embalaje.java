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
@SequenceGenerator(name = "seq_embalaje", sequenceName = "seq_embalaje", allocationSize = 1, initialValue = 1)
@Table
public class Embalaje {

    @Id
    @GeneratedValue( generator="seq_embalaje")
    private Integer emb_codigo;
    
    @Column(nullable=true, length=50)
    private String emb_nombre ;
    
    @Column
    private Integer emb_cantidad; // tipo presentacion, cuantos productos entran en la embalaje
    
    @ManyToOne
    @JoinColumn(name="usu_codigo", nullable=true)
    @ForeignKey(name="fk_usu_codigo" )
    private Usuario usu_codigo;

    
    public String toString(){
        return emb_nombre ;
    }
    
  
    public Integer getEmb_codigo() {
        return emb_codigo;
    }

 
    public void setEmb_codigo(Integer emb_codigo) {
        this.emb_codigo = emb_codigo;
    }

  
    public String getEmb_nombre() {
        return emb_nombre;
    }

    public void setEmb_nombre(String emb_nombre) {
        this.emb_nombre = emb_nombre;
    }

 
    public Integer getEmb_cantidad() {
        return emb_cantidad;
    }


    public void setEmb_cantidad(Integer emb_cantidad) {
        this.emb_cantidad = emb_cantidad;
    }

    
    public Usuario getUsu_codigo() {
        return usu_codigo;
    }

  
    public void setUsu_codigo(Usuario usu_codigo) {
        this.usu_codigo = usu_codigo;
    }
    
    
    
    
    
    
}
