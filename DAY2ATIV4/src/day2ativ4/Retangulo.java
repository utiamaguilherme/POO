/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2ativ4;

/**
 *
 * @author gustavo
 */
public class Retangulo {
    double largura;
    double altura;
    double area;
    double perimetro;
    
    public Retangulo(double l, double a)
    {
        this.largura=l;
        this.altura=a;
    }
    public double area(){
        area=altura*largura;
        return area;
    }
    public double perimetro(){
        perimetro=(2*altura)+(2*largura);
        return perimetro;
    }
    public void showInfo()
    {
        System.out.println("Retangulo com "+this.altura+" de altura e "+this.largura+" de largura");
    }
    
}
