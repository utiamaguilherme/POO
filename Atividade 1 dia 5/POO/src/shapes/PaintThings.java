/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.text.DecimalFormat;

public class PaintThings{
    
 public static void main (String[] args){
     
    final double COVERAGE = 350;
    Paint paint = new Paint(COVERAGE);
    double deckAmt, ballAmt, tankAmt;
    // Instancia as três formas a serem pintadas
    RectangularPrism r = new RectangularPrism(10, 20, 35);
    Sphere s = new Sphere(15);
    Cylinder c = new Cylinder(10, 30);
    deckAmt = paint.amount(r);
    ballAmt = paint.amount(s);
    tankAmt = paint.amount(c);
    //    System.out.println(s);

    // Computa a quantidade de tinta necessária para cada forma
    // ...
    // Mostra a quantidade de tina necessária.
    DecimalFormat fmt = new DecimalFormat("0.#");
    System.out.println ("\n# de latões necessários...");
    System.out.println ("Deck: " + fmt.format(deckAmt));
    System.out.println ("Big Ball: " + fmt.format(ballAmt));
    System.out.println ("Tank: " + fmt.format(tankAmt));
    }
}