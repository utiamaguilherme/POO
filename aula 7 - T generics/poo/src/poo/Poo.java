/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author udesc
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Descritor<Integer> d1 = new Descritor(1, "Número 1", 1); // <Integer> me diz o tipo do Objeto generico
        Descritor<Character> d2 =  new Descritor("A", "A primeira letra do alfabeto: A", "A"); // <Character> me diz o tipo do Objeto generico
//       int a = d1.getObjeto(); NÃO FUNCIONA, PQ EU DECLAREI COMO OBJETO, PRECISO FAZER UM DOWNCASTING!!
        int a = (int) d1.getObjeto();
        char c = (char) d2.getObjeto();
        char d = d2.getObjetoGenerico();// Aqui eu nao preciso fazer downcasting
        System.out.println("Descricao d1:"+a+": " + d1.getDescricao());
    }
    public static void fazAlgo( Descritor d){
//        d.getObjeto() -> QUE OBJETO VOU QUERER AQUI DENTRO? Posso fazer varios instance of, mas é complicado!
        
    }
    
}
