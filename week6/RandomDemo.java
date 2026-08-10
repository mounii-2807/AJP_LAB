import java.util.Random;

class RandomDemo {
    public static void main(String[] args) {

        Random r = new Random();

        // Generate random integer
        int num1 = r.nextInt(100);

        // Generate random double
        double num2 = r.nextDouble();

        // Generate random boolean
        boolean value = r.nextBoolean();

        System.out.println("Random integer = " + num1);
        System.out.println("Random double = " + num2);
        System.out.println("Random boolean = " + value);
    }
}