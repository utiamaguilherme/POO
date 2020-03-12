/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooaulaoitothread;

/**
 *
 * @author udesc
 */
public class Renatinho extends Thread {
    int n;
    int inicio;
    static boolean primos[] = new boolean[100001];
    public Renatinho(int i, int n){
        this.n = n; 
        this.inicio = i;
    }
    @Override
    public void run(){
        int i;
        for (int x = inicio ; x <= n; x ++){
           for(i = 2; i < x; i ++)
           {
               if( x%i == 0){
                   primos[x] = false;
                   break;
               }
            }
           if(i == x){
               primos[x] = true;

           }
        }
        
        
    }
}
