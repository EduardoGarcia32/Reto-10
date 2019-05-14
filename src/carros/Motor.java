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
public class Motor {
   private String numero_serie;
    private int potencia;
    private int numero_cilindros;

    public Motor(String numero_serie, int potencia, int numero_cilindros) {
        this.numero_serie = numero_serie;
        this.potencia = potencia;
        this.numero_cilindros = numero_cilindros;
    }

    public Motor() {
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumero_cilindros() {
        return numero_cilindros;
    }

    public void setNumero_cilindros(int numero_cilindros) {
        this.numero_cilindros = numero_cilindros;
    }
  
}
