/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativ1_lista4;

import java.util.Scanner;


/**
 *
 * @author udesc
 */
public class Ativ1_lista4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x, y;
        Scanner teclado = new Scanner(System.in);
        x = teclado.nextDouble();
        y = teclado.nextDouble();
        ponto2d aux = new ponto2d(x,y);
        double xesque = aux.calculaModulo();
        System.out.printf("x: %.2lf " + aux.x + "y: %.2lf " + aux.y + " modulo: %.2lf" + xesque);
    }
    
}
