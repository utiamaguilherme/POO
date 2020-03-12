package javaapplication1;
/**
 * @author 3
 */
public class Circulo {
    private double raio=0;
    private double area=0;
    private double perimeter=0;
    
    Circulo(double raio){
        this.raio = raio;
    }
    
    public void showInfo(){
        System.out.println("Raio: " + this.raio);
    }

    public double area(){
        if(this.area == 0)
            return this.area = this.raio*this.raio*Math.PI;
        return this.area;
    }
    
    public double perimetro(){
        if(this.perimeter == 0){
            return this.perimeter = 2*Math.PI*this.raio;
        }
        return this.perimeter;
    }
}
