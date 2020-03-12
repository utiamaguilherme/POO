/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

/**
 *
 * @author udesc
 */
public class Atividade1 {
static Produto[] produtos; 
static Animal[] animais;
    public Atividade1(){
        produtos = new Produto[100];
        animais = new Animal[100];
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Atividade1 a = new Atividade1();
        
        Porco pig =  new Porco(0.70f, 350f);
        condicaoAnimal(pig);
        Galinha chicken = new Galinha(0.20f, 3f);
        condicaoAnimal(chicken);
        Vaca cow = new Vaca(2f, 600f, 2500, 22);
        condicaoAnimal(cow);
        Cavalo horse = new Cavalo(1.80f, 400f, 38f, Pelagem.PRETO);
        condicaoAnimal(horse);
        Produto racao = new Produto("Ração Pedigri", "Comida especializada para Bovinos de 20kg", 100f);
        condicaoProduto(racao);
        Produto sela = new Produto("Sela", "Sela para cavalos", 450.50f);
        condicaoProduto(sela);
        PrintaAnimal();
        System.out.println("\n");
        PrintaProduto();
        System.out.println("\n");
        venderItem(cow);
        venderItem(racao);
    }
    public static void condicaoAnimal(Animal a){
        if(cadastrarAnimal(a))
            System.out.println("Animal cadastrado!");
        else
            System.out.println("Não foi possível cadastrar o animal!");
    }
    public static void condicaoProduto(Produto a){
        if(cadastrarProduto(a))
            System.out.println("Produto cadastrado!");
        else
            System.out.println("Não foi possível cadastrar o produto!");
    }
    public  static boolean cadastrarProduto(Produto a){
        for(int i = 0;i < produtos.length;i++){
            if(produtos[i] == null){
                produtos[i] = a;
                return true;
            }
        }
        return false;
    }
    public static boolean cadastrarAnimal(Animal a){
        for(int i = 0;i < animais.length;i++){
            if(animais[i] == null){
                animais[i] = a;
                return true;
            }
        }
        return false;
    }
    public static float venderItem(Valoravel a){

        if(a instanceof Animal){
            Animal aux = (Animal) a;
            System.out.print(aux.toString() + "\n vendido por : ");
            System.out.println(aux.getValorEmMoeda().toString());
            return aux.estimarPreco();
        }
        else if(a instanceof Produto){
            Produto aux = (Produto) a;
            System.out.print(aux.toString() + "\n vendido por : ");
            System.out.println(aux.getValorEmMoeda().toString());
            return aux.estimarPreco();   
        }
        return 0;
    }
    public static void PrintaProduto(){
        for(int i = 0; i < produtos.length; i++){
            if(produtos[i] ==  null)
                break;
            else
                System.out.println((i+1)+" - " + produtos[i].toString());
        }
    }
    public static void PrintaAnimal(){
        for(int i = 0; i < animais.length; i++){
            if(animais[i] ==  null)
                break;
            else
                System.out.println((i+1)+" - " + animais[i].toString());
        }
    }
}
