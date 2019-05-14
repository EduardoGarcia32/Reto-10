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
public class Faro {
       private String marca;
    private String tipo;

    public Faro(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public Faro() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
 
}
