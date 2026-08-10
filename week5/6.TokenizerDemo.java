import java.util.Scanner;
import java.util.StringTokenizer;

class TokenizerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers separated by spaces:");

        String line = sc.nextLine();

        StringTokenizer st = new StringTokenizer(line);

        int sum = 0;

        System.out.println("Integers are:");

        while (st.hasMoreTokens()) {

            int num = Integer.parseInt(st.nextToken());

            System.out.println(num);

            sum = sum + num;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}