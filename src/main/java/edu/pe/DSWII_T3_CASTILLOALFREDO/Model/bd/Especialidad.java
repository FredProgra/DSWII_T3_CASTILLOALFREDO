package edu.pe.DSWII_T3_CASTILLOALFREDO.Model.bd;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "especialidad")
public class Especialidad {
    private String idesp;
    private String nomesp;
    private double costo;
}
