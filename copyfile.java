import java.io.*;


class copyfile {
    public static String getString() throws IOException {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }

    public static void main(String[] args) {
      StringBuilder s = new StringBuilder();
        try{System.out.println("Enter the source path");
            BufferedReader br = new BufferedReader(new FileReader(getString()));
             System.out.println("Enter the destination path");
            FileWriter fs = new FileWriter(getString());
            String temp;
            while((temp=br.readLine()) != null){
                  s.append(temp);
                  s.append("\n");
            }
           fs.write(s.toString());
           fs.close();
           br.close();
           System.out.println("Done!");
         }catch(Exception e){e.printStackTrace();
        }
        
                        
    }
}