/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

/**
 *
 * @author udesc
 */
public class Produto implements Valoravel{

    /**
     * @return the valorEmMoeda
     */
    public Valoremmoeda getValorEmMoeda() {
        return valorEmMoeda;
    }

    /**
     * @param valorEmMoeda the valorEmMoeda to set
     */
    public void setValorEmMoeda(Valoremmoeda valorEmMoeda) {
        this.valorEmMoeda = valorEmMoeda;
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
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    private String nome;
    private String descricao;
    private float valor;
    private Valoremmoeda valorEmMoeda;
    
    public Produto(String nome, String descricao, float valor){
        setNome(nome);
        setDescricao(descricao);
        setValor(valor);
        
        int real = (int) estimarPreco();
        float aux = valor - real;
        int centavo = (int)( aux * 100);
        valorEmMoeda = new Valoremmoeda(real, centavo);
        
    }


    @Override
    public float estimarPreco() {
        return valor;
    }
    
    @Override
    public String toString(){
        return nome + " - Descricao - " + descricao + "- valor - " + valorEmMoeda.toString();
    }
}
