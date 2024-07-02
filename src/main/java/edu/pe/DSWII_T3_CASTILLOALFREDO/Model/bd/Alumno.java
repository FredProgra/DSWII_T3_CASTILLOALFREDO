package edu.pe.DSWII_T3_CASTILLOALFREDO.Model.bd;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "alumno")
public class Alumno {
    @Id
    private String idalumno;
    private String apealumno;
    private String nomalumno;
    private String idesp;
    private String proce;
}
