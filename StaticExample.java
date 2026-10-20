// Concept 2: Static Keyword
// A static variable is shared by all objects of a class.
// A static method belongs to the class and can be called without an object.
class Student {
    String name;                       // instance variable (each object has its own)
    static String college = "Presidential Graduate School"; // shared by all
    static int totalStudents = 0;      // counts how many objects are created

    Student(String name) {
        this.name = name;
        totalStudents++;               // same counter increases for every object
    }

    void display() {
        System.out.println(name + " studies at " + college);
    }

    // static method: called using the class name
    static void showTotal() {
        System.out.println("Total students created: " + totalStudents);
    }
}

public class StaticExample {
    // static utility method in the main class
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Student.showTotal();           // 0, before any object exists

        Student s1 = new Student("Devraj");
        Student s2 = new Student("Anish");
        Student s3 = new Student("Priya");

        s1.display();
        s2.display();
        s3.display();
        Student.showTotal();           // 3

        // Changing the static variable once changes it for every object
        Student.college = "PGS Kathmandu";
        System.out.println("\nAfter changing the static college name:");
        s1.display();
        s3.display();

        System.out.println("\nSquare of 7 using a static method: " + square(7));
        System.out.println("Square root of 49 using static Math.sqrt: " + Math.sqrt(49));
    }
}
