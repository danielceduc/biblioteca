/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca_regional;

/**
 *
 * @author Lab10
 */
public class estante {

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public estante(int capacidad, int cantidad) {
        this.capacidad = capacidad;
        this.cantidad = cantidad;
    }
    
    private int capacidad;
    private int cantidad;
    
}
