package edu.pe.DSWII_T3_CASTILLOALFREDO.Model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    private String idalumno;
    private String apealumno;
    private String nomalumno;
    @ManyToOne
    @JoinColumn(name = "idesp")
    private Especialidad especialidad;
    private String proce;
}
