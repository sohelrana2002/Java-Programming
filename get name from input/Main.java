import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        StudentName st = new StudentName();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String inputFName = sc.nextLine();
        System.out.print("Enter last name: ");
        String inputLName = sc.nextLine();

        st.setName(inputFName , inputLName);
        st.getName();
    }
    
}
