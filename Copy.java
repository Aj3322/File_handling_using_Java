import java.io.*;

public class Copy {
    public static void main(String[] args) throws Exception {
        StringBuilder str = new StringBuilder(); // Use StringBuilder to build the copied content
        FileReader fr = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(fr);
        String temp;

        while ((temp = br.readLine()) != null) {
            str.append(temp); // Append each line to the StringBuilder
            str.append("\n"); // Add a newline character to separate lines
        }

        br.close(); // Close the BufferedReader

        FileWriter fw = new FileWriter("copy.txt"); // Create a new FileWriter for the destination file
        fw.write(str.toString()); // Write the contents of the StringBuilder to the new file

        fw.close(); // Close the FileWriter

        System.out.println("File copied successfully.");
    }
}