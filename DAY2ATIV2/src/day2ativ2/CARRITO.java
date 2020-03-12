/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2ativ2;

/**
 *
 * @author gustavo
 */
public class CARRITO {

    /**
     * @return the prop
     */
    public String getProp() {
        return prop;
    }

    /**
     * @param prop the prop to set
     */
    public void setProp(String prop) {
        this.prop = prop;
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
        this.cor = cor;
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
        this.ano = ano;
    }

    /**
     * @return the km
     */
    public double getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(double km) {
        this.km = km;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    private String prop;
    private String cor;
    private int ano;
    private double km;
    private int valor;
    private String nome;
    
    public CARRITO(String _nome,String _prop,String _cor,int _ano,double _km,int _valor){
        this.nome = _nome;
        this.ano=_ano;
        this.cor=_cor;
        this.km=_km;
        this.valor=_valor;
        prop=_prop;
}
    public void show(){
        System.out.printf(prop+"\n"+this.nome+": cor "+this.cor+", ano "+this.ano+", "+this.km+" km, avaliado em R$ "+this.valor+"\n");
    }
    
    
}
