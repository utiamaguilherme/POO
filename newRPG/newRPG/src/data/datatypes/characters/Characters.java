/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.datatypes.characters;
import controller.utils.AttackType;
import java.util.Random;
/**
 *
 * @author 3
 */
public abstract class Characters {
    
    protected String name;
    protected int HP;
    protected int MP;
    protected int str;
    protected int conc;
    protected int cons;
    protected int spr;
    protected int speed;
    protected Xp level;
    protected int defenseRating;
    
    
    
    //Character_Common
    public Characters(String name, int HP, int MP, int str, int conc, int cons, int spr, int speed){
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.str = str;
        this.conc = conc;
        this.spr = spr;
        this.speed = speed;
        level = new Xp();
    }

    public void recebeDanoMagico(double dano){
        HP -= dano;
    }

    
    @Override
    public String toString(){
        return "Name: "+name+"\n"
               + "HP: "+HP  +"\n"
               + "MP: "+MP  +"\n";
    }
    
    public int getHP(){
        return HP;
    }
    
    public void setHP(int HP){
        this.HP = HP;
    }
    
    public String getName(){
        return name;
    }
    
//    public static void Attack(Characters attacker, Characters defensor, AttackType attack){
//        double dano_causado;
//        double dano_recebido;
//        double hp_ini;
//        double hp_fin;
//        hp_ini = defensor.getHP();
//        if(attack == AttackType.FISICO){
//            dano_causado = attacker.ataqueFisico();
//            defensor.recebeDanoFisico(dano_causado);
//        }else{
//            dano_causado = attacker.ataqueMagico();
//            defensor.recebeDanoMagico(dano_causado);
//        }
//        hp_fin = defensor.getHP();
//        dano_recebido = hp_ini-hp_fin;
//        
//        System.out.println(attacker.getName() + " Dealt " + dano_causado + " damage\n"
//                          +defensor.getName() + " Received " + dano_recebido + " damage");
//    }
    
    public int getLevel(){
        return level.level;
    }
    
    public void setXp(int xp){
        level.addXp(xp);
    }
    
    
}
