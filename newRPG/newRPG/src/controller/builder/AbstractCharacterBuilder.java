/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.builder;
import data.datatypes.characters.Characters;

/**
 *
 * @author udesc
 * @param <T> Class of the Character
 */
public abstract class AbstractCharacterBuilder<T extends AbstractCharacterBuilder<T>> {

    private T Mago;
    
    protected abstract T getThis();
    protected String name;
    protected int str;
    protected int conc;
    protected int cons;
    protected int spr;
    protected int speed;
    protected int defenseRating;
    
    public T foo(){
        return getThis();
    }
    
    public AbstractCharacterBuilder<T> setName(String name){
        this.name = name;
        return this;
    }

    /**
     * @param str the str to set
     */
    public AbstractCharacterBuilder<T> setStr(int str) {
        this.str = str;
        return this;
    }

    /**
     * @param conc the conc to set
     */
    public AbstractCharacterBuilder<T> setConc(int conc) {
        this.conc = conc;
        return this;
    }

    /**
     * @param cons the cons to set
     */
    public AbstractCharacterBuilder<T> setCons(int cons) {
        this.cons = cons;
        return this;
    }

    /**
     * @param spr the spr to set
     */
    public AbstractCharacterBuilder<T> setSpr(int spr) {
        this.spr = spr;
        return this;
    }

    /**
     * @param speed the speed to set
     */
    public AbstractCharacterBuilder<T> setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    /**
     * @param defenseRating the defenseRating to set
     */
    public AbstractCharacterBuilder<T> setDefenseRating(int defenseRating) {
        this.defenseRating = defenseRating;
        return this;
    }
    
    public T build(){
        T thing = getThis();
    }
    
}
