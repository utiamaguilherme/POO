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
public class Galinha extends Animal {
       @Override
       public float estimarPreco(){
        return (float) ponderador * peso;
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
    private static float ponderador =  11.75f;
    public Galinha(float altura, float peso) {
        super(altura, peso);
    }
       @Override
    public String toString(){
        return "Galinha - "+ super.toString() + " Ponderador - " + ponderador;
    }
    
}
