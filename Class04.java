
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Class04{
    public static void main(String[] args)throws IOException {
        String line = null;
        int count = 0;
        FileReader fw = new FileReader("donkey.txt");
        BufferedReader br = new BufferedReader(fw);
        while ((line = br.readLine()) != null){
            count += line.length();
            System.out.println(line);
        }
        System.out.println(count);
        //(b)一樣
    }
}