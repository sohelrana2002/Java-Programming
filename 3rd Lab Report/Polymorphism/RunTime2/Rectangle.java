public class Rectangle extends Shape{
    private double length, width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        System.out.print("Rectangle: ");
        return length * width;
    }
}
