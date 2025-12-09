import java.util.Scanner;

public class MarksCalculator {
    static int calculateTotal(int s1, int s2, int s3, int s4, int s5) {
        return s1 + s2 + s3 + s4 + s5;
    }

    static double calculatePercentage(int total, int numberOfSubjects) {
        return (double) total / numberOfSubjects;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");
        // Assuming subjects are out of 100 for simplicity
        int sub1 = scanner.nextInt();
        int sub2 = scanner.nextInt();
        int sub3 = scanner.nextInt();
        int sub4 = scanner.nextInt();
        int sub5 = scanner.nextInt();

        int total = calculateTotal(sub1, sub2, sub3, sub4, sub5);
        double percentage = calculatePercentage(total, 5);

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}
