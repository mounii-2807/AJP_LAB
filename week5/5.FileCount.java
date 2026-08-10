import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class FileCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        int lines = 0;
        int words = 0;
        int characters = 0;

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(fileName));

            String line;

            while ((line = br.readLine()) != null) {

                // Count lines
                lines++;

                // Count characters
                characters += line.length();

                // Count words
                if (!line.trim().isEmpty()) {
                    words += line.trim().split("\\s+").length;
                }
            }

            br.close();

            System.out.println("Number of lines = " + lines);
            System.out.println("Number of words = " + words);
            System.out.println("Number of characters = " + characters);

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        sc.close();
    }
}