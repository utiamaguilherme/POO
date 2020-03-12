package exercicioultimo;
public class Retangulo{
    double largura,altura;
    public Retangulo(double a, double b){

        this.largura = a;

        this.altura = b;
    }
    public void showInfo(){

        System.out.println("L: " + this.largura);
                
    }
    public double area(){
       double y = largura*altura;

        return y;
    }


    public double perimetro(){
            double t,k,n;

            t = 2*largura;

            k = 2*altura;

            n = t+k;

        return n;
    }
    
}
