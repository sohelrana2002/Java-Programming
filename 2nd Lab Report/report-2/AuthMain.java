import java.util.Scanner;

public class AuthMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auth a = new Auth("sohelrana11", "SohelRana@@");
        System.out.println("Autentication  name: " + a.getUserName());
        System.out.println("Autentication  Password: " + a.getUserPassword());
        System.out.println(a.toString());

        System.out.print("Enter userr name: ");
        String userName = sc.nextLine();

        System.out.print("Enter password: ");
        String userPassword = sc.nextLine();

        a.setUserName(userName);
        a.setUserPassword(userPassword);

        System.out.println("Autentication  name: " + a.getUserName());
        System.out.println("Autentication  Password: " + a.getUserPassword());
        System.out.println(a.toString());
    }
}
