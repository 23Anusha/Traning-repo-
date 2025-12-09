public class VariableScopeDemo {
    static String collegeName = "Tech University"; // Static variable
    String studentName; // Instance variable

    VariableScopeDemo(String name) {
        this.studentName = name;
    }

    void display() {
        System.out.println("College: " + collegeName + ", Student: " + studentName);
    }

    public static void main(String[] args) {
        VariableScopeDemo student1 = new VariableScopeDemo("Alice");
        VariableScopeDemo student2 = new VariableScopeDemo("Bob");

        student1.display();
        student2.display();

        // Change static variable
        VariableScopeDemo.collegeName = "Global Tech Institute";

        System.out.println("\nAfter changing college name:");
        student1.display();
        student2.display();
    }
}
