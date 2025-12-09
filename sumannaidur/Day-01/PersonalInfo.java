public class PersonalInfo {
    static void displayInfo() {
        String name = "Suman Naidu";
        int age = 22;
        double percentage = 85.5;
        boolean isStudent = true;

        System.out.println("Personal Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Is Student: " + isStudent);
    }

    public static void main(String[] args) {
        displayInfo();
    }
}
