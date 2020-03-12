package shapes;

public abstract class Shape {
    String name;
    
    public abstract double Area();
    
    @Override
    public String toString(){
        return name;
    }
    
}
