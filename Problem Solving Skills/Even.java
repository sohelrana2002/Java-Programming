//ENTERED INTEGER NUMBER IS EVEN OR ODD NUMBER?
import java.util.Scanner;
public class Even {
    public static void main(String[] args){
        int num;
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter an integer number: ");
            num = sc.nextInt();
        }
        if(num % 2 == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
}
