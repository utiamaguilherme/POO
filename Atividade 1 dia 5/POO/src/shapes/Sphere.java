/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author udesc
 */
public class Sphere extends Shape {
    
    double radius;
    
    public Sphere(double radius){
        this.radius = radius;
    }
    
    @Override
    public double Area() {
        return 4*Math.PI*radius*radius;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n"
                + "Radius = " + radius + "\n"
                + "Area = " + Area();
    }
    
}
