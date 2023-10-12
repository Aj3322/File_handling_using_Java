import java.io.*;

public class RAF {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the source path");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filePath = br.readLine();
        RandomAccessFile rafFile = new RandomAccessFile(filePath, "rw");
        
        
        System.out.println("Enter the String that you want to replace");
        String replace = br.readLine();
        System.out.println("Enter the String that you want to write");
        String write = br.readLine();

        String line;
        while ((line = rafFile.readLine()) != null) {
            long currentPosition = rafFile.getFilePointer();
            if (line.contains(replace)) {
                line = line.replace(replace, "Ajay");
                rafFile.seek(currentPosition);
                rafFile.writeBytes(write);
                System.out.println("Replaced "+replace+" with "+write);
            }
        }
        rafFile.close();
        System.out.println(" Task done!");
    }
}
