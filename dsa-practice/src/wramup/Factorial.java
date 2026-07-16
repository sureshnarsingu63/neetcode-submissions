package wramup;

public class Factorial {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRec(int n) {
        if (n == 0) return 1;
        return n * factorialRec(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorialRec(5));
    }
}
