package shapes;

public class RectangularPrism extends Shape{
    private double height, width, length;
    
    public RectangularPrism(double height, double width, double length){
        this.height = height;
        this.width = width;
        this.length = length;
    }
    
    @Override
    public double Area(){
        return 2*(length*width)+2*(length*height)+2*(width*height);
    }   
    
    @Override
    public String toString(){
        return super.toString() + "\n"
                + "Height = " + height + "\n"
                + "Width = " + width + "\n"
                + "Length = " + length + "\n"
                + "Volume = " + Area();
    }
    
}
