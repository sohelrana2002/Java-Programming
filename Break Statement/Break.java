public class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Reprint: " + i);

            if (i == 3) {
                System.out.println("I'm a break statement");
                break;
            }
        }
    }
}