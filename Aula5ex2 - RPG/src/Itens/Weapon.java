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
public class Weapon extends Equipment{
    
    public Weapon(String name, int str, int classe){
        super(name, str, classe);
    }
    
    public void setStr(int str){
        if(str>0 && str<1000)
            this.str = str;
        else
            System.out.println("Invalid amount of strength");
    }
    
    public void setClasse(int clss){
        if(clss >=0 && clss <=10)
            this.clss = clss;
        else
            System.out.println("Invalid class");
    }
    
}
