/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author Selner
 */
public enum Pagamento {
    A_VISTA, 
    A_PRAZO, 
    DINHEIRO;
    
    public static Pagamento getPagamento(String forma){
        if("VISTA".equals(forma))    return Pagamento.A_VISTA;
        if("PRAZO".equals(forma))    return Pagamento.A_PRAZO;
                                     return Pagamento.DINHEIRO;
    }
    
}
