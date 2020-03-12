/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<PLAYER> players = new ArrayList<>();
        String nometemp;
        int strtemp,vittemp,dextemp,agitemp;
        int escolha=1;
        int per;
        int atri;
        int quant;
        int atrib;
        int cont=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Deseja criar um personagem?: 0-NÃO 1-SIM");
        per = teclado.nextInt();
        while(per==1){
                System.out.println("Digite o nome do personagem: ");
                nometemp=teclado.next();
                System.out.println("Sua Força: ");
                strtemp=teclado.nextInt();
                System.out.println("Sua Constituição: ");
                vittemp=teclado.nextInt();
                System.out.println("Sua Destreza: ");
                dextemp=teclado.nextInt();
                System.out.println("Sua Agilidade: ");
                agitemp=teclado.nextInt();
                PLAYER pl = new PLAYER(nometemp,strtemp,vittemp,dextemp,agitemp);
                players.add(pl);
                cont++;
                System.out.println("Deseja criar mais algum personagem? 0-NÃO 1-SIM");
                per = teclado.nextInt();
        }
        
        while(escolha==1){
           System.out.println("Deseja realizar alguma operação?:\n0 - NÃO\n1-AUMENTAR ATRIBUTO\n2-MOSTRAR DADOS PERSONAGENS\n3-MOSTRAR QUANTOS PERSONAGENS FORAM CRIADOS");
           escolha= teclado.nextInt();  
           switch(escolha){
                case 0:
                    break;
                case 1:
                if(escolha==1){
                    for(int i=0;i<players.size();i++)
                    {
                        System.out.println("Deseja aumentar algum atributo do personagem "+players.get(i).getName()+"? 0-NAO 1-SIM");
                        atri = teclado.nextInt();
                        if(atri==1)
                        {
                            System.out.println("qual? 0-Força 1-Constituição, 2-Destreza, 3-Agilidade");
                            atrib = teclado.nextInt();
                            switch(atrib){
                                case 0:
                                    System.out.println("Quanto deseja aumentar?");
                                    quant = teclado.nextInt();
                                    players.get(i).setStr(quant);
                                    break;
                                case 1:
                                    System.out.println("Quanto deseja aumentar?");
                                    quant = teclado.nextInt();
                                    players.get(i).setVit(quant);
                                    break;
                                case 2:
                                    System.out.println("Quanto deseja aumentar?");
                                    quant = teclado.nextInt();
                                    players.get(i).setDex(quant);
                                    break;
                                case 3:
                                    System.out.println("Quanto deseja aumentar?");
                                    quant = teclado.nextInt();
                                    players.get(i).setAgi(quant);
                                    break;
                            }
                            
                        }
                        else
                            break;
                        
                    }}
                case 2:
                if(escolha==2){
                    for(int i=0;i<players.size();i++){
                        players.get(i).show();
                    }
                    break;
                }
                case 3:
                if(escolha==3){
                    System.out.println("O numero de personagens é "+(players.size()));
                    break;
                }}
             System.out.println("Deseja realizar mais alguma operação? 0-NAO 1-SIM");
             escolha = teclado.nextInt();
        }
    }
    
}
