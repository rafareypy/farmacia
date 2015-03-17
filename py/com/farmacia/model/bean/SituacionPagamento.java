package py.com.farmacia.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "seq_sictuacion_pagamento", sequenceName = "seq_sictuacion_pagamento", allocationSize = 1, initialValue = 1)
@Table
public class SituacionPagamento {

    @Id
    @GeneratedValue(generator = "seq_sictuacion_pagamento")
    private Integer sp_codigo;
    @Column
    private String sp_desc;

    /**
     * @return the sp_codigo
     */
    public Integer getSp_codigo() {
        return sp_codigo;
    }

    /**
     * @param sp_codigo the sp_codigo to set
     */
    public void setSp_codigo(Integer sp_codigo) {
        this.sp_codigo = sp_codigo;
    }

    /**
     * @return the sp_desc
     */
    public String getSp_desc() {
        return sp_desc;
    }

    /**
     * @param sp_desc the sp_desc to set
     */
    public void setSp_desc(String sp_desc) {
        this.sp_desc = sp_desc;
    }

    
}
