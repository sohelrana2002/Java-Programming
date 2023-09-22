import java.util.Scanner;

public class Inseration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int arraySize = sc.nextInt();
        // ===INCREASE ARRAY SIZE===   
        int myArray[] = new int[arraySize + 1];

        int i;
        for (i = 0; i < arraySize; i++) {
            System.out.print("Enter " + (i + 1) + " Element: ");
            myArray[i] = sc.nextInt();
        }
        System.out.print("Old array: ");
        for (i = 0; i < arraySize; i++) {
            System.out.print(" " + myArray[i]);
        }
        
        int j = arraySize - 1;

        System.out.print("\nEnter index  to insert the array: ");
        int insertIndex = sc.nextInt();

        while (j >= insertIndex) {
            myArray[j + 1] = myArray[j];
            j = j - 1;
        }

        System.out.print("Enter the value to insert: ");
        int insertValue = sc.nextInt();

        myArray[insertIndex] = insertValue;

        arraySize = arraySize + 1;

        System.out.print("New array: ");
        for (i = 0; i < arraySize; i++) {
            System.out.print(" " + myArray[i]);
        }
    }
}