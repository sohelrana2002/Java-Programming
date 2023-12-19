public class NumbericValueProcessing{
    static int fact = 1;

    static int factorial(int n){
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
}