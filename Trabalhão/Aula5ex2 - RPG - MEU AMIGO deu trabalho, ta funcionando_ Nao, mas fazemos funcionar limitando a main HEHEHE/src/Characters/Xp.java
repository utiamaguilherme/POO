/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;

/**
 *
 * @author udesc
 */
public class Xp {
    protected int xp;
    protected int level;
    protected int dingAt;
    
    public Xp(){
        xp=0;
        level=1;
        dingAt=100;
    }
    
    public void level_up(int remove){
        
        xp -= dingAt;
        dingAt *= 1.5;
        level++;
        System.out.println("CONGRATULATIONS, YOU LEVELED UP TO " + level + " BUT THERE STILL IS A LOT TO DO!");
        //Caso upe mais de 1 nivel em 1 batalha
        if(xp>0)
            addXp(0);
        //
    }
    
    public int getLevel(){
        return level;
    }
    
    public void addXp(int xp){
        this.xp += xp;
        if(this.xp >= dingAt){
            level_up(this.xp);
        }
    }
    
}
