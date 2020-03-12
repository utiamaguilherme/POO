/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaseis;

/**
 *
 * @author udesc
 */
public abstract class Shape {
    public String shapeName;
    public Shape(String forma){
        this.shapeName = forma;       
    }
    public abstract double area();
    
    public String toString(){
        return shapeName;
    };
    
}
