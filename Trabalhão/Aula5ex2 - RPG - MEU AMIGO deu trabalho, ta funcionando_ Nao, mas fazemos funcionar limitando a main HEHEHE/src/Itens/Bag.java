/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Itens;
import Excessoes.*;

/**
 *
 * @author udesc
 */
public class Bag {
    final private int tam=4;
    final private int maxAgrupado=5;
    final private Item[][] bag = new Item [tam][tam]; 
    
    public void Bag(){
        
    }
    
    /**
     *
     * @param item > Equipment to be added to bag.
     * @throws ExceptionBagCheia > In case of full bag item is not added.
     */
    public void adicionarItens(Item item) throws ExceptionBagCheia{
        for(int i=0; i<tam; i++){
            for(int j=0; j<tam; j++){
                if(bag[i][j] == null){
                    bag[i][j] = item;
                    return;
                }
            }
        }
        throw new ExceptionBagCheia("A mochila esta cheia!");
    }
    
    public void removerItem(Item item) throws ExceptionDNotExists{
        for(int i=0; i<tam; i++){
            for(int j=0; j<tam; j++){
                if(bag[i][j].equals(item)){
                    bag[i][j] = null;
                    return;
                }
            }
        }
        throw new ExceptionDNotExists("O item nao existe");
    }
    
    /**
     * 
     * @param i -> Expects position beginning from 0
     * @param j -> Expects position beginning from 0
     * @throws ExceptionDNotExists if the position is null throw exception
     */
    public void removerItem(int i, int j) throws ExceptionDNotExists {
        
        if(bag[i][j] != null){
            bag[i][j] = null;
            return;
        }
        
        throw new ExceptionDNotExists("Nao ha nada para remover");
    }
    
    public void verificaItem(Item item){
        for(int i=0; i<tam; i++){
            for(int j=0; j<tam; j++){
                if(bag[i][j] == item)
                    System.out.println("Item encontrado");
            }
        }
    }
    
    public void getBag(){
        int k=1;
        for(int i=0; i<tam; i++){
            for(int j=0; j<tam; j++){
                
                if(bag[i][j] != null){
                    k++;
                    System.out.print(k + ".[" + bag[i][j].getName() + "] ");
                }
                
                else{
                    System.out.print("[] ");
                }
            }
            System.out.println("");
        }
    }
    
    public Item getBag(int escolha){
        int k=1;
        for(int i=0; i<tam; i++){
            for(int j=0; j<tam; j++){
                
                if(bag[i][j] != null){
                    
                    k++;
                    if(k==escolha)
                        return bag[i][j];
                }
                
                else{
                    System.out.print("[] ");
                }
            }
            System.out.println("");
        }
        return null;
    }
    
}
