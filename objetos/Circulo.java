/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponto2d;

/**
 *
 * @author udesc
 */
public class Circulo {
    private double raio;
    public Circulo(double raio){
        this.raio = raio;
    } 
    public void showInfo(){
        System.out.println("\nraio = " + this.raio);
    }
    public double perimetro(){
        double perimetro;
        perimetro = (2*Math.PI*(this.raio*this.raio));
        return perimetro;
    }
    public double area(){
        double area;
        area = (Math.PI*(this.raio*this.raio));
        return area;
    }
}
