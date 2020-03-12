/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1_ativ6;

/**
 *
 * @author Enrique Georg Erbs
 */
public class Aula1_ativ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            boolean teste = true;
            for (int j = 2; j <= i; j++) {
                if (((i % j) == 0) && (j != i)) {
                    teste = false;
                    break;
                }
            }
            if (teste) {
                System.out.println(i + " p");
            } else {
                System.out.println(i + " np");
            }
        }
    }
    
}
