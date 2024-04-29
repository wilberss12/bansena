package org.badsena.cgmlti.java.entidades;
import java.time.LocalDateTime;

import javax.xml.crypto.Data;

public class Campania extends Habilitante {
    private String nombre;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    public Campania(Double valor, String nombre, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        super(valor);
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDateTime getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }
    

   

}
