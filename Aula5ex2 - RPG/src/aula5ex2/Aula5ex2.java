/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5ex2;
import Characters.*;
import Itens.*;
/**
 *
 * @author 3
 */
public class Aula5ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Armor arma_dura = new Armor("arma_dura", 10, 6);
        Weapon ex_pada = new Weapon("ex-pada", 15, 6);
        
        Warrior gherreru = new Warrior("Jose", 100, 100, 25, 5, 10, 2, arma_dura, ex_pada, 100);
        Characters normau = new Characters("Adalberto", 100, 100, 25, 5, 10, 2, arma_dura, ex_pada);
        
        Attack(gherreru, normau, AttackType.FISICO);
        Attack(gherreru, normau, AttackType.MAGICO);
        System.out.println();
        System.out.println(gherreru);
        System.out.println(normau);
        
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
    
}
