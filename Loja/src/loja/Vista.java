package loja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Selner
 */
public class Vista {
    private double preco;
    
    Vista(double preco, Pagamento forma){
        if(forma == Pagamento.DINHEIRO){
            this.preco = preco*0.95;
        }else{
            this.preco = preco;
        }
    }
    
    public void show(){
        System.out.println("Valor da venda: " + preco);
    }
    
}
