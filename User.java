import java.util.Scanner;
import java.io.FileWriter;
class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            if (password.length() < 5 || password.length() > 8) {
                throw new Exception("Password must be 5 to 8 characters");
            }
            if (!password.matches("[a-zA-Z0-9]+")) {
                throw new Exception("Special characters are not allowed");
            }
            System.out.print("Re-enter password: ");
            String rePassword = sc.nextLine();
            if (password.equals(rePassword)) {
                System.out.println("Password Success");
                FileWriter f = new FileWriter("users.txt", true);
                f.write(name + " " + password + "\n");
                f.close();
                System.out.println("Details saved successfully");
            } 
            else {
                System.out.println("Invalid Password");
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}