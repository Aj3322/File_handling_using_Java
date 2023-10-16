import java.io.*;

public class WriteAFile {
    public static void main(String[] args) throws Exception {
        String str = "hii Aj \n Welcome to my Github";
        FileWriter fw = new FileWriter("abc.txt");
        fw.write(str);
        fw.close();
        System.out.println("Task Done!");
    }
}
