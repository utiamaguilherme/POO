/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidades;
import Characters.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import Itens.*;
import aula5ex2.AttackType;


public final class Round{
    
    private Characters[] champ = new Characters[5];
    private Characters[] deathOrder = new Characters[5];
    private int[] actionOrder = new int[5];
    private int[] playOrder = new int[5];
    private int arrayLength;
    private int deaths=0;
    private int previous;
    private boolean done = false;
    
    private static final String[] acoes = {"item", "ataque", "magia", "passar"};
    Scanner in = new Scanner(System.in);
    
    public Round(Characters[] champ){
        this.champ = champ;
        arrayLength=champ.length;
        try {
            inicia();
        } catch (Exception ex) {
            Logger.getLogger(Round.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inicia() throws Exception{
        int first = 0;
        int cases = 0;
        RodarDados dado = new RodarDados();
        
        for(int i=0; i<arrayLength; i++){
            actionOrder[i] = champ[i].getSpeed();
        }
        Sort(actionOrder);
        
        for(int i=0; i<arrayLength-1; i++){
            if(champ[i].getSpeed() == champ[i+1].getSpeed()){
                if(dado.Jogar(2) % 2 == 0){
                    exchangeNumbers(i, i+1);
                }
            }
        }
        for(int i=0; i<arrayLength; i++){
            for(int j=0; j<arrayLength; j++){
                if(champ[i].getSpeed() == actionOrder[j]){
                    playOrder[i] = j;
                    actionOrder[j] = -1;
                    break;
                }
            }
        }
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Inicio da batalha");
        battle(0);
    }    
    
    private void battle(int next){
       
        while(deaths!=arrayLength-1){
            if(deaths==arrayLength-1)break;
            int da_vez = playOrder[next];
            if(champ[da_vez].getHP() <= 0){
                next = ((next+1)%arrayLength);
                continue;
            }

            System.out.println("arrayLength: "+arrayLength);
            System.out.println("Deaths\t:"+deaths);

            int inimigo=-1;
            System.out.println(champ[da_vez]);

    //        System.out.println("AAA");
            print(da_vez); 
            String op = in.next();

            switch (getOpc(op)) {
                case 1:
                    champ[da_vez].getBag();
                    System.out.println("Esolha um dos itens para usa-lo em combate: ");
                    int escolha = in.nextInt();
                    champ[da_vez].usarItem(escolha);
                    break;
                case 2:
                    {
                        inimigo = inimigos(da_vez);
                        Characters.Attack(champ[da_vez], champ[inimigo], AttackType.FISICO);
                        break;
                    }        
                case 3:
                    {
                        inimigo = inimigos(da_vez);
                        Characters.Attack(champ[da_vez], champ[inimigo], AttackType.MAGICO);
                        break;
                    }
                default:
                    break;
            }
            checkDeaths(inimigo);
            previous=next;
            next = ((next+1)%arrayLength);
        }
        System.out.println("\n\n\n\n\n\n");
        System.out.println("FIM DA BATALHA!");
        if(deaths==arrayLength-1){
            boolean done = true;
            giveExperience(champ[previous]);
            return;
        }
        return;
    }
      
    public int inimigos(int i){
        System.out.println("Quem voce quer atacar: ");
        for(int j=0; j<arrayLength; j++){
            
            if(champ[j].getHP()>0 && j!=i){
                System.out.println(j+". "+champ[j].getName());
            }
        }
        return in.nextInt();
    }
    
    private int getOpc(String n){
        int i=1;
        for(String a : acoes){
            if(a.equals(n)) return i;
            i++;
        }
        return -1;
    }

    private void print(int da_vez) {
        System.out.println("Vez de "+champ[da_vez].getName());
        System.out.println("Ações: item | ataque | magia | passar");
        System.out.print("Ação: ");
    }

    private void checkDeaths(int inimigo) {
        if(inimigo == -1) return;
        if(champ[inimigo].getHP() <= 0){
            for(int i=0; i<arrayLength; i++){
                if(deathOrder[i] == null){
                    System.out.println(champ[inimigo].getName() + " Fainted!");
                    deathOrder[i] = champ[inimigo];
                    deaths++;
                    return;
                }
            }
        }
    }

    private void Sort(int[] actionOrder) {
        if(actionOrder == null || arrayLength == 0) return;
        quickSort(0, arrayLength-1);
        
    }
    
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = actionOrder[lowerIndex+(higherIndex-lowerIndex)/2];
        
        while (i <= j) {
            while (actionOrder[i] < pivot) {
                i++;
            }
            while (actionOrder[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = actionOrder[i];
        actionOrder[i] = actionOrder[j];
        actionOrder[j] = temp;
    }

    private void giveExperience(Characters winner) {
        int amount=20;
        int mediaNivel=0;
        for(Characters c : champ){
            if(c!=null)
                mediaNivel+=c.getLevel();
        }
        mediaNivel = mediaNivel/arrayLength;
        for(Characters c : deathOrder){
            if(c!=null){
                c.setXp(amount*(mediaNivel-c.getLevel()+3));
                System.out.println(c.getName() + " got " + amount*(mediaNivel-c.getLevel()+3) + " XP");
                amount+=5;
            }
        }
        System.out.println("WINNER IS!");
        System.out.print(winner);
        System.out.println(winner.getName() + " WON!!\n");
        winner.setXp((amount+50)*(mediaNivel+3));
        System.out.println(winner.getName() + " got " + (amount+50)*(mediaNivel+3) + " XP");
    }
    
}
