import java.util.Scanner;

class WordFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        // Convert to lowercase
        text = text.toLowerCase();

        // Remove punctuation
        text = text.replaceAll("[^a-zA-Z0-9 ]", "");

        // Split sentence into words
        String[] words = text.split("\\s+");

        System.out.println("Word Frequency:");

        for (int i = 0; i < words.length; i++) {

            int count = 1;

            // Skip if word was already counted
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (words[i].equals(words[k])) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // Count occurrences
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            System.out.println(words[i] + " : " + count);
        }

        sc.close();
    }
}