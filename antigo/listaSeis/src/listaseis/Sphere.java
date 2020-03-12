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
public class Sphere extends Shape {
    private double raio;

    public Sphere(String forma, double r) {
        super(forma);
        this.raio = r;
    }

    @Override
    public double area() {
        double x = 4 * Math.PI * Math.pow(this.raio, 2) ;
        return x; 
    }
    public String toString() {
        return super.toString() + " \n area = " + area();
    }    
}
