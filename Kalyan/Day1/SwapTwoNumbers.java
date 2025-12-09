package Practice;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	int value1 = 67;
	int value2 = 72;
	int temp = value1;
	value1=value2;
	value2=temp;
	
	//Without Temporary Variable and Using Operators
	int a = 10;
	int b = 20;
	
	a = a + b; 
	b = a - b; 
	a = a - b; 

	System.out.println("a = " + a + ", b = " + b);	
	System.out.println("The swapped numbers are Value 1 is " +value1 + " and Value 2 is "  + value2);
	
	}

}
