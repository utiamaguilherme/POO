package javaapplication1;

import java.util.Scanner;
/**
 * @author Peter_Brendel
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicio do exercicio 1 e 2
        
        Carro[] carros = new Carro[3];
        
        for(int i=0; i<3; i++){
            carros[i] = new Carro(i);
            carros[i].setProprietario("DogaoCar");
        }
        
        carros[0].setCustom("azul escuro metalico", 2013, 32055, 43200);
        carros[1].setCustom("prata", 2006, 89233, 23900);
        carros[2].setCustom("preto fosco", 2013, 19631, 139800);
        
        for(int i=0; i<3; i++)
            carros[i].show();        
        
        // Fim do exercicio 1 e 2
        System.out.println("-------------------------------------------");
        //Inicio do exercicio 3
        Scanner scan = new Scanner(System.in);
        Personagem[] personagens = new Personagem[3];
        
        System.out.println("Personagem novo: 1\nPersonagens padroes: 2");
        if(scan.nextInt() == 2){
            String[] names = {"Anafhjhjrtjhfghdfhxdgfsered0htjsef","Utech","Sylvanas Windrunner"};
            int[] stats = {8, 4, 1, 2, 8, 4, 1, 2, 3, 2, 5, 10, 4, 4, 6, 8};
            for(int i=0; i<3; i++){
                personagens[i] = new Personagem(names[i], stats[i*4], stats[i*4+1], stats[i*4+2], stats[i*4+3]);
            }
        }else{
            for(int i=0; i<3; i++){
                System.out.print("Name: ");
                String name = scan.next();
                System.out.print("Strength: ");
                int str = scan.nextInt();
                System.out.print("Constitution: ");
                int con = scan.nextInt();
                System.out.print("Dexterity: ");
                int dex = scan.nextInt();
                System.out.print("Agility: ");
                int agi = scan.nextInt();
                personagens[i] = new Personagem(name, str, con, dex, agi);
            }
        }
        
        System.out.println(Personagem.instances()+" Personagens criados");
        for(Personagem p : personagens){
            p.getInfo();
        }
        
        // Fim do exercicio 3
        System.out.println("-------------------------------------------");
        //Inicio do exercicio 4
        
        double largura = 2.5;
        double altura = 6.0;
        Retangulo ret = new Retangulo( largura , altura );
        ret.showInfo(); //imprimir medidas do retangulo
        System.out.println("area = " + ret.area() +
        "\nperimetro = " + ret.perimetro());
        double raio = 3.75;
        Circulo cir = new Circulo( raio );
        cir.showInfo(); // imprimir valor do raio do círculo
        System.out.println("area = " + cir.area() +
        "\nperimetro = " + cir.perimetro());
        
    }
    
}
