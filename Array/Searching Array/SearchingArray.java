import java.util.Scanner;

public class SearchingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Array size: ");
        int arraySize = sc.nextInt();
        int myArray[] = new int[arraySize];
        int i;

        for (i = 0; i < arraySize; i++) {
            System.out.print("Enter " + (i + 1) + " Element: ");
            myArray[i] = sc.nextInt();
        }

        System.out.print("Search Your number: ");
        int searchValue = sc.nextInt();

        int flag = 0;
        for (i = 0; i < arraySize; i++) {
            if (myArray[i] == searchValue) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.print("Search found in index : " + i + " and value is : " + myArray[i]);
        } else {
            System.out.print("Search not found");
        }
    }
}