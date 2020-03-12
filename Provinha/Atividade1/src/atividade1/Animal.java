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
public abstract class Animal implements Valoravel{
    public abstract float getPonderador();
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
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura > 0? altura : 0;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    public String toString(){
        return "Peso - " + peso + "kg  Altura - " + altura + " m";
    }
    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso > 0 ? peso : 0;
    }
   protected float altura;
   protected float peso;
   protected Valoremmoeda valorEmMoeda;
   public Animal(float altura, float peso){
       setAltura(altura);
       setPeso(peso);
       
       int real = (int) estimarPreco();
       float aux = estimarPreco() - real;
       int centavo = (int)( aux * 100);
       valorEmMoeda = new Valoremmoeda(real, centavo);
       
   }
    
}