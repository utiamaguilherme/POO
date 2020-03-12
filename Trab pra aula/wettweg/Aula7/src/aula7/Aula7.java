/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

//import static aula7.Trio.max;
//import static aula7.Trio.min;

/**
 *
 * @author udesc
 */
public class Aula7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trio caso1 = new Trio(2, 2, 8.8);
        Trio caso2 = new Trio(2,4,5.1);
        Trio caso3 = new Trio(1,199, 2.9);
        Trio caso4 = new Trio(0,0, 2.8);
        Trio []casoA = {caso1,caso2,caso3,caso4};
//        System.out.println(caso1);
        
        Trio result = Trio.min(casoA);
        Trio result2 = Trio.max(casoA);
        System.out.println(result);
        System.out.println(result2);
    }
    
}


/*
    public Trio<T> compareTo(Trio<T> o) {
        System.out.println("eh esse");
        if(this.first.compareTo(o.first) > 0) return this;
        else if(this.first.compareTo(o.first) < 0) return o;
        
        if(this.second.compareTo(o.second) > 0) return this;
        else if(this.second.compareTo(o.second) < 0) return o;
        
        if(this.third.compareTo(o.third) > 0) return this;
        else if(this.third.compareTo(o.third) < 0) return o;
        
        return null;
    }
*/