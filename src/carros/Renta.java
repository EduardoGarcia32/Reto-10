/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

import java.util.Date;

/**
 *
 * @author Eduardo Garcia
 */
public class Renta {
   private Persona usuario;
    private Automovil auto_renta;
    private Date fecha_registro;
    private int dias_renta;
    private int status_renta;

    public Renta() {
    }

    public Renta(Persona usuario, Automovil auto_renta, Date fecha_registro, int dias_renta, int status_renta) {
        this.usuario = usuario;
        this.auto_renta = auto_renta;
        this.fecha_registro = fecha_registro;
        this.dias_renta = dias_renta;
        this.status_renta = status_renta;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }

    public Automovil getAuto_renta() {
        return auto_renta;
    }

    public void setAuto_renta(Automovil auto_renta) {
        this.auto_renta = auto_renta;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public int getDias_renta() {
        return dias_renta;
    }

    public void setDias_renta(int dias_renta) {
        this.dias_renta = dias_renta;
    }

    public int getStatus_renta() {
        return status_renta;
    }

    public void setStatus_renta(int status_renta) {
        this.status_renta = status_renta;
    }
    
 
}
