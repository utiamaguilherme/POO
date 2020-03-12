/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import java.io.*;
/**
 *
 * @author udesc
 */
public class AgendaArquivo implements Agenda{
   
    File arquivo;
    FileOutputStream output;
    FileInputStream input;
    InputStreamReader reader;
    BufferedReader buffer;

//    private Contato[] agenda;
//    private int tam;
    
    public AgendaArquivo(String arquivo){
        this.arquivo = new File(arquivo);
    }
    @Override
    public boolean adicionarContato(Contato novoContato) throws Exception{
        output = new FileOutputStream(arquivo, true);
        output.write(novoContato.toString().getBytes());
        output.close();
        return true;
    }
    
    @Override
    public boolean removerContato(int identificador) throws Exception{
        File temp = new File("temp.tmp");
        output = new FileOutputStream(temp, true);
        input = new FileInputStream(arquivo);
        reader = new InputStreamReader(input);
        buffer = new BufferedReader(reader);
        String id = ""+identificador+"";
        String read;
        byte[] theChosenB;
        String theChosenR;
        String[] theChosen;
        
        for(read = buffer.readLine(); read != null; read = buffer.readLine()){
            theChosenB = read.getBytes();
            theChosenR = new String(theChosenB).concat("\n"); // Adicioanr o \n no final pq nao puxa do arquivo por algum motivo bizarro :TEKKEN:
            theChosen = theChosenR.split(";");
            
            if(theChosen[0].equals(id)) continue;
            output.write(theChosenR.getBytes());
        }
        
        output.close();
        input.close();
        arquivo.delete();
        
        return temp.renameTo(arquivo);
    }
    
    @Override
    public Contato consultarContato(int identificador) throws Exception{
            input = new FileInputStream(arquivo);
            reader = new InputStreamReader(input);
            buffer = new BufferedReader(reader);
            String id = ""+identificador+"";
            String[] theChosen;
            Contato returner = null;
            String read;
            
            for(read = buffer.readLine(); read != null; read = buffer.readLine()){
                theChosen = read.split(";");

                if(theChosen[0].equals(id)){
                    returner = new Contato(theChosen[0], theChosen[1], theChosen[2], theChosen[3], theChosen[4], theChosen[5]);
                }
            }
            return returner;
    }
    
    @Override
    public boolean alterarContato(Contato contato) throws Exception{
        File temp = new File("temp.tmp");
        output = new FileOutputStream(temp, true);
        input = new FileInputStream(arquivo);
        reader = new InputStreamReader(input);
        buffer = new BufferedReader(reader);
        String id = ""+contato.getIdentificador()+"";
        String read;
        byte[] theChosenB;
        String theChosenR;
        String[] theChosen;
        
        for(read = buffer.readLine(); read != null; read = buffer.readLine()){
            theChosenB = read.getBytes();
            theChosenR = new String(theChosenB).concat("\n"); // Adicioanr o \n no final pq nao puxa do arquivo por algum motivo bizarro :TEKKEN:
            theChosen = theChosenR.split(";");
            
            if(theChosen[0].equals(id)){
                output.write(contato.toString().getBytes());
            }else{
                output.write(theChosenR.getBytes());
            }
        }
        
        output.close();
        input.close();
        arquivo.delete();
        
        return temp.renameTo(arquivo);        
    }
    
}
