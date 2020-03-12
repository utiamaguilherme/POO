/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Itens;

/**
 *
 * @author 3
 */
public class Armor extends Equipment {
    
    protected int defesa;
    
    public Armor(String name, int str, int defesa){
        super(name, str);
        this.defesa = defesa;
    }
    
    public void setStr(int str){
        if(str>0 && str<1000)
            this.str = str;
        else
            System.out.println("Invalid amount of strength");
    }
    
    public int getDefesa(){
        return defesa;
    }
    
}
