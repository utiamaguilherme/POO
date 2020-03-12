/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaseis;

/**
 *
 * @author udesc
 */
public class RectangularPrism  extends Shape{
    private double altura;
    private double largura;
    private double comprimento;

    public RectangularPrism(String forma,double altura, double largura, double comprimento) {
        super(forma);
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public double area() {
        double x = this.altura * this.largura * this.comprimento;
        return x;
    }

    @Override
    public String toString() {
        return super.toString() + " \n area = " + area();
    }
    
}
