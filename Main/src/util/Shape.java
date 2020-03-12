/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.awt.Color;

/**
 *
 * @author udesc
 */
public class Shape {
    protected Color color;
    protected boolean filled;
    
    public Shape(){
        this.color = null;
        this.filled = false;
    }
    
    public Shape(Color color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setColor(Color color){
        this.color = color;
    }
    
    public Color getColor(){
        return color;
    }
    
    public double getArea(){
        return 0;
    }
    
    public double getPerimeter(){
        return 0;
    }
    
    @Override
    public String toString(){
        if(isFilled()){
            return "Preenchido com "+color.toString()+"";
        }else{
            return "Nao preenchido";
        }
    }
}
