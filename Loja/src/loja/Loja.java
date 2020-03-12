package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author Selner
 */
public class Loja {
    
    public static void main(String[] args) {
        Cliente cpointer;
        Funcionario fpointer;
        Scanner scan = new Scanner(System.in);
        int matricula;
        String fnome;
        Date date = new Date();
        System.out.println("Hoje eh dia " + date.getDate());
        System.out.println("Login de Funcionario");
        System.out.print("Insira matricula: ");
        matricula = scan.nextInt();
        scan.nextLine();
        if((fpointer = Funcionario.isCadastrado(matricula)) == null){
            System.out.println("Funcionario nao cadastrado");
            System.out.print("Insira seu nome: ");
            fnome = scan.nextLine();
            fpointer = new Funcionario(fnome, matricula);
        }

        while(true){
            
            String nome, cpf, telefone, endereco, operacao, fdp;
            int qtd;
            double preco;
            
            System.out.println("Preparado para iniciar nova operacao");
            System.out.println("insira: VENDA para iniciar nova venda ou CHECK para verificar o historico");
            System.out.print("Operacao: ");
            operacao = scan.nextLine();
            
            if("VENDA".equals(operacao)){
                Venda venda;
                System.out.println("Insira os dados do cliente");

                System.out.print("CPF: ");
                cpf = scan.next();
                
                if((cpointer = Cliente.isCadastrado(cpf)) == null){
                    System.out.print("Nome: ");
                    nome = scan.next();
                    System.out.print("Endereco: ");
                    scan.nextLine();
                    endereco = scan.nextLine();
                    System.out.print("Telefone: ");
                    telefone = scan.next();
                    cpointer = new Cliente(nome, cpf, endereco, telefone);
                }else{
                    System.out.println("Cliente ja cadastrado");
                    System.out.println("Nome: " + cpointer.getNome());
                    System.out.println("Endereco: " + cpointer.getEndereco());
                    System.out.println("Telefone: " + cpointer.getTelefone());
                }
                
                System.out.println("Insira os dados da venda");
                System.out.print("Valor total: ");
                preco = scan.nextDouble();
                System.out.print("Forma de pagamento VISTA, PRAZO, DINHEIRO: ");
                fdp = scan.next();
                scan.nextLine();
                Pagamento forma = Pagamento.getPagamento(fdp);
                if(forma == Pagamento.A_PRAZO){
                    System.out.print("Quantas vezes: ");
                    qtd = scan.nextInt();
                    scan.nextLine();
                    new Venda(forma, qtd, preco, cpointer, fpointer, date);
                }else {
                    new Venda(forma, preco, cpointer, fpointer, date);
                }
                
                
            }else if("CHECK".equals(operacao)){
                System.out.print("Verificar \"TODAS\" ou apenas \"CLIENTE\" ?");
                operacao = scan.nextLine();
                if("TODAS".equals(operacao))
                    Cliente.getVendas();
                else{
                    System.out.print("CPF do cliente \"0 para buscar CPFs\": ");
                    cpf = scan.nextLine();
                    if("0".equals(cpf)){
                        System.out.print("Nome do cliente: ");
                        nome = scan.nextLine();
                        Cliente.getCPF(nome);
                        System.out.print("CPF do cliente: ");
                        cpf = scan.nextLine();
                        if("0".equals(cpf))
                            System.out.println("Encerrando busca");
                        else
                            Cliente.getVendas(cpf);
                    }else{
                        Cliente.getVendas(cpf);
                    }
                    
                }
            }
            
        }
        
    }
    
}
