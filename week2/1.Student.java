class Student {

    String name;
    int age;

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }

    public static void main(String[] args) {

        // Creating an object
        Student s1 = new Student();

        // Assigning values
        s1.name = "Mounika";
        s1.age = 20;

        // Calling method
        s1.display();
    }
}