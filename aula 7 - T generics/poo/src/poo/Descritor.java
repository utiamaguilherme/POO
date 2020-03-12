/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author udesc
 */
public class Descritor <T extends Comparable> {
//<T> -> Significa, tipo genérico <T>
    private String descricao;
    private Object objeto; // Object pode ser qualquer coisa!!
    private T objetoGenerico;
    public Descritor(Object obj, String d, T obj2){
        descricao = d;
        objeto = obj;
        objetoGenerico = obj2;
    }
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String s){
        descricao = s;
    }
    public Object getObjeto(){
        return objeto;
    }
        public T getObjetoGenerico() {
        return objetoGenerico;
    }
    public int compara (T item){ //Para fazer esse método, precisamos dizer que esse Tipo "T" Precisa ser comparável!
       if( this.objetoGenerico.compareTo(item));
    }
}
