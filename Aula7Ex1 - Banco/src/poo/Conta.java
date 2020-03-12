/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author udesc
 */
public class Conta {
    private String nome;
    private String endereco;
    private String telefone;
    private double saldo;
    private double limite_credito;
    private double saldo_emprestimo;
    private double limite_emprestimo;
    
    /**
     *
     * @param nome
     * @param endereco
     * @param telefone
     * @throws Exception
     */
    public Conta(String nome, String endereco, String telefone) throws Exception{
        if(nome.contains(" "))
            this.nome = nome;
        else
            throw new IllegalArgumentException("O nome deve ser completo");
        this.endereco = endereco;
        if(telefone.length() > 7)
            this.telefone = telefone;
        else
            throw new IllegalArgumentException("O telefone deve conter 8 digitos ou mais");
        
        this.saldo = 0;
        this.saldo_emprestimo = 0;
        this.limite_credito = 100;
        this.limite_emprestimo = 1000;
        
    }
    
    public double saque(double saque) throws Exception{
        if(saque > saldo+limite_credito)
            throw new IllegalArgumentException("Saldo insuficiente pobrento!");
        else
            saldo -= saque;
        return saque;
    }
    
    public void deposito(double deposito) {
        saldo += deposito;
    }
    
    public void emprestimo(double valor) throws Exception{
        if(valor > limite_emprestimo - saldo_emprestimo)
            throw new IllegalArgumentException("Saldo de emprestimo insuficiente pobrento!");
        else{
            saldo += valor;
            saldo_emprestimo -= valor*1.2;
        }
    }
    
    public void pagarEmprestimo(double valor){
        saldo_emprestimo -= valor;
    }
    
    public static void transferencia(Conta cc1, Conta cc2, double valor) throws Exception{  
        cc1.saque(valor);
        cc2.deposito(valor);
    }
    
    public String toString(){
        return "Nome: "+nome+"\nSaldo: "+saldo;
    }
    
}
