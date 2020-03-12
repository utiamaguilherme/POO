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
public class Consumable extends Item{
    int level;
    public Consumable(String name, TipoItem tipo, int level) {
        super(name, tipo);
        this.level = level;
    }
    
    public int getBuff(){
        return 4 + level;
    }
    
    
    
}
