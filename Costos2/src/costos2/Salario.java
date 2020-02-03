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
public class Salario {
    //Atributos
    private String nombre;
    private double salario;
    private int horaExtra1;
    private int horaExtra2;
    //Metodos

    public Salario(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.horaExtra1 = 0;
        this.horaExtra2 = 0;
    }
    
}
