import java.io.*;

public class CharCount{
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("aj.txt");
         
        int line =0;
        int count =0;

               while((line=fr.read())>-1){
                  
                  if (!Character.isWhitespace((char)line)){
                    count++;
                  }

               }
              
                System.out.println("No of Character is: " + count);
               System.out.println("Task done!");

    }
}
