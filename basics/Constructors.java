class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }
}

public class Constructors {
    public static void main(String[] args) {

        //Default constructor
        Student s1 = new Student();
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

       // Paramaterized constructor
        Student s2 = new Student("Divya", 24);
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
    }
}

