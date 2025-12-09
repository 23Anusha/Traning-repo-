import java.util.Scanner;

public class TemperatureConverter {
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");

        scanner.close();
    }
}
