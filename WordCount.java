import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        int count = 0;
        try (FileReader fr = new FileReader("aj.txt")) {
            int character;
            boolean inWord = false;
            while ((character = fr.read()) != -1) {
                if (Character.isLetterOrDigit((char) character)) {
                    if (!inWord) {
                        inWord = true;
                        count++;
                    }
                } else {
                    inWord = false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Word count: " + count);
    }
}
