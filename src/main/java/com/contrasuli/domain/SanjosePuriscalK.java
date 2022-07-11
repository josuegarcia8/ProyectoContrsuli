package com.contrasuli.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
//k significa semanal
//d significa fin de semna
@Data
@Entity
@Table(name="sanjose_puriscal_k")
public class SanjosePuriscalK implements Serializable {
    
    
    
    //Para utilizarlo en la generación de la llave primaria autoincremental
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSpwk145;

    private String hora;
    private String servicio;

    public SanjosePuriscalK() {
    }

    public SanjosePuriscalK(String hora, String servicio) {
        this.hora = hora;
        this.servicio = servicio;
    }

    

   
}
