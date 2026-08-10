import java.util.Scanner;

class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // if-else
        if (n > 0) {
            System.out.println("Number is positive");
        } else if (n < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // switch
        System.out.print("Enter a number from 1 to 3: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected One");
                break;

            case 2:
                System.out.println("You selected Two");
                break;

            case 3:
                System.out.println("You selected Three");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}