/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_ativ1;

/**
 *
 * @author udesc
 */
public class criaConta {
    private float saldo, saldoEmprestimo, limiteEmprestimo, limiteCredito ;
    private String nome;
    private String endereco;
    private int telefone;
    
    criaConta(String nome, String endereco, int telefone){
        this.nome = nome;
        this.endereco = endereco;
        setTelefone(telefone);
        this.saldo = 0;
        this.saldoEmprestimo = 0;
        this.limiteCredito = 100;
        this.limiteEmprestimo = 1000;
    }
    
    public criaConta(int valor){
        if(valor<0){
            throw new IllegalArgumentException("");
        }
        
    }
    public boolean saque(int valor) {
        float xesque;
        xesque = this.getSaldo() + this.getLimiteCredito();
        return valor > xesque;
    }
    
    public boolean emprestimo(int valor) {
        float xesque;
        xesque = this.getSaldoEmprestimo()+ this.getLimiteEmprestimo();
        return valor > xesque;
    }
    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        if(String.valueOf(telefone).length() < 8){
            throw new IllegalArgumentException("telefone com poucos digitos\n");
        } else {
            this.telefone = telefone;
        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        if(nome.contains(" ")){
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("falta caracteres\n");
        }
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the saldoEmprestimo
     */
    public float getSaldoEmprestimo() {
        return saldoEmprestimo;
    }

    /**
     * @param saldoEmprestimo the saldoEmprestimo to set
     */
    public void setSaldoEmprestimo(float saldoEmprestimo) {
        this.saldoEmprestimo = saldoEmprestimo;
    }

    /**
     * @return the limiteEmprestimo
     */
    public float getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    /**
     * @param limiteEmprestimo the limiteEmprestimo to set
     */
    public void setLimiteEmprestimo(float limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    /**
     * @return the limiteCredito
     */
    public float getLimiteCredito() {
        return limiteCredito;
    }

    /**
     * @param limiteCredito the limiteCredito to set
     */
    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
