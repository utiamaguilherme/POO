/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;
import util.Shape;
/**
 *
 * @author Selner
 */
public class Sphere extends Shape{
    
    private double radius;
    
    public Sphere(double radius){
        super("Sphere");
        this.radius = radius;
    }
    
    @Override
    public double area(){
        return 4*Math.PI*radius*radius;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n"
                + area();
    }
    
}
