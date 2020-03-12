/*
 */
package pooaulaoitothread;

/**
 * Classe contadora de Threads, cada Thread tem seu nome
 * @author udesc
 */
// para eu usar o Thread, preciso extender a classe Thread
public class Contador extends PooAulaOito implements Runnable //Não posso herdar de PooAulaOito, já que PooAulaOito possui Threads e Java não permite multi-herança
{//Posso corrigir isso, posso extender e implementar Runnable (implemments Runnable), mas para isso eu preciso implementar o método run()
    
       String nome;
       int i;
       int f;
       public Contador(String n, int i, int f){
           this.nome = n;
           this.i = i;
           this.f = f;
       }
       @Override // Sobrescrever, titulação opcional
       public void run() // Método pré-existente
       {
           for(; i < f; i ++) // Vai numerar todos os Threads!
           {
               if(! test(i))
                System.out.println((i) + "-" + nome);
           }
       }
       
      public boolean test(int x){// Função que criei para testar, ver como o sistema funciona!
          if(x%10 == 0){
              System.out.println("Topzeira " + nome);
              return true;
          }
          return false;
      }
}
