import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size: ");
        int row = sc.nextInt();
        System.out.print("Enter column size: ");
        int column = sc.nextInt();

        int myArray[][] = new int[row][column];
        int i, j;
        // ====FOR INPUT====
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                myArray[i][j] = sc.nextInt();
            }
        }
        // ====FOR OUTPUT====
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}