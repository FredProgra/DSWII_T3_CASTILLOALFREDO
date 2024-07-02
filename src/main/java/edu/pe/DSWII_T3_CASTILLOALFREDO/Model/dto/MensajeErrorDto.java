package edu.pe.DSWII_T3_CASTILLOALFREDO.Model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class MensajeErrorDto {
    private  Integer codigo;
    private Date fechaError;
    private String mensaje;
    private String description;
}
