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
public abstract class Excessoes {
    private Throwable erro;
    
    /**
     *
     * @param message mensagem para retorno do erro
     */
    public Excessoes(String message){
        this.erro = new Throwable(message);
    }
    
    @Override
    public String toString(){
        return erro.getMessage();
    }
}
