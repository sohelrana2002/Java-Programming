import java.util.Scanner;

public class InheritanceMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sohel s = new Sohel("Sohel Rana", 57);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your id: ");
        int id = sc.nextInt();

        s.setName(name);
        s.setId(id);

        System.out.println(s.getName());
        System.out.println(s.getId());
    }
}
