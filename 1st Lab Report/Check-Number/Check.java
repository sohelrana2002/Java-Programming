import java.util.Scanner;

public class Check{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Positive number");
        }else if(num == 0){
            System.out.println("Zero");
        }else{
             System.out.println("Negative Number");
        }
    }
}