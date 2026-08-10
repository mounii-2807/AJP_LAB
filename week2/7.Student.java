class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }

    public static void main(String[] args) {

        // Calling default constructor
        Student s1 = new Student();

        System.out.println("Default Constructor:");
        s1.display();

        // Calling parameterized constructor
        Student s2 = new Student("Mounika", 20);

        System.out.println("\nParameterized Constructor:");
        s2.display();
    }
}