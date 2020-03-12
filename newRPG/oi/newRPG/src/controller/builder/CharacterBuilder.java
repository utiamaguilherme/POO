/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.builder;

/**
 *
 * @author udesc
 */
public class CharacterBuilder extends AbstractCharacterBuilder<CharacterBuilder> {

    @Override
    protected CharacterBuilder getThis() {
        return this;
    }
    
    @Override
    public String toString(){
        System.out.println(this);
        return null;
    }
    
}
