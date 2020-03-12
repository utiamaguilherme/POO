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
public class Equipment {
    private String name;
    protected int str;
    protected int clss;
    
    public Equipment(String name, int str, int clss){
        this.name = name;
        this.str = str;
        this.clss = clss;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public int getStr(){
        return this.str;
    }
    
    public int getClasse(){
        return this.clss;
    }
    
}
