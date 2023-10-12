import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyMedia {
     public static String getString() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static void main(String[] args) {
        try{System.out.println("Enter the source path");
            FileInputStream fis = new FileInputStream(getString());
             System.out.println("Enter the destination path");
            FileOutputStream fos = new FileOutputStream(getString());
            byte temp[] = new byte[1024];
            int i = 0;
            while((i=fis.read(temp))>0){
                 fos.write(temp, 0, i);
            }
          
           fis.close();
           fos.close();
           System.out.println("Done!");
         }catch(Exception e){e.printStackTrace();
        }
        
                        
    }
}
