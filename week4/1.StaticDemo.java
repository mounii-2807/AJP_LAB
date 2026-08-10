class StaticDemo {

    // Static variable
    static int count = 10;

    // Static block
    static {
        System.out.println("Static block is executed");
    }

    // Static method
    static void display() {
        System.out.println("Static variable = " + count);
    }

    public static void main(String[] args) {

        System.out.println("Main method is executed");

        // Calling static method
        display();
    }
}