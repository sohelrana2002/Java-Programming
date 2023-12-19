public class NP extends NumbericValueProcessing {
    int sum = 0;

    public void display(int n) {
        
        for (int i = 1; i <= n; i++) {
            factorial(i);
            sum = sum + fact;
        }

        System.out.println("Total Sum: " + sum);
    }
}