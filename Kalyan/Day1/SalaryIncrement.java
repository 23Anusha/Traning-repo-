package Practice;

public class SalaryIncrement {

	public static void main(String[] args) {
		int Salary = 29000;
		float Bonus = 20f;
		
		float FinalSalary = Salary + (Salary * Bonus/100f);
		
		System.out.println("The Final Salary is After Bonus " +FinalSalary);
		

	}

}
