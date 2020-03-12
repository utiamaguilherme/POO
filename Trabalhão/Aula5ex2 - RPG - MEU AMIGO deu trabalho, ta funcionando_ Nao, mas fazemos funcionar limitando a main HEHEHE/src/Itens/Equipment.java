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
public class Equipment extends Item{
    
    protected int str;
    protected boolean agrupavel;
    
    public Equipment(String name, int str){
        super(name, TipoItem.ARMOR);
        this.str = str;
    }
   
    public int getStr(){
        return this.str;
    }
    
}
