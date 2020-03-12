package loja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Selner
 */
public class Cliente {
    
    private static List<Cliente> clientes = new ArrayList<>();
    private List<Venda> compras = new ArrayList<>();
    private final String nome;
    private final String CPF;
    private final String endereco;
    private final String telefone;
    
    
    Cliente(String nome, String CPF, String endereco, String telefone){
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
        clientes.add(this);
    }
    
    public static Cliente isCadastrado(String CPF){
        for(Cliente cliente : clientes){
            if(cliente.getCPF().equals(CPF))
                return cliente;
        }
        return null;
    }
    
    public static void getClientes(){
        for(Cliente cliente : clientes){
            System.out.println("Cliente CPF: " + cliente.getCPF());
        }
    }
    
    public void setVenda(Venda venda){
        this.compras.add(venda);
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public static void getVendas(String cpf){
        Cliente tmp = null;
        for(Cliente a : clientes){
            if(a.CPF.equals(cpf)){
                tmp = a;
                break;
            }
        }
        if(tmp != null){
            for(Venda compras : tmp.compras){
                compras.getVendas();
            }
        }else{
            System.out.println("!!! CPF nao encontrado !!!");
        }
    }
    
    public static void getVendas(){
        clientes.forEach((cliente) -> {
            System.out.println("--- Cliente: " + cliente.nome + " ---");
            System.out.println("--- Compras associadas ---");
            for(Venda compras : cliente.compras){
                compras.getVendas();
            }
        });
    }
    
    public static void getCPF(String nome){
        System.out.println("--- Nome " + nome + " esta associado a  ---");
        clientes.forEach((cliente) -> {
            if(cliente.nome.equals(nome)){
                System.out.println("--> CPF: " + cliente.CPF);
            }
            });
    }
    

    
}
