public class Factorial {
    static long calculateFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + calculateFactorial(number));
    }
}
