/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2ativ2;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author gustavo
 */
public class DAY2ATIV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        CARRITO carro1 = new CARRITO("Carro#1","DogãoCar","azul escuro metálico",2013,32.055,43200);
        CARRITO carro2 = new CARRITO("Carro#2","DogãoCar","prata",2006,89.223,23900);
        CARRITO carro3 = new CARRITO("Carro#3","DogãoCar","preto fosco",2013,19.631,139800);
        carro1.show();
        carro2.show();
        carro3.show();
        
        
        
    }
    
}
