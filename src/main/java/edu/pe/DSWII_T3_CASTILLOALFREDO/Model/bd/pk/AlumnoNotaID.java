package edu.pe.DSWII_T3_CASTILLOALFREDO.Model.bd.pk;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class AlumnoNotaID implements Serializable {
    private String idalumno;
    private String idcurso;
}
