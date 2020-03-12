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
public class DBItem {
    
    private Item[] database = new Item[100];
    
    public int add_item_to_db(Item item){
        for(int i=0; i<database.length; i++){
            if(database[i] == null){
                database[i] = item;
                return i;
            }
        }
        
        System.out.println("FULL DATABASE CONTACT ADMIN");
        return -1;
    }
    
    public Item getByID(int ID){
        if(database[ID] == null){
            System.out.println("Item ID does not exist");
            return null;
        }
        return (Consumable) database[ID];
    }
    
}
