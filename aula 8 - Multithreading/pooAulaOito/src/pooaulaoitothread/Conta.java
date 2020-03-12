/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooaulaoitothread;

/**
 *
 * @author udesc
 */
//PROBLEMAS COM THREADS - Atomicidade
public class Conta {
    
   public static int saldo = 200; //Todas as contas tem esse valor
   public static int qtd = 5000;
   private static final Object trava = new Object();//Objeto usado para eu travar o synchronized
   private static final Object trava2 = new Object();//Só vai bloquear o que tiver trava2!
    public static void main(String args[]){//Classe tbm é main
        Producer p  = new Producer();
        Consumer c = new Consumer();
        p.start();
        c.start();
        try{
            p.join();
            c.join();
        }
        catch(InterruptedException ex){
            
        }
        System.out.println("Saldo: " + Conta.saldo);
        
    }
    //Adotarei dois métodos para corrigir
    public static synchronized void incrementa(){
        saldo += 1;
    }
    public static synchronized void decrementa(){ //Isso limita que que só possa fazer um e nao outro!
        saldo -= 1;
    }
    public static void aumenta(){
        synchronized(trava) //Todos os blocos que são sincronizados com essa trava, não podem acontecer ao msm tempo
        {
        saldo +=1;
        }
    }
    public static void diminui(){
        synchronized(trava)
        {
        saldo -=1;
        }
    }
}
//Espera-se que implementando os 2 métodos, o valor final do saudo seja 200, ja que vou somar 5000 e diminuir;
//Isso não acontece, Por que? Pois, meu Conta.saldo vai estar com um valor sendo mexido por outra Thread, ao msm tempo 
//Conta.saldo = Conta.saldo(Esse valor pode não ser o saldo que se esperava, pois a Thread pode ter mudado) + 1
//ESSE PROBLEMA É CHAMADO DE ATOMICIDADE DA OPERAÇÃO, precisamos que Operações se torne atomica!
//Precisamos garantir, que apenas uma dessas duas operações seja executada por Vez
class Producer extends Thread{ //Produz dinheiro, sempre soma +1
    @Override
    public void run(){
        for(int i= 0; i< Conta.qtd; i++){
            // Essa linha da ruim Conta.saldo += 1; 
            //Conta.incrementa(); //Apenas adotando o método não adianta! preciso do synchronized!
            Conta.aumenta();//Esse método possui o sincronizado Trava
        }
    }
}
class Consumer extends Thread{ //Consome dinheiro
    @Override
    public void run(){
        for(int i= 0; i<Conta.qtd; i++){
           //Essa kubga da ruim Conta.decrementa();
          // Conta.decrementa();//Apenas adotando o método não adianta! preciso do synchronized!
          Conta.diminui();//Esse método possui o sincronizado Trava
        }
    }
}