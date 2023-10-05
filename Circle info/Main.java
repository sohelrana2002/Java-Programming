import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Circle c = new Circle(1.0, "Black");
        System.out.print("Radius: " + c.getRadius());
        System.out.print("\nColor: " + c.getColor() + "\n");
        System.out.print(c.toString());

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter radius: ");
        double inputRadius = sc.nextDouble();

        System.out.print("\nEnter color: ");
        String inputColor = sc.nextLine();

        c.setRadius(inputRadius);
        c.setColor(inputColor);

        System.out.print("Radius: " + c.getRadius());
        System.out.print("\nColor: " + c.getColor() + "\n");
        System.out.print(c.toString());
    }
}
