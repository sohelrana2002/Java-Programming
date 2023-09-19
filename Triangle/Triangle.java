// import javax.print.DocFlavor.STRING;

public class Triangle{
    private double base;
    private double height;

    public Triangle(){
        this.base = 1.0;
        this.height = 1.0;
    };

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    };
    public void setBase(double base){
        this.base = base;
    };
    public void setHeight(double height){
        this.height = height;
    };
    public double getBase(){
        return base;
    };
    public double getHeight(){
        return height;
    };

    public double getArea(){
        return (0.5 * base * height);
    };

    public String toString(){
        double area = getArea();
        return("[Triangle " + "Base: " + base + " Height: " + height + " Area: " + area  );
    }
}