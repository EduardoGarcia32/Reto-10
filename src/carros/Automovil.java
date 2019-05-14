/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carros;

/**
 *
 * @author Eduardo Garcia
 */
public class Automovil {
        private int id_automovil;
    private String identificador;
    private String tipo_automovil;
    private double precio_renta_diario;
    private int status;
    private Motor tipo_motor;
    private Llanta llantas_auto[];
    private Faro faros_auto[];

     public Automovil(){   
    }
    
    public Automovil(int id_automovil, String identificador, String tipo_automovil, double precio_renta_diario, int status, Motor tipo_motor) {
        this.id_automovil = id_automovil;
        this.identificador = identificador;
        this.tipo_automovil = tipo_automovil;
        this.precio_renta_diario = precio_renta_diario;
        this.status = status;
        this.tipo_motor = tipo_motor;
        llantas_auto = new Llanta[4];
        faros_auto = new Faro[2];
        
    }

    public Automovil(int id_automovil, String identificador, String tipo_automovil, double precio_renta_diario, int status, Motor tipo_motor, Llanta[] llantas_auto, Faro[] faros_auto) {
        this.id_automovil = id_automovil;
        this.identificador = identificador;
        this.tipo_automovil = tipo_automovil;
        this.precio_renta_diario = precio_renta_diario;
        this.status = status;
        this.tipo_motor = tipo_motor;
        this.llantas_auto = llantas_auto;
        this.faros_auto = faros_auto;
    }

    public int getId_automovil() {
        return id_automovil;
    }

    public void setId_automovil(int id_automovil) {
        this.id_automovil = id_automovil;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo_automovil() {
        return tipo_automovil;
    }

    public void setTipo_automovil(String tipo_automovil) {
        this.tipo_automovil = tipo_automovil;
    }

    public double getPrecio_renta_diario() {
        return precio_renta_diario;
    }

    public void setPrecio_renta_diario(double precio_renta_diario) {
        this.precio_renta_diario = precio_renta_diario;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Motor getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(Motor tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    public Llanta[] getLlantas_auto() {
        return llantas_auto;
    }

    public void setLlantas_auto(Llanta[] llantas_auto) {
        this.llantas_auto = llantas_auto;
    }

    public Faro[] getFaros_auto() {
        return faros_auto;
    }

    public void setFaros_auto(Faro[] faros_auto) {
        this.faros_auto = faros_auto;
    }

}
