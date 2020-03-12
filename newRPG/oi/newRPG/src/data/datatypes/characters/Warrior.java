/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.datatypes.characters;
//import Itens.*;

/**
 *
 * @author 3
 */
public class Warrior extends Characters{
        
    public Warrior(String name, int HP, int MP, int str, int conc, int cons, int spr, int speed){
        super(name, HP, MP, str, conc, cons, spr, speed);
    }
//    @Override
    public int ataqueFisico(){
        return (int)(0.40*str + (0.15));
    }
    
}
