/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

public class Carro {

    private String cor;
    private String proprietario;
    private String nome;
    private int ano;
    private int quilometragem;
    private int valor;
    

    /**
     * @return the proprietario
     */
    public String getProprietario() {
        return proprietario;
    }

    /**
     * @param proprietario the proprietario to set
     */
    public void setProprietario(String proprietario) {
        if(proprietario.length()>3)
            this.proprietario = proprietario;
        else
            System.out.println("Proprietario invalido");
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the quilometragem
     */
    public int getQuilometragem() {
        return this.quilometragem;
    }
    
    /**
     * @param quilometragem the quilometragem to set
     */
    public void setQuilometragem(int quilometragem) {
        if(quilometragem >= 0)
            this.quilometragem = quilometragem;
        else
            System.out.println("quilometragem abaixo de zero");
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return this.valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        if(valor>=0)
            this.valor = valor;
        else
            System.out.println("valor abaixo de zero");
    }

    public Carro(String _nome){
        this.nome = _nome;
    }
    
    void pintar( String novaCor ){
        setCor(novaCor);
    }

    void lavar(){
    System.out.println("O carro "+getNome()+" está brilhando!");
    }

    void alterarValor( int novoValor ){
        setValor(novoValor);
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return this.cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        if( cor.length() > 3)
            this.cor = cor;
        else
            System.out.println("cor inválida");
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return this.ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        if( ano > 1700 && ano < 2500 )
            this.ano = ano;
        else
            System.out.println("@Carro: ano inválido!");
    }
    public void show(){
        System.out.println("O carro " +this.getNome()+"\nCor: "+this.getCor()+"\nAno: "+this.getAno()+"\nValor: "+this.getValor()+"\nProprietario: "+this.getProprietario()+"\nQuilometragem: "+this.getQuilometragem());
    }
}
