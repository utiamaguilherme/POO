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
public class Ponto2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double largura = 2.5;
        double altura = 6.0;
        Retangulo ret = new Retangulo (largura, altura);
        ret.showInfo(); //imprimir medidas do retangulo
        System.out.printf("area = " + ret.area() + " perimetro = " + ret.perimetro());
        double raio = 3.75;
        Circulo cir = new Circulo ( raio );
        cir.showInfo(); // imprimir valor do raio do círculo        
        System.out.printf("area = %.2f perimetro = %.2f\n",  cir.area(), cir.perimetro());
    }
    
}
