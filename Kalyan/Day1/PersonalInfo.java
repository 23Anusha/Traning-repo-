package Practice;

class Person{
	String Name = "Kalyan";
	byte Age = 22;
	float Percentage = 89.8f;
	boolean Student = false;
}
public class PersonalInfo {

	public static void main(String[] args) {
	
		Person person = new Person();
		System.out.println("The Person Name is " + person.Name);
		System.out.println("The Person Age is " + person.Age);
		System.out.println("The Person Percentage is " +person.Percentage);
		System.out.println("Does The Person is  Student ? " +person.Student);
	}
}
