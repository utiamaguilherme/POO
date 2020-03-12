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
public class Valoremmoeda {
    int real;
    int centavo;
    public Valoremmoeda(int real, int centavo){
        this.real = real;
        this.centavo = centavo;
    }
    @Override
    public String toString(){
        return "R$ "+real+","+centavo;
    }
}
