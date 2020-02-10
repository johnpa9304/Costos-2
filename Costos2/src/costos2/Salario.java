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

    public Salario(String nombre, double salario, int horaExtra1, int horaExtra2) {
        this.nombre = nombre;
        this.salario = salario;
        this.horaExtra1 = horaExtra1;
        this.horaExtra2 = horaExtra2;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getHoraExtra1() {
        return horaExtra1;
    }

    public int getHoraExtra2() {
        return horaExtra2;
    }
    
    public double calcularTotal(double sBasico){
        double total = 0;
        double subTotal = this.salario+((this.salario/165.33)*(this.horaExtra1*1.5))+((this.salario/165.33)*(this.horaExtra2*2));
        total = subTotal+(subTotal/12)+(subTotal/24)+(subTotal*0.1115)+(sBasico/12)+(subTotal*0.0833);
        return total;
    }
    
}
