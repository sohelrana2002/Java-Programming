public class Main{
    public static void main(String[] args){
        Triangle t = new Triangle();

        System.out.println(t.getBase());
        System.out.println(t.getHeight());
        System.out.println(t.getArea());
        System.out.println(t.toString());
        
        t.setBase(5);
        t.setHeight(10);
        System.out.println(t.getBase());
        System.out.println(t.getHeight());
        System.out.println(t.getArea());
        System.out.println(t.toString());

        Triangle t1 = new Triangle(2, 2);
        System.out.println(t1.getBase());
        System.out.println(t1.getHeight());
        System.out.println(t1.getArea());
        System.out.println(t1.toString());

        t1.setBase(10);
        t1.setHeight(20);
        System.out.println(t1.getBase());
        System.out.println(t1.getHeight());
        System.out.println(t1.getArea());
        System.out.println(t1.toString());
    }
}