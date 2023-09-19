//Write a program to traverse an array

import java.util.Scanner;

public class TraverssingArray {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // size of array(user input)
        int simpleArray[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("Enter " + (i+1) + " element : ");
            simpleArray[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.println("Display " + i + " index element is:" + simpleArray[i]);
        }
    }
}
