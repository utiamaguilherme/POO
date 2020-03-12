/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaseis;
import java.lang.Math;

/**
 *
 * @author udesc
 */
public class Cylinder extends Shape{
    private double raio;
    private double altura;
    public Cylinder(String forma) {
        super(forma);
    }

    @Override
    public double area() {
        double x = Math.pow(this.raio,2) * Math.PI * this.altura;
        return x;
    }

    @Override
    public String toString() {
        return super.toString() + " \n area = " + area();
    }
    
}
