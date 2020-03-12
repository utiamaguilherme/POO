/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
//import java.util.Scanner;

/**
 *
 * @author udesc
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro meu_carro = new Carro("fusca");
        Carro carro_1 = new Carro ("cerato");
        Carro carro_2 = new Carro ("creta");
        Carro carro_3 = new Carro ("kicks");

        carro_1.setCor("azul escuro metalico");
        carro_2.setCor("prata");
        carro_3.setCor("preto fosco");
        carro_1.setAno(2013);
        carro_2.setAno(2006);
        carro_3.setAno(2013);
        carro_1.setQuilometragem(32055);
        carro_2.setQuilometragem(89233);
        carro_3.setQuilometragem(19631);
        carro_1.setValor(43200);
        carro_2.setValor(23900);
        carro_3.setValor(139800);
        carro_1.setProprietario("DogãoCar");
        carro_2.setProprietario("DogãoCar");
        carro_3.setProprietario("DogãoCar");
        carro_1.show();
        carro_2.show();
        carro_3.show();

    }
    
}
