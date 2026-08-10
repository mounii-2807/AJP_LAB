import mypack.Area;

class Circle {
    public static void main(String[] args) {

        Area a = new Area();

        double radius = 5;

        double result = a.circleArea(radius);

        System.out.println("Area of Circle = " + result);
    }
}