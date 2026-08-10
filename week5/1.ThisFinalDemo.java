class ThisFinalDemo {

    // Instance variables
    String name;
    int age;

    // Final variable
    final int ID = 101;

    // Constructor
    ThisFinalDemo(String name, int age) {

        // this refers to current object
        this.name = name;
        this.age = age;
    }

    // Final method
    final void display() {

        System.out.println("Name = " + this.name);
        System.out.println("Age = " + this.age);
        System.out.println("ID = " + ID);
    }

    public static void main(String[] args) {

        ThisFinalDemo obj = new ThisFinalDemo("Mounika", 20);

        obj.display();

        // ID = 102;  // Error because ID is final
    }
}