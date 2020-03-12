/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.awt.Color;

/**
 *
 * @author Selner
 */
public abstract class Shape {
    
    private String shapeName;
    
    public Shape(String name){
        this.shapeName = name;
    }
    
    public double area(){
        return 0;
    }
    
    /**
     *
     * @return shapeName and area;
     */
    @Override
    public String toString(){
        return shapeName;
    }
}
