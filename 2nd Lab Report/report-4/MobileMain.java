import java.util.Scanner;

public class MobileMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobile m = new Mobile("Xiomi", "Note 4", "5000");
        System.out.println("Mobile name: " + m.getMobileName());
        System.out.println("Model name: " + m.getModel());
        System.out.println("Price: " + m.getPrice());
        System.out.println(m.toString());

        System.out.print("Enter Mobile name: ");
        String mobileName = sc.nextLine();

        System.out.print("Enter Model name: ");
        String modelName = sc.nextLine();

        System.out.print("Enter price: ");
        String price = sc.nextLine();

        m.setMobileName(mobileName);
        m.setMobileName(modelName);
        m.setPrice(price);

        System.out.println("Mobile name: " + m.getMobileName());
        System.out.println("Model name: " + m.getModel());
        System.out.println("Price: " + m.getPrice());
        System.out.println(m.toString());
    }
}
