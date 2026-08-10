import java.io.File;
import java.util.Scanner;

class FileInformation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        System.out.println("File exists: " + file.exists());
        System.out.println("File readable: " + file.canRead());
        System.out.println("File writable: " + file.canWrite());

        if (file.isFile()) {
            System.out.println("Type: File");
        } else if (file.isDirectory()) {
            System.out.println("Type: Directory");
        } else {
            System.out.println("Type: Not found");
        }

        System.out.println("File length: " + file.length() + " bytes");

        sc.close();
    }
}