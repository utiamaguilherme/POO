/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.datatypes.items;
import controller.utils.ItemType;
/**
 *
 * @author 3
 */
public abstract class Item {
    protected static int id;
    protected String name;
    protected ItemType tipo;
    
    protected Item(String name, ItemType tipo){
       this.name = name;
       this.tipo = tipo;
    }
    public String getName(){
        return name;
    }
    
    public ItemType getTipo(){
        return tipo;
    }

                            
}
