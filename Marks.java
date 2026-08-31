import java.util.Scanner;
class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}
class Marks {   
    static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid marks");
        }
        if (marks >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            checkMarks(marks);
        }
        catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Program completed.");
        }
    }
}