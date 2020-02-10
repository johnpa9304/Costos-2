/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costos2;

/**
 *
 * @author jhon
 */
public class Indirectos {
    //Atributos
    private String nombre;
    private double costo;
    
    //Metodos
    public Indirectos(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }
    
}
