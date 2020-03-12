/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;
import util.Shape;
/**
 *
 * @author udesc
 */
public class Circle extends Shape{
    
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    
    @Override
    public String toString(){
        String ret = "Radius = " + getRadius() + "\n"
                    +"Perimeter = " + getPerimeter()+"\n"
                    +"Area = " + getArea()+"\n"
                    +super.toString();
        return ret;
    }
    
}
