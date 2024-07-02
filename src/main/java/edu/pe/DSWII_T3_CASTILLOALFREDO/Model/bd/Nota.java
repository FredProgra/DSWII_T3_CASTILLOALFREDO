package edu.pe.DSWII_T3_CASTILLOALFREDO.Model.bd;

import edu.pe.DSWII_T3_CASTILLOALFREDO.Model.bd.pk.AlumnoNotaID;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table(name = "nota")
public class Nota {
    @EmbeddedId
    private AlumnoNotaID id;
    private String idalumno;

    private String idcurso;
    private double exaparcial;
    private double exafinal;
    @ManyToOne
    @MapsId("idalumno")
    @JoinColumn(name = "idalumno")
    private  Alumno alumno;
    @ManyToOne
    @MapsId("idcurso")
    @JoinColumn(name = "idcurso")
    private  Curso curso;

}
