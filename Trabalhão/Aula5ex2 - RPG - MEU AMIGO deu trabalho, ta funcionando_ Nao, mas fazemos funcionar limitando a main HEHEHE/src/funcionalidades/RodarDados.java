/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionalidades;
import java.util.Random;
/**
 *
 * @author udesc
 */
public class RodarDados {
    Random r = new Random();
    public void RodarDados(){
    }
    public int Jogar(int lados) throws Exception{ 
        return (r.nextInt(lados) + 1);
    }
}
