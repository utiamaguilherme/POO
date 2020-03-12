package exercicio4;


public class Exercicio4 {

    
    public static void main(String[] args) {

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
