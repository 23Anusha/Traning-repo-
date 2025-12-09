package Practice;

class Person {
	String name = "Vennela";
	int age = 22;
	float percentage = 80.5f;
	boolean student = true;
}
public class PersonalDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		System.out.println("The Person Name is" + person.name);
		System.out.println("The Person Age is" + person.age);
		System.out.println("The Person Percentage is" + person.percentage);
		System.out.println("Does the Person is Student ?" + person.student);
	}

}
