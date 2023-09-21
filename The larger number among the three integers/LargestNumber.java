import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int firstInt = sc.nextInt();
        System.out.print("Enter 2nd integer: ");
        int secondInt = sc.nextInt();
        System.out.print("Enter 3rd integer: ");
        int thirdInt = sc.nextInt();

        if(firstInt > secondInt && firstInt > thirdInt){
            System.out.print("1st number is largest " + firstInt);
        }else if(secondInt > firstInt && secondInt > thirdInt ){
            System.out.print("2nd number is largest " + secondInt);
        }else{
            System.out.print("Third number is largest " + thirdInt);
        }
    }
}