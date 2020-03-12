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
public interface Agenda {
    boolean adicionarContato(Contato novoContato) throws Exception;
    boolean removerContato(int identificador) throws Exception;
    Contato consultarContato(int identificador) throws Exception;
    boolean alterarContato(Contato contato) throws Exception;

}
