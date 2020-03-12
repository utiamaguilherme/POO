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
public class Cavalo extends Animal {

    /**
     * @return the valorPelagem
     */
    public float getValorPelagem() {
        return valorPelagem;
    }

    /**
     * @param valorPelagem the valorPelagem to set
     */
    public void setValorPelagem() {
        if (cor == Pelagem.ALAZÃ){
            this.valorPelagem = 1.2f;
        }
        else if(cor == Pelagem.TORDILHA){
            this.valorPelagem = 0.8f;
        }
        else if(cor == Pelagem.PRETO){
            this.valorPelagem = 1.1f;
        }
        else
            this.valorPelagem = 1;
    }
    @Override
    public float estimarPreco(){
        return (float) (1+((velocidade-42)/8) * valorPelagem * ponderador);
    }
    
 
    /**
     * @return the velocidade
     */
    public float getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @return the cor
     */
    public Pelagem getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */


    /**
     * @return the ponderador
     */
    public float getPonderador() {
        return ponderador;
    }

    /**
     * @param ponderador the ponderador to set
     */
    public void setPonderador(float ponderador) {
        this.ponderador = ponderador;
    }
   private float velocidade;
   private final Pelagem cor;
   private static float ponderador = 600f;
   private float valorPelagem;
   
    /**
     *
     * @param altura
     * @param peso
     * @param velocidade
     * @param cor
     */
    public Cavalo(float altura, float peso, float velocidade, Pelagem cor) {
        super(altura, peso);
        setVelocidade(velocidade);
        this.cor = cor;
        setValorPelagem();

    }

    @Override
    public String toString(){
        String x = "Cavalo - "+ super.toString() + " Ponderador - " + ponderador + " Velocidade - " + velocidade + "km/h";
        if(cor == Pelagem.ALAZÃ){
            x = x + " Cor - Alazã";
        }
        else if(cor == Pelagem.CASTANHA){
            x = x + " Cor - Castanha";
        }
        else if(cor == Pelagem.PRETO){
            x = x + " Cor - Preta";
        }
        else if(cor == Pelagem.TORDILHA){
            x = x + " Cor - Tordilha";
        }
        return x;
    }
}
