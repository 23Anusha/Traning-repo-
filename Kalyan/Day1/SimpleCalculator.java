package Practice;

class Calculator{
		int getSum(int value1, int value2) {
		int result = value1+value2;
		return result;
	}
		int getDiffirence(int value1, int value2) {
			int result = value1-value2;
			return result;
		}
		int getProduct(int value1, int value2) {
			int result = value1*value2;
			return result;
		}
		int getDivision(int value1, int value2) {
			int result = value1/value2;
			return result;
		}
}
public class SimpleCalculator {

	public static void main(String[] args) {
	
		Calculator calculator = new Calculator();
		int Add = calculator.getSum(10, 89);
		int Substraction = calculator.getDiffirence(50, 20);
		int Product = calculator.getProduct(5, 15);
		int Division = calculator.getDivision(20, 4);
		
		System.out.println(Add);
		System.out.println(Substraction);
		System.out.println(Product);
		System.out.println(Division);
		

	}

}
