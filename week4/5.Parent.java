class Parent {

    int number = 100;

    Parent() {
        System.out.println("Parent constructor");
    }

    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {

    int number = 200;

    Child() {
        // Calling parent constructor
        super();
    }

    void show() {

        // Accessing parent class variable
        System.out.println("Parent number = " + super.number);

        // Calling parent class method
        super.display();

        // Child class variable
        System.out.println("Child number = " + number);
    }
}

class SuperDemo {
    public static void main(String[] args) {

        Child c = new Child();

        c.show();
    }
}