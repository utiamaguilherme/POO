/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import java.util.Scanner;
/**
 *
 * @author udesc
 */
public class POO {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        final int MAXXX = 30;
        AgendaMemoria agenda = new AgendaMemoria(MAXXX);
        AgendaArquivo arquivo = new AgendaArquivo("Arquivao.txt");
        
        Contato carinha = new Contato("111", "Joao", "rua seila", "996381223", "996381223", "joao@gmail.com");
        Contato outro = new Contato("112", "Joao", "rua seila", "996381223", "996381223", "joao@gmail.com");
        Contato outrro = new Contato("113", "Joao", "rua seila", "996381223", "996381223", "joao@gmail.com");
        
        if(arquivo.adicionarContato(carinha)){
            System.out.println("Contato adicionado");
        }
        
        if(arquivo.adicionarContato(outro)){
            System.out.println("Contato adicionado");
        }
        
        if(arquivo.adicionarContato(outrro)){
            System.out.println("Contato adicionado");
        }
        
        if(arquivo.removerContato(111)){
            System.out.println("Apagou");
        }else{
            System.out.println("Nao apagou");
        }
        
        outrro.setEmail("cabecudo@gmail.com");
        if(arquivo.alterarContato(outrro)){
            System.out.println("Alterou");
        }else{
            System.out.println("Nao alterou");
        }
        
        System.out.println(arquivo.consultarContato(111));
        System.out.print(arquivo.consultarContato(112));
        System.out.print(arquivo.consultarContato(113));
        
    }
    
}
