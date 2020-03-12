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
public class Retangulo {
    
    private double largura;
    private double altura;
    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    public void showInfo(){
        System.out.println("Largura = " + this.largura + "\nAltura = " + this.altura);
    }
    public double area(){
        double area;
        area = this.largura*this.altura;
        return area;
    }
    public double perimetro(){
        double perimetro;
        perimetro = (2*this.altura)+(2*this.largura);
        return perimetro;
    }
    
}
