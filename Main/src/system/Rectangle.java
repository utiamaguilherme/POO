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
public class Rectangle extends Shape{
    
    private double width;
    private double height;
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }
    
    @Override
    public double getArea(){
        return getHeight()*getWidth();
    }
    
    @Override
    public double getPerimeter(){
        return 2*getHeight()+2*getWidth();
    }
    
    @Override
    public String toString(){
        String ret = "Width = " + getWidth() + "\n"
                    +"Height = " + getHeight() + "\n"
                    +"Perimeter = " + getPerimeter()+"\n"
                    +"Area = " + getArea()+"\n"
                    +super.toString();
        return ret;
    }
    
}
