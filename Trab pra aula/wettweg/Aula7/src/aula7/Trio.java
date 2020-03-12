/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

/**
 *
 * @author udesc
 * @param <T>
 */
public class Trio<T extends Comparable> {
    
    private T first;
    private T second;
    private T third;
    
    public Trio(T first, T second, T third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    /**
     * @return the first
     */
    public T getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(T first) {
        this.first = first;
    }

    /**
     * @return the second
     */
    public T getSecond() {
        return second;
    }

    /**
     * @param second the second to set
     */
    public void setSecond(T second) {
        this.second = second;
    }

    /**
     * @return the third
     */
    public T getThird() {
        return third;
    }

    /**
     * @param third the third to set
     */
    public void setThird(T third) {
        this.third = third;
    }
    
    public static Trio max(Trio[] obj){
        Trio maior = obj[0];
        for(int i=1; i<obj.length; i++){
            if(maior.compareTo(obj[i]) < 0)  
                maior = obj[i];
        }
        return maior;
    }
    public static Trio min(Trio[] obj){
        Trio menor = obj[0];
        for(int i=1; i<obj.length; i++){
            if(menor.compareTo(obj[i]) > 0)  
                menor = obj[i];
        }
        return menor;
    }
    
    @Override
    public String toString(){
        return ""+this.first+" "+this.second+" "+this.third+"";
    }

    public int compareTo(Trio<T> o) {
//        System.out.println("eh esse");
        if(this.getFirst().compareTo(o.getFirst()) > 0) return 1;
        else if(this.getFirst().compareTo(o.getFirst()) < 0)    return -1;
        
        if(this.getSecond().compareTo(o.getSecond()) > 0) return 1;
        else if(this.getSecond().compareTo(o.getSecond()) < 0)    return -1;
        
        if(this.getThird().compareTo(o.getThird()) > 0) return 1;
        else if(this.getThird().compareTo(o.getThird()) < 0)    return -1;
        else    return 0;
    }

}
