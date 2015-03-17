
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
@SequenceGenerator(name = "seq_venta_det", sequenceName = "seq_venta_det"
                        , allocationSize = 1, initialValue = 1)
@Table
public class VentaDetalle {
    
	
    @Id
    @GeneratedValue(generator = "seq_venta_det")
    private Integer vd_codigo;    
    
    

    
    @ManyToOne
    @JoinColumn(name = "pro_codigo")
    @ForeignKey(name="Fk_pro_codigo")
    private Remedio remedio;  
    
 

	@Column
    private Integer vd_cantidad;    
   

	@Column
    private Double vd_precio;
    
    @Column
    private Double vd_total;

	public Integer getVd_codigo() {
		return vd_codigo;
	}

	public void setVd_codigo(Integer vd_codigo) {
		this.vd_codigo = vd_codigo;
	}

	public Remedio getRemedio() {
		return remedio;
	}

	public void setRemedio(Remedio remedio) {
		this.remedio = remedio;
	}

	public Integer getVd_cantidad() {
		return vd_cantidad;
	}

	public void setVd_cantidad(Integer vd_cantidad) {
		this.vd_cantidad = vd_cantidad;
	}

	public Double getVd_precio() {
		return vd_precio;
	}

	public void setVd_precio(Double vd_precio) {
		this.vd_precio = vd_precio;
	}

	public Double getVd_total() {
		return vd_total;
	}

	public void setVd_total(Double vd_total) {
		this.vd_total = vd_total;
	}

    
}
