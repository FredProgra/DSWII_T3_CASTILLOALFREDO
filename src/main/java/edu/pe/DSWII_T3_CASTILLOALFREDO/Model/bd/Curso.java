package edu.pe.DSWII_T3_CASTILLOALFREDO.Model.bd;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    private String idcurso;
    private String nomcurso;
    private Integer credito;
}
