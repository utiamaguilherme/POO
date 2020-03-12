/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest2;
import java.util.Scanner;
/**
 *
 * @author udesc
 */
public class Quest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = new String();
        Scanner leia = new Scanner (System.in);
        String aux[] = new String[2];
        str = leia.nextLine();
        aux = str.split(" ");
        aux[1] = aux[1].replace('I','1');
        aux[1] = aux[1].replace('E','3');
        aux[1] = aux[1].replace('O','0');
        aux[1] = aux[1].replace('S','5');
        
        
        aux[0] = aux[0].replace('I','1');
        aux[0] = aux[0].replace('E','3');
        aux[0] = aux[0].replace('O','0');
        aux[0] = aux[0].replace('S','5');
        
//        Integer conv = new Integer();
        int result = Integer.parseInt(aux[0])+Integer.parseInt(aux[1]);
//        System.out.println(result);
        
        str = Integer.toString(result);
//        System.out.println(str);
        str = str.replace('1', 'I');
        str = str.replace('3', 'E');
        str = str.replace('0', 'O');
        str = str.replace('5', 'S');
        System.out.println(str);
        
    }
    
}
