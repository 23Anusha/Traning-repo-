public class SimpleCalculator {
    static int add(int value1, int value2) {
        return value1 + value2;
    }

    static int subtract(int value1, int value2) {
        return value1 - value2;
    }

    static int multiply(int value1, int value2) {
        return value1 * value2;
    }

    static double divide(int value1, int value2) {
        if (value2 == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return (double) value1 / value2;
    }

    public static void main(String[] args) {
        int val1 = 20;
        int val2 = 10;

        System.out.println("Addition: " + add(val1, val2));
        System.out.println("Subtraction: " + subtract(val1, val2));
        System.out.println("Multiplication: " + multiply(val1, val2));
        System.out.println("Division: " + divide(val1, val2));
    }
}
