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
public class Cylinder extends Shape{
    private double radius;
    private double height;
    
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public double Area(){
        return 2*Math.PI*radius*(radius+height);
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" + "Radius = "
                + radius + "\n" + "Height = "
                + height + "\n" + "Volume = "
                + Area() + "\n";
    }
}
