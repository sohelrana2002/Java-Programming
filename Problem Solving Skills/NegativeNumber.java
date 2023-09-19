//find entered number is positive or negative?
import java.util.Scanner;
public class NegativeNumber{
    public static void main(String [] args){
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Integer number: ");
            num = sc.nextInt();
        }
        if(num >= 0){
                System.out.println("Enter number is positive");
        }else{
                System.out.println("Enter number is negative");
        }
    }
}