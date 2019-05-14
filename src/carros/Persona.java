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
public class Persona {
        private String nombre;
    private String licencia;
    private String numero_celular;
    private String direccion;
    private String tipo_sangre;

    public Persona() {
    }
   
    public Persona(String nombre, String licencia, String numero_celular, String direccion, String tipo_sangre) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.numero_celular = numero_celular;
        this.direccion = direccion;
        this.tipo_sangre = tipo_sangre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getNumero_celular() {
        return numero_celular;
    }

    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

}
