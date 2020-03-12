/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 3
 */
public class Carro {
    
    private int key;
    private int ano;
    private int quilometragem;
    private int valor;
    private String proprietario;
    private String modelo;
    private String cor;
    
    Carro(int key){
        this.key = key+1;
    }
    
    public void show(){
        System.out.println("Carro #" + this.key + ": cor " + this.cor + ", ano " +
                         this.ano + ", " + this.quilometragem + " km, avaliado "
                         + "em R$ " + this.valor);
    }
    
    public void setCustom(String cor, int ano, int km, int valor){
        this.cor = cor;
        this.ano = ano;
        this.quilometragem = km;
        this.valor = valor;
    }
    
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        if(quilometragem >= 0)
            this.quilometragem = quilometragem;
        else
            System.out.println("O carro so andou de re carai?");
    }
 
    public int getValor() {
        return valor;
    }
 
    public void setValor(int valor) {
        if(valor >= 0)
            this.valor = valor;
        else
            System.out.println("Ta querendo doar mais o que?");
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        if(proprietario.length() > 3)
            this.proprietario = proprietario;
        else
            System.out.println("Nome muito curto");
    }

    public String getModelo() {
        return modelo;
    }
 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if(cor.length() > 3)
            this.cor = cor;
        else
            System.out.println("Nao conheco cor com nome tao curto");
    }
    
}
