import java.util.Scanner;

public class ColorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Color c = new Color("White", "#ffffff");
        System.out.println("Color name: " + c.getColorName());
        System.out.println("Hex value: " + c.getHexValue());
        System.out.println(c.toString());

        System.out.print("Enter Color name: ");
        String colorName = sc.nextLine();

        System.out.print("Enter hex value: ");
        String hexValue = sc.nextLine();

        c.setColorName(colorName);
        c.setHexValue(hexValue);

        System.out.println("Color name: " + c.getColorName());
        System.out.println("Hex value: " + c.getHexValue());
        System.out.println(c.toString());
    }
}
