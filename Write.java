import java.io.*;

public class Write {
    public static void main(String args[]) {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            FileOutputStream fos = new FileOutputStream("abc.txt");
            char ch;

            System.out.println("Enter the text \n Type '@' to Stop:");

            while ((ch = (char) dis.read()) != '@') {
                fos.write(ch);
            }

            fos.close();
            System.out.println("Data has been written to abc.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
