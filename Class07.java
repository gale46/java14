import java.io.*;
public class Class07{
    public static void main(String[] args)throws IOException, NumberFormatException{
        String line = null;
        FileReader fw = new FileReader("donkey.txt");
        BufferedReader br = new BufferedReader(fw);
        while ((line = br.readLine()) != null){
            try {
                br.skip(13);
                System.out.println(line);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("error");
            }
        }
    }
}