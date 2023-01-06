import java.io.*;
public class Class10{
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("rand.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        int r = 0;
        for(int i = 0;i<1000;i++){
            r = (int)(Math.random()*99999)+1;
            //System.out.println(r);
            bw.write(r);
            bw.flush();
            bw.close();
        }
        


    }
    
}