/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_1;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 *
 * @author udesc
 */
public class Aula07_1 {
    static void alterValue( int[] array, int index, int value){
        try{
            array[index]=value;
        } catch (ArrayIndexOutOfBoundsException error) {
            System.err.println("excecao ao alterar valor");
            System.err.println("Indice:" + index);
            System.err.println("Valor:" + value);
        } catch(ArithmeticException divZ){
            System.err.println("div zero");
        }
        System.out.println("Fim alterValue");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[10];
        alterValue(numbers,5,11);
        alterValue(numbers,12,77);
        
        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        }
    
}
