import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class03 {
    public static void main(String[] args)throws IOException {
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        String num = inp.readLine();
        int sum = 0;
        for(int i = 1;i <= Integer.parseInt(num);i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
