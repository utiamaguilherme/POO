package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
/**
 *
 * @author Selner
 */
public class Venda {
    private static List<Venda> vendas = new ArrayList<>();
    private Prazo prazo = null;
    private Vista vista = null;
    private Cliente cliente = null;
    private Funcionario funcionario = null;
    private double preco = 0;
    private String data;
    private String hora;
    
    Venda(Pagamento forma, int vezes, double preco, Cliente cliente, Funcionario funcionario, Date date){
        if(forma == Pagamento.A_PRAZO){
            this.prazo = new Prazo(vezes, preco);
        }
        this.prazo.pagarParcela();
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data = "" + date.getDate() + "/" + date.getMonth() + "/" + date.getYear() + "";
        this.hora = "" + date.getHours() + ":" + date.getMinutes() + "";
        this.cliente.setVenda(this);
        vendas.add(this);
    }
    
    Venda(Pagamento forma, double preco, Cliente cliente, Funcionario funcionario, Date date){
        this.vista = new Vista(preco, forma);
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data = "" + date.getDate() + "/" + date.getMonth() + "/" + date.getYear() + "";
        this.hora = "" + date.getHours() + ":" + date.getMinutes() + "";
        this.cliente.setVenda(this);
        vendas.add(this);
    }
    
    public void getVendas(){
        System.out.println("Funcionario responsavel");
        funcionario.show();
        if(prazo != null) prazo.show();
        else              vista.show();
        
    }
    
    
}
