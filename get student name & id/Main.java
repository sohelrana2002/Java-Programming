import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String inputName = sc.nextLine();
        System.out.print("Enter your id: ");
        int inputId = sc.nextInt();

        System.out.println("Your name: " + s.getName());
        System.out.println("Your id: " + s.getId());

        s.setName(inputName);
        s.setId(inputId);

        System.out.println("Your name: " + s.getName());
        System.out.println("Your id: " + s.getId());
    }
}
