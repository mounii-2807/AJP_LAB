abstract class Shape {

    // Abstract method
    abstract void area();

    // Normal method
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {

    void area() {
        double radius = 5;

        double result = Math.PI * radius * radius;

        System.out.println("Area of Circle = " + result);
    }
}

class AbstractDemo {
    public static void main(String[] args) {

        Circle c = new Circle();

        c.display();
        c.area();
    }
}