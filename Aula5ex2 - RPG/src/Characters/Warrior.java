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
public class Warrior extends Characters{
    
    private int weaponSkill;
    
    public Warrior(String name, int HP, int MP, int str, int conc, int cons, int spr, Armor armor, Weapon weapon, int weaponSkill){
        super(name, HP, MP, str, conc, cons, spr, armor, weapon);
        this.weaponSkill = weaponSkill;
        this.damage_weapon_class_mod = 0.06;
        this.damage_str_mod = 0.02;
        this.fis_mitigation_armor_class_mod = 0.05;
        this.mitigation_cons_mod = 0.008;
        super.recalculate();
    }
    
}
