package loja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Selner
 */
public class Prazo {
    private int quantidade;
    private int parcelasPagas = 0;
    private double valorTotal;
    private double valorPago = 0;
    private double valorParcelas;
    
    Prazo(int quantidade, double valorTotal){
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
        this.valorParcelas = valorTotal / quantidade;
    }
    
    public void pagarParcela(){
        if(parcelasPagas < quantidade){
            valorPago += valorParcelas;
            parcelasPagas++;
        }else{
            System.out.println("Pagamento finalizado");
        }
    }
    
    public void show(){
        System.out.println("Valor da compra: " + valorTotal);
        System.out.println("Parcelas pagas: " + parcelasPagas);
        System.out.println("Valor total Pago: "+ valorPago);
    }
}
