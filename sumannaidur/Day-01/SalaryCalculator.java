import java.util.Scanner;

public class SalaryCalculator {
    static double calculateBonus(double basicSalary, double bonusPercentage) {
        return basicSalary * (bonusPercentage / 100);
    }

    static double calculateFinalSalary(double basicSalary, double bonusAmount) {
        return basicSalary + bonusAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter bonus percentage: ");
        double bonusPercentage = scanner.nextDouble();

        double bonusAmount = calculateBonus(basicSalary, bonusPercentage);
        double finalSalary = calculateFinalSalary(basicSalary, bonusAmount);

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus Amount: " + bonusAmount);
        System.out.println("Final Salary: " + finalSalary);

        scanner.close();
    }
}
