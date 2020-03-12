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
public class RectangularPrism extends Shape{
    
    private double width;
    private double height;
    private double length;
    
    public RectangularPrism(double width, double height, double length){
        super("Rectangular Shape");
        this.width = width;
        this.height = height;
    }
      
    @Override
    public double area(){
        return 2*(width*height + width*length + length*height);
    }
        
    @Override
    public String toString(){
        return super.toString() + "\n"
                + area();
    }
    
}
