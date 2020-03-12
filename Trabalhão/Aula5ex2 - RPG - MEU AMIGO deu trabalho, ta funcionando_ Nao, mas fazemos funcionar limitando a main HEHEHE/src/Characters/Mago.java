/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;

import Itens.Armor;
import Itens.Bag;
import Itens.Weapon;

/**
 *
 * @author 3
 */
public class Mago extends Characters{
    
    @Override 
    public int ataqueMagico(){
        if(MP>=5){
            MP-=5;
            return (int)(0.40*spr + (int)0.15*weapon.getStr()); 
        }
        return 0;
    }
    public Mago(String name, int HP, int MP, int str, int conc, int cons, int spr, int speed, Armor armor, Weapon weapon, Bag bag){
        super(name, HP, MP, str, conc, cons, spr, speed, armor, weapon, bag);
    }
    
}
