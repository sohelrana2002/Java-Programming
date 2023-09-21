import java.util.Scanner;

public class BinarySearch {
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

        int loc, beg = 0, end = arraySize - 1, mid = (beg + end) / 2, flag = 0;
        System.out.print("Enter search element: ");
        int searchElement = sc.nextInt();

        while (beg <= end) {
            if (searchElement == myArray[mid]) {
                loc = mid;
                flag = 1;
                System.out.print("Search result found and index no : " + loc);
                break;
            } else if (searchElement < myArray[mid]) {
                end = mid - 1;
            } else if (searchElement > myArray[mid]) {
                beg = mid + 1;
            }

            mid = (beg + end) / 2;
        }

        if (flag == 0) {
            System.out.print("Result not found");
        }
    }

}
