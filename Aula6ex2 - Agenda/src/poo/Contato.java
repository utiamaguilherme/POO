/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import static java.lang.Integer.parseInt;

/**
 *
 * @author udesc
 */
public class Contato {
    private int identificador;
    private String nome;
    private String endereco;
    private String tel;
    private String whats;
    private String email = null;
    
    public Contato(String identificador, String nome, String endereco, String tel, String whats, String email){
        this.identificador = parseInt(identificador);
        this.nome = nome;
        this.endereco = endereco;
        this.tel = tel;
        this.whats = whats;
        this.email = email;
    }
    
    public void setIdentificador(int identificador){
        if(identificador > 0)
        this.identificador = identificador;
    }
    
    public int getIdentificador(){
        return identificador;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setTel(String tel){
        if((tel.length() > 8 && tel.length() < 11)){
            if(tel.length() == 9 && tel.charAt(4) == '-')
                this.tel = tel;
            else if(tel.length() == 10 && tel.charAt(5) == '-')
                this.tel = tel;
        }
    }
    
    public String getTel(){
        return tel;
    }
    
    public void setEmail(String email){
        if(email == null || (email.contains("@") && email.contains(".")))
            this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    @Override
    public String toString(){
        return ""+identificador+";"
                + ""+nome+";"
                + ""+endereco+";"
                + ""+tel+";"
                + ""+whats+";"
                + ""+email+"\n";
    }
}
