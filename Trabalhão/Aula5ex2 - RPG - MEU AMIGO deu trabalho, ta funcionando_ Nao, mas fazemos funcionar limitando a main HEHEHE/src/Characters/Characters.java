/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;
import Itens.*;
import aula5ex2.AttackType;
import java.util.Random;
import Itens.*;
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
    protected Armor armor;
    protected Weapon weapon;
    protected Xp level;
    protected int defenseRating;
    protected Bag bag;
    public boolean vivo=true;
    
    //Character_Common
    public Characters(String name, int HP, int MP, int str, int conc, int cons, int spr, int speed, Armor armor, Weapon weapon, Bag bag){
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.str = str;
        this.conc = conc;
        this.spr = spr;
        this.armor = armor;
        this.weapon = weapon;
        this.bag = bag;
        this.speed = speed;
        level = new Xp();
    }
    
    public int ataqueFisico(){
        return (int)(0.15*str + (0.20*weapon.getStr()));
    }
    public int getSpeed(){
        return speed;
    }
    public int ataqueMagico(){
        
        if(MP>=5){
            MP-=5;
            return (int)(0.15*spr + 0.20*weapon.getStr());
        }
        return 0;
    }
    public void usarItem(int item){
        //Work in progress
    }
    
    public Item getBag(int n){
        return bag.getBag(n);
    }
    
    public void recebeDanoFisico(double dano){
        if(armor == null)
            HP -= dano;
        else
            HP -= (dano - defenseRating * armor.getDefesa());
    }
    
    public void recebeDanoMagico(double dano){
        HP -= dano;
    }
    
    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    
    public void equipArmor(Armor armor){
        this.armor = armor;
    }
    public void getBag(){
        bag.getBag();
    }
    
    
    @Override
    public String toString(){
        return "Name: "+name+"\n"
               + "HP: "+HP  +"\n"
               + "MP: "+MP  +"\n"
               + "Armor: "+armor.getName()+"\n"
               + "Weapon: "+weapon.getName()+"\n";
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
    
    public static void Attack(Characters attacker, Characters defensor, AttackType attack){
        double dano_causado;
        double dano_recebido;
        double hp_ini;
        double hp_fin;
        hp_ini = defensor.getHP();
        if(attack == AttackType.FISICO){
            dano_causado = attacker.ataqueFisico();
            defensor.recebeDanoFisico(dano_causado);
        }else{
            dano_causado = attacker.ataqueMagico();
            defensor.recebeDanoMagico(dano_causado);
        }
        hp_fin = defensor.getHP();
        dano_recebido = hp_ini-hp_fin;
        
        System.out.println(attacker.getName() + " Dealt " + dano_causado + " damage\n"
                          +defensor.getName() + " Received " + dano_recebido + " damage");
    }
    
    public int getLevel(){
        return level.level;
    }
    
    public void setXp(int xp){
        level.addXp(xp);
    }
    
    
}
