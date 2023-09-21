import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int arraySize = sc.nextInt();
        int myArray[] = new int[arraySize];

        int i;
        for (i = 0; i < arraySize; i++) {
            System.out.print("Enter " + (i + 1) + " Element: ");
            myArray[i] = sc.nextInt();
        }

        int loc = 0, k = 0, max = myArray[0];

        while (k <= (arraySize - 1)) {
            if (max < myArray[k]) {
                loc = k;
                max = myArray[k];
            }

            k++;
        }

        System.out.print("Largest number is: " + max + " Location: " + (loc + 1));
    }
}