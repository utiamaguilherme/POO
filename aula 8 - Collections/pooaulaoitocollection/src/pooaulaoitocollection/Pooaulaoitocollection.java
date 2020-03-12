
package pooaulaoitocollection;

import java.util.Collections; //Coleções, tudo aquilo que aprendi em EDA implementado de forma facil, Busca Binaria, Fila, Pilha!!
import java.util.HashMap;
import java.util.Iterator;//Para iterator
import java.util.LinkedList;//Para Linked List
import java.util.Scanner;
//Collection é uma classe abstrata, não posso instancia-la, mas existe vários métodos útil dentro dela.
//LIST
    //Linked list -> lista encadeada
    //Array List -> vetor de array, cria espaços pra vc
    //Vector->funciona como array list, mas nao sei o que é as diferenças, não entendi
       //Array Deque -> Lista Duplamente encadeada
//Queue
    //Priority Queue -> Fila de prioridade
//MAP
    //Hash Map
        //Stack
//SET
    //Hash Set -> Arvore de Hash -> Elementos não se repitam
    //Tree Set -> Arvore binária -> Elementos não se repitam
//Posso usar HashMap, criar objetos HashMap <String, Integer> listaA = new HashMap<String, Intenger>();
// listaA.put("Maça", 2);
// listaA.keySet() -> Me retorna uma chave de String, todas as strings
//for(String aux: listaA.keySet()){ sout(aux + " -> " + listaA.get(aux));}
public class Pooaulaoitocollection {

    public static void main(String[] args) {
        HashMap <String, Integer> listaA = new HashMap<String, Integer>();
        listaA.put("Laranja", 3);
        listaA.put("Chocolate", 4);
        listaA.put("Alho Poro", 6);
        
        for(String aux: listaA.keySet()){
            System.out.println(aux +" => " + listaA.get(aux));
        }
        while(true)
        {
            Scanner entrada = new Scanner(System.in);
            String x = entrada.nextLine();
            if(x.compareTo("sair") == 0)
                break;
            else
                System.out.println("Custa R$ " + listaA.get(x));
            
        }
        
        
      /* LinkedList<Integer> listaA; // Criando minha LinkedList
       listaA = new LinkedList<Integer>();

      listaA.add(36); //Adicionando elementos
      listaA.add(12); //Adicionando elementos
      listaA.add(24); //Adicionando elementos
      listaA.add(48); //Adicionando elementos
      listaA.add(96); //Adicionando elementos
      //listaA.sort();//Ordenando! -> Parece que nao funcionou
      Collections.sort(listaA);//Ordenando!
      for(int i=0; i < listaA.size(); i++)
      {
        System.out.println(listaA.get(i));//Printando tudo que tem dentro da listaA
      }
      Collections.reverse(listaA); //Revertendo a lista
      for( Integer aux : listaA){//Foreach(listaA as aux) --> pega todos os valores int da listaA
          System.out.println(aux);
      }
      Collections.shuffle(listaA);
      listaA.remove(1);
      Iterator it = listaA.iterator(); // Metodo chamado iterator que importa o iterador sobre ela
      while(it.hasNext()){//Nao sei pra que serve essa porra!!!
          Integer aux = (Integer) it.next();//Casting, definir que é um (INTEGER)]
          System.out.println(aux);
      }
      Collections.reverse(listaA);
      listaA.forEach((valor)->{//Puta função estranha, mas ela é um foreach!
          System.out.println("v:" + valor);
      });*/
    }
    
}
