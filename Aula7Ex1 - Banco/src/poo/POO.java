/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author udesc
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta cc1 = null, cc2 = null;
        try {
            cc1 = new Conta("Nome 1", "endereco1", "888888888888");
            cc2 = new Conta("Nome 2", "endereco2", "99999999999");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        cc1.deposito(200);
        cc2.deposito(150);
        
        try {
            Conta.transferencia(cc1, cc2, 300);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        System.out.println(cc1);
        System.out.println(cc2);
        
        
        
        
    }
    
}
