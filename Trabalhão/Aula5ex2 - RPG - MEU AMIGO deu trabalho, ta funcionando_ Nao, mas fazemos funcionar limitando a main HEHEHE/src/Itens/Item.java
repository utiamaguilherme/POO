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
public abstract class Item {
    private static DBItem banco;
    protected String name;
    protected int id;
    protected TipoItem tipo;
    
    protected Item(String name, TipoItem tipo){
       this.name = name;
       this.tipo = tipo;
    }
    public String getName(){
        return name;
    }
    
    public TipoItem getTipo(){
        return tipo;
    }

//    public void addItem(String name, TipoItem tipo) {
//        this.name = name;
//        this.tipo = tipo;
//        this.id = banco.add_item_to_db(this);
//        if(this.id == -1){
//            this.name = null;
//            this.tipo = null;
//        }
//    }
//    
//    public static Item getByID(int ID){
//        return (Consumable)banco.getByID(ID);
//    }
                            
}
