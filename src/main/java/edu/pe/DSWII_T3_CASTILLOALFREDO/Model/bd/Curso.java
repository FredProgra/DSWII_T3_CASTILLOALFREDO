package edu.pe.DSWII_T3_CASTILLOALFREDO.Model.bd;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "curso")
public class Curso {
    private String idcurso;
    private String nomcurso;
    private Integer credito;
}
