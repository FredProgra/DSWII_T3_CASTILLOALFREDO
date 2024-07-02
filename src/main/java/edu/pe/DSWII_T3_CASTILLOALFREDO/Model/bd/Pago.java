package edu.pe.DSWII_T3_CASTILLOALFREDO.Model.bd;

import edu.pe.DSWII_T3_CASTILLOALFREDO.Model.bd.pk.AlumnoPagoID;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "pago")
public class Pago {
    @EmbeddedId
private AlumnoPagoID id;
    private double monto;
    private String fecha;
    @ManyToOne
    @MapsId("idalumno")
    @JoinColumn(name = "idalumno")
    private  Alumno alumno;
    @ManyToOne
    @MapsId("ciclo")
    @JoinColumn(name = "ciclo")
    private  String ciclo;
}
