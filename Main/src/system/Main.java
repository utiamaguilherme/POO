/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;
import java.awt.Color;
import util.*;
/**
 *
 * @author Selner
 */

public class Main {
     
    public static void main(String[] Args){
        Circle circle = new Circle(7);
        circle.setColor(Color.blue);
        
        Square square = new Square(5);
        
        Rectangle rectangle = new Rectangle(3,6);
        rectangle.setColor(Color.BLACK);
        
        Shape shape = new Shape();
        shape.setColor(Color.green);
        
        if(shape instanceof Shape){
            System.out.println("WOWO");
        }
        rectangle.setColor(null); 
    }
}
