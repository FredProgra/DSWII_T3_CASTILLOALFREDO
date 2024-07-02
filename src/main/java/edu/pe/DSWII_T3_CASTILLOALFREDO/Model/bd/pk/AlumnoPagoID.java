package edu.pe.DSWII_T3_CASTILLOALFREDO.Model.bd.pk;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class AlumnoPagoID implements Serializable {
    private String idalumno;
    private String ciclo;
    private Integer ncuota;
}
