import java.io.*;

public class ReadAFile{
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("abc.txt")) {
          int line =0;

                 while((line=fr.read())>-1){
                    System.out.print((char)line);
                 } fr.close();
        }
        System.out.println("Task done!");

    }
}
