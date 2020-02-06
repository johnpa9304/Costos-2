/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costos2;

/**
 *
 * @author tamay
 */
public class MateriaPrima {
    //Atributos
    private String nombre;
    private double precioU;
    private int cantidad;
    //Metodos

    public MateriaPrima(String nombre, double precioU, int cantidad) {
        this.nombre = nombre;
        this.precioU = precioU;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioU() {
        return precioU;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
}
