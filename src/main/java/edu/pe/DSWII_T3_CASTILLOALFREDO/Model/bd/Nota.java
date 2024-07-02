package edu.pe.DSWII_T3_CASTILLOALFREDO.Model.bd;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "nota")
public class Nota {
    @Id
    private String idalumno;
    @Id
    private String idcurso;
    private double exaparcial;
    private double exafinal;

}
