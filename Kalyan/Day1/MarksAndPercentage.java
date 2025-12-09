package Practice;

public class MarksAndPercentage {

	public static void main(String[] args) {
		
		int Kannada = 95;
		int English = 79;
		int Maths = 88;
		int Social = 99;
		int Science = 72;
		int Hindi = 83;
		
		
		int Total = Kannada+English+Maths+Social+Science+Hindi;
		float Percentage = Total/6f;
		
		System.out.println("The Total Marks are " + Total + " out of 600 and percenatge is " +Percentage );
	
	}
}
