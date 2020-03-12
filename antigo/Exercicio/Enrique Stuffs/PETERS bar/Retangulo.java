package javaapplication1;
/**
 * @author 3
 */
public class Retangulo {
    private double width;
    private double height;
    private double area = 0;
    private double perimeter = 0;
    
    Retangulo(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public double area(){
        if(this.area == 0)
            return this.area = this.width*this.height;
        return this.area;
    }
    
    public double perimetro(){
        if(this.perimeter == 0)
            return this.perimeter = 2*(this.width + this.height);
        return this.perimeter;
    }
    
    public void showInfo(){
        System.out.println("Largura: " + this.width + 
                         "\nAltura : " + this.height);
    }
    
    
    
}
