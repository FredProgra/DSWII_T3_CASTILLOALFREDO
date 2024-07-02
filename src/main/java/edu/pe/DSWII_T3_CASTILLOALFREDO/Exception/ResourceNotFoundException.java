package edu.pe.DSWII_T3_CASTILLOALFREDO.Exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
}
