/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
/**
 * @author udesc
 */
public class Fibonacci {
   
    private ArrayList fibo = new ArrayList();
    
    Fibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        for(int i=0; i<=n; i++){
            this.fibo.add(n1);
            int temp = n2;
            n2 = n1+n2;
            n1 = temp;
        }
    }
    
    public void show(int left, int right){
        for(int i = left-1 >= 0 ? left-1 : 0; i < right && i < this.fibo.size(); i++){
            System.out.println(this.fibo.get(i));
        }
    }
    
    
}
