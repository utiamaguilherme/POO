/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooaulaoitothread;

/**Threads -> funções que ocorrem ao msm tempo
 *
 * @author udesc
 */
public class PooAulaOito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Usando a classe Thread
        Contador ca = new Contador("Pedrinho", 1, 100);//Isso pode ser melhorado com um vetor de Contador, Contador vetora =  new Contador[3];
        Contador cb = new Contador("Paulinho", 100, 200);//for(int i = 0; i < 3; i++){
        Contador cc = new Contador("Renatinho", 200, 300);//vetora[i] = new Contador("nome", valor1, valor2);
                                
        //Executando as thread.
        // Método Start pertence aos Thread
        //ca.start();
        //cb.start(); => Com o Runnable, não posso executar isso!! Preciso fazer o seguinte(linha 30)!
        //cc.start();
        //A ordem varia, o computador escolhe a ordem que vai executar as funções
        //Quando eu starto um Thread ele vai executar o que tem dentro do método Run!!!
        Thread ta = new Thread(ca);// Isso pode ser melhorado com um vetor, Thread tv = new Thread[3];
        Thread tb = new Thread(cb);// for(int i = 0; i < 3; i++){
        Thread tc = new Thread(cc);// vetor[i] new Thread(vetora[i];
                                    //}
        
        ta.start();
        tb.start();
        tc.start();
        
        try { //Isso foi usado para que o Thread da main espere as 3 terminarem para executar a proxima
            /*ca.join();
            cb.join(); => Não pode ser executado por cauxa do Runnable
            cc.join();*/
            ta.join();
            tb.join();
            tc.join();
        }
        catch(InterruptedException ex)//Mensagem de erro, exceções da aula 7
        {
            System.err.println("Deu ruim!");
        }
        System.out.println("Fim Programa!");// Quando executo Threads ele começa pelo "Fim Programa!", isso acontece
        //Porque o main tbm é um Thread, ele cria varios Threads e continua executando, logo quando ele termina, ele executa os outros
        //No caso do JAVA, ele executa os Threads dps do main terminar
        //Se quisermos que o Main espere um respectivo Thread parar, ele deve ser especificado
       /// Exercicio
       /*
        Renatinho[] vetor = new Renatinho[4];
        int x = 1;
        int f = 25000;
        for(int i = 0; i < 4; i ++){
            vetor[i] =  new Renatinho(x, f);
            x = 1 + f;
            f = f + 25000;
            vetor[i].start();
        }*/
        //A forma que dividimos o exercicio não está 100% correta, já que a 4ª Thread, a de 75001 ~ 100000 vai trabalhar mt mais que as outras
        //ela vai fazer de 1 a 75000 para testa seus valores.
        
    }
    
}
