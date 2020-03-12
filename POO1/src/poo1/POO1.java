/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;
import java.util.Scanner;

/**
 *
 * @author udesc
 */
public class POO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro meu_carro = new Carro("fusca");
        //meu_carro.cor = "azul";
        //meu_carro.valor = 1200;
        //meu_carro.ano = 1969;
        //meu_carro.proprietario = "tiozao";
        //meu_carro.quilometragem = 200000;
        meu_carro.setAno(1969);
        meu_carro.setCor("Azul");
        meu_carro.setValor(1200);
        meu_carro.setProprietario("tiozao");
        meu_carro.setQuilometragem(200000);
        System.out.println("O carro " +meu_carro.getNome()+"\nCor: "+meu_carro.getCor()+"\nAno: "+meu_carro.getAno()+"\nValor: "+meu_carro.getValor()+"\nProprietario: "+meu_carro.getProprietario()+"\nQuilometragem: "+meu_carro.getQuilometragem());
    }
    
}