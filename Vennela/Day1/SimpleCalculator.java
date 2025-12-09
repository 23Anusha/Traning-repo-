package Practice;

class Calculator {

	int getAddition(int value1, int value2) {
		int result = value1 + value2;
		return result;
	}
	
	int getSubtraction(int value1, int value2) {
		int result = value1 - value2;
		return result;
	}
	int getProduct(int value1, int value2) {
		int result = value1 * value2;
		return result;
	}
	int getDivision(int value1, int value2) {
		int result = value1 / value2;
		return result;
	}
}
public class SimpleCalculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		int Addition = calculator.getAddition(10, 20);
		int Subtraction = calculator.getSubtraction(30, 40);
		int Product = calculator.getProduct(50, 60);
		int Division = calculator.getDivision(70, 100);
		System.out.println(Addition);
		System.out.println(Subtraction);
		System.out.println(Product);
		System.out.println(Division);
	}

}
