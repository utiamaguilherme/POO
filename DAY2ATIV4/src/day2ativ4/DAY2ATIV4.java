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
public class DAY2ATIV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double largura = 2.5;
        double altura = 6.0;
        Retangulo ret = new Retangulo ( largura, altura);
        ret.showInfo();
        System.out.println("area = " + ret.area() +
                "\nperimetro = " +ret.perimetro());
        double raio = 3.75;
        Circulo cir = new Circulo ( raio);
        cir.showInfo();
        System.out.println("area = "+ cir.area() +
                "\nperimetro = " + cir.perimetro());
    }
    
}
