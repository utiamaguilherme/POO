/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

//******************************************************
// Paint.java
// Representa o tipo de tinta que tem uma área de cobertura fixa
// por galão/latão. As medidas são em cm².
//******************************************************
public class Paint{
    private double coverage; //número de cm² por galão/latão
    /**
    * Construtor: Monta o objeto de pintura.
    */
    public Paint(double c){
    coverage = c;
    }
    /**
    * Retorna a quantidade de tinta (número de galões)
    * necessário para pintar a forma passada como parâmetro
     */
    public double amount(Shape s){
        return s.Area()/coverage;
    }
}
