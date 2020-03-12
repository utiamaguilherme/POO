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
public class Vaca extends Animal{

    /**
     *
     * @return
     */
    @Override
    public float estimarPreco(){
        return (float) peso * (1 + ((float)(producaoLeite - 2000)/ 8000)) * (1 + ((periodoLactacao-20)/50)) * ponderador;
    }
    
    /**
     * @return the producaoLeite
     */
    public int getProducaoLeite() {
        return producaoLeite;
    }

    /**
     * @param producaoLeite the producaoLeite to set
     */
    public void setProducaoLeite(int producaoLeite) {
        this.producaoLeite = producaoLeite;
    }

    /**
     * @return the periodoLactacao
     */
    public int getPeriodoLactacao() {
        return periodoLactacao;
    }

    /**
     * @param periodoLactacao the periodoLactacao to set
     */
    public void setPeriodoLactacao(int periodoLactacao) {
        this.periodoLactacao = periodoLactacao;
    }

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
    private int producaoLeite;
    private int periodoLactacao;
    private static float ponderador = 1.64f;
    public Vaca(float altura, float peso, int producaoLeite, int periodoLactacao ) {
        super(altura, peso);
        setProducaoLeite(producaoLeite);
        setPeriodoLactacao(periodoLactacao);
    }
    @Override
    public String toString(){
        return "Vaca - "+ super.toString() + " Ponderador - " + ponderador + " Produção de Leite - "+ producaoLeite +  "ml Periodo Lactacao - " + periodoLactacao + " dias";
    }
}
