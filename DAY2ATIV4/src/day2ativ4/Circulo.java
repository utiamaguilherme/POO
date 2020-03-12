/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2ativ4;

import static java.lang.Math.PI;

/**
 *
 * @author gustavo
 */
public class Circulo {
    double raio;
    double area;
    double perimetro;
    
    public Circulo(double r)
    {
        this.raio=r;
    }
    
    public void showInfo(){
        System.out.println("Circulo com "+this.raio+" de raio");
    }
    
    public double area(){
       area= raio*(Math.PI)*raio;
       return area;
    }
    public double perimetro(){
        perimetro = 2*Math.PI*raio;
        
        return perimetro;
    } 
    
}
