/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author udesc
 */
public class AgendaMemoria implements Agenda{
    private Contato[] agenda;
    private int tam;
    public AgendaMemoria(int tam){
        agenda = new Contato[tam];
        this.tam = tam;
    }
    
    @Override
    public boolean adicionarContato(Contato novoContato){
        for(int i=0; i<tam; i++){
            if(agenda[i] == null){
                agenda[i] = novoContato;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean removerContato(int identificador){
        for(int i=0; i<tam; i++){
            if(agenda[i].getIdentificador() == identificador){
                agenda[i] = null;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public Contato consultarContato(int identificador){
        for(int i=0; i<tam; i++){
            if(agenda[i].getIdentificador() == identificador){
                return agenda[i];
            }
        }
        return null;
    }
    
    @Override
    public boolean alterarContato(Contato contato){
        int tempId = contato.getIdentificador();
        for(int i=0; i<tam; i++){
            if(tempId == agenda[i].getIdentificador()){
                agenda[i] = contato;
            return true;
            } 
        }
        return false;
    }
    
    void limparContatos(){
        for(int i=0; i<tam; i++)    
            agenda[i] = null;
    }
    
    public Contato consultarNome(String nome){
        for(int i=0; i<tam; i++){
            if(agenda[i].getNome().equals(nome))
                return agenda[i];
            }
        return null;
    }
}
