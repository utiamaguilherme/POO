package loja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Selner
 */
public class Funcionario {
    private static List<Funcionario> funcionarios = new ArrayList<>();
    private String nome;
    private int matricula;
    
    Funcionario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        funcionarios.add(this);
    }
    
    public static Funcionario isCadastrado(int mat){
        for(Funcionario funcionario : funcionarios){
            if(funcionario.matricula == mat){
                return funcionario;
            }
        }
       return null;
    }
    
    public void show(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matr: " + this.matricula);
    }
    
}
