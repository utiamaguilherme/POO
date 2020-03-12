/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;
import Itens.*;

/**
 *
 * @author 3
 */
public class Characters {
    
    protected String name;
    protected int HP;
    protected int MP;
    protected int str;
    protected int conc;
    protected int cons;
    protected int spr;
    protected Armor armor;
    protected Weapon weapon;
    protected double ataque_fisico;
    protected double ataque_magico;
    protected double mitigacao_fisica;
    protected double mitigacao_magica;
    protected double damage_weapon_class_mod;
    protected double damage_str_mod;
    protected double damage_conc_mod;
    protected double fis_mitigation_armor_class_mod;
    protected double mag_mitigation_armor_class_mod;
    protected double mitigation_cons_mod;
    protected double mitigation_spr_mod;
    
    //Character_Common
    public Characters(String name, int HP, int MP, int str, int conc, int cons, int spr, Armor armor, Weapon weapon){
        this.name = name;
        this.HP = HP;
        this.MP = MP;
        this.str = str;
        this.conc = conc;
        this.spr = spr;
        this.armor = armor;
        this.weapon = weapon;
        damage_weapon_class_mod = 0.05;
        damage_str_mod = 0.0125;
        damage_conc_mod = 0.0125;
        fis_mitigation_armor_class_mod = 0.05;
        mag_mitigation_armor_class_mod = 0.03;
        mitigation_cons_mod = 0.005;
        mitigation_spr_mod = 0.015;
        ataque_fisico = weapon.getStr()*(1+weapon.getClasse()*damage_weapon_class_mod+str*damage_str_mod);
        ataque_magico = weapon.getStr()*(1+weapon.getClasse()*damage_weapon_class_mod+conc*damage_conc_mod);
        mitigacao_fisica = (1-armor.getClasse()*fis_mitigation_armor_class_mod-cons*mitigation_cons_mod);
        mitigacao_magica = (1-armor.getClasse()*mag_mitigation_armor_class_mod-spr*mitigation_spr_mod);
    }
    
    public double ataqueFisico(){
        return ataque_fisico;
    }
    
    public double ataqueMagico(){
        if(MP>=5){
            MP-=5;
            return ataque_magico;
        }
        return 0;
    }
    
    public void recebeDanoFisico(double dano){
        HP -= dano*mitigacao_fisica;
    }
    
    public void recebeDanoMagico(double dano){
        HP -= dano*mitigacao_magica;
    }
    
    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
        ataque_fisico = weapon.getStr()*(1+weapon.getClasse()*damage_weapon_class_mod+str*damage_str_mod);
        ataque_magico = weapon.getStr()*(1+weapon.getClasse()*damage_weapon_class_mod+conc*damage_conc_mod);
    }
    
    public void equipArmor(Armor armor){
        this.armor = armor;
        mitigacao_fisica = (1-armor.getClasse()*fis_mitigation_armor_class_mod-cons*mitigation_cons_mod);
        mitigacao_magica = (1-armor.getClasse()*mag_mitigation_armor_class_mod-spr*mitigation_spr_mod);
    }
    
    @Override
    public String toString(){
        return "Name: "+name+"\n"
               + "HP: "+HP  +"\n"
               + "MP: "+MP  +"\n"
               + "Armor: "+armor.getName()+"\n"
               + "Weapon: "+weapon.getName()+"\n";
    }
    
    protected void recalculate(){
        ataque_fisico = weapon.getStr()*(1+weapon.getClasse()*damage_weapon_class_mod+str*damage_str_mod);
        ataque_magico = weapon.getStr()*(1+weapon.getClasse()*damage_weapon_class_mod+conc*damage_conc_mod);
        mitigacao_fisica = (1-armor.getClasse()*fis_mitigation_armor_class_mod-cons*mitigation_cons_mod);
        mitigacao_magica = (1-armor.getClasse()*mag_mitigation_armor_class_mod-spr*mitigation_spr_mod);        
    }
    
    public double getHP(){
        return HP;
    }
    
    public String getName(){
        return name;
    }
    
}
