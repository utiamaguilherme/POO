/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excessoes;

/**
 *
 * @author udesc
 */
public class ExceptionDNotExists extends Throwable {
    
    public ExceptionDNotExists(String message){
        super(message);
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
        
}
