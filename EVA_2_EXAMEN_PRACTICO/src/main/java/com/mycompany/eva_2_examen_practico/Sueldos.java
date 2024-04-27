
package com.mycompany.eva_2_examen_practico;

/**
 *
 * @author oviel
 */
public class Sueldos {
    public String nombreCompleto;
    public int pago;

    public Sueldos() {
    }

    public Sueldos(String nombreCompleto, int pago) {
        this.nombreCompleto = nombreCompleto;
        this.pago = pago;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }
    
    
}
