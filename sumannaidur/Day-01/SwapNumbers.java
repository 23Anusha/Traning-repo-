public class SwapNumbers {
    static void swapUsingThirdVariable(int a, int b) {
        System.out.println("Before Swap (with temp): a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap (with temp): a = " + a + ", b = " + b);
    }

    static void swapWithoutThirdVariable(int a, int b) {
        System.out.println("Before Swap (without temp): a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap (without temp): a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 10, b = 20;

        swapUsingThirdVariable(a, b);
        System.out.println();
        swapWithoutThirdVariable(a, b);
    }
}
