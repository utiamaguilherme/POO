/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5ex2;
import Characters.*;
import Itens.*;
import funcionalidades.Round;
import java.util.Scanner;
/**
 *
 * @author 3
 */
public class Aula5ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Characters[] characters = new Characters[5];
        Weapon a = new Weapon("Espada de Madeira", 10);
        Weapon b = new Weapon("Cajado de Madeira", 20);
        Armor c = new Armor("Armadura de ferro", 0, 20);
        Armor d = new Armor("Armadura de tecido", 0, 10);
        
        for(int i=0; i<5; i++){
            String nome;
            String classe;
            System.out.println("Um novo aventureiro!");
            System.out.print("Nome: ");
            nome = scan.next();
            System.out.print("Classes: (Mago),(Guerreiro): ");
            classe = "Mago";
            
            switch (classe) {
                case "Mago":
                    characters[i] = new Mago(nome, 8, 150, 8, 10, 10, 20, 15, d, b, new Bag());
                    break;
                case "Guerreiro":
                    characters[i] = new Warrior(nome, 80, 50, 18, 10, 10, 5, 14, c, a, new Bag());
                    break;
                default:
                    System.out.println("Nao entendi");
                    i--;
                    break;
            }
        }
        
        Round batalha = new Round(characters);
    }
    
}
