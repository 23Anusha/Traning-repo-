package Practice;

public class MarksAndPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Kannada = 108;
		int English = 76;
		int Hindi = 88;
		int Mathematics = 63;
		int Science = 67;
		int Socialscience = 82;
		int Total = Kannada+English+Hindi+Mathematics+Science+Socialscience;
		float Percentage = Total/6.25f;
		System.out.println("The Total Marks Are " + Total + "Out of 625 And The Percentage is " + Percentage);
	}

}
