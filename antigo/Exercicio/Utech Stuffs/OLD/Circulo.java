package exercicio4;
public class Circulo {
    double raious;
    
    Circulo(double raious){

        this.raious = raious;

    }
    public void showInfo(){

        System.out.println("R: " + this.raious);

    }
    public double area(){

        return this.raious*this.raious * Math.PI;

    }
    public double perimetro(){

        return 2* Math.PI * this.raious;

    }
}
