/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativ1_lista4;
import java.lang.Math;
import static java.lang.Math.sqrt;
/**
 *
 * @author udesc
 */
public class ponto2d {
    private double y, x;
    
   public ponto2d(double x, double y){
       //ponto2d aux = new ponto2d
       this.x = x;
       this.y = y;
   }
   public double calculaModulo(){
       double aux = sqrt((x*x) + (y*y));
       return aux;
   }
   public void showPonto2d(ponto2d aux){
       System.out.print();
   }
}
