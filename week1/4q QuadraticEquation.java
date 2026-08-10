import java.util.Scanner;

class QuadraticEquation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double D = (b * b) - (4 * a * c);

        System.out.println("Discriminant = " + D);

        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("Nature of roots: Two distinct real roots");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }
        else if (D == 0) {
            double root = -b / (2 * a);

            System.out.println("Nature of roots: Two equal real roots");
            System.out.println("Root = " + root);
        }
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);

            System.out.println("Nature of roots: Complex roots");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }

        sc.close();
    }
}