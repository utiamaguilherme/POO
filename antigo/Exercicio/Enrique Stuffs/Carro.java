/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author udesc
 */
public class Carro {
    private String cor;
    private String proprietario;
    private int ano;
    private int quilometragem;
    private int valor;

 void pintar( String novaCor ){
        setCor(novaCor);
 }

 void lavar(){
 System.out.println("O carro está brilhando!");
 }

 void alterarValor( int novoValor ){
        setValor(novoValor);
 }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        if (cor.length() >= 3){
            this.cor = cor;
        } else {
            System.out.println("deve conter mais que tres caracteres");
        }
    }

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
        if (cor.length() >= 3){
            this.proprietario = proprietario;
        } else {
            System.out.println("deve conter mais que tres caracteres");
        }
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        if (ano > 1700 && ano < 2500){
            this.ano = ano;
        } else {
            System.out.println("dados incorretos");
        }
        
    }

    /**
     * @return the quilometragem
     */
    public int getQuilometragem() {
        return quilometragem;
    }

    /**
     * @param quilometragem the quilometragem to set
     */
    public void setQuilometragem(int quilometragem) {
        if (ano > 1700 && ano < 2500){
            this.quilometragem = quilometragem;
        } else {
            System.out.println("dados incorretos");
        }
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

}
