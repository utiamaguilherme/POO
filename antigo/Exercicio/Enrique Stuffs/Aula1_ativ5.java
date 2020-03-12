/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1_ativ5;
import java.util.Scanner;
/**
 *
 * @author Enrique Georg Erbs
 */
public class Aula1_ativ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int dinheiro, aux, cinquenta, dez, cinco, vinte, um;
    Scanner teclado = new Scanner ( System.in );
    dinheiro =  teclado.nextInt();
        if (dinheiro < 10 && dinheiro > 600){
            System.out.println("Valor inválido");
        } else {
            cinquenta = dinheiro / 50;
            vinte = (dinheiro % 50) / 20;
            dez = (((dinheiro % 50) % 20) / 10);
            cinco = ((((dinheiro % 50) % 20) % 10) / 5);
            um =  ((((dinheiro % 50) % 20) % 10) %5);
            System.out.println("Notas de cinquenta: " + cinquenta + "\nNotas de vinte: " + vinte
            + "\nNotas de dez: " + dez + "\nNotas de cinco: " + cinco + "\nNotas de um: " + um);
        }
    }
}
