import java.io.*; 

public class Class02{ 
    public static void main(String[] args) throws IOException { 
        BufferedReader buf = new BufferedReader(
                                   new InputStreamReader(System.in));  
        String text = buf.readLine(); 
        System.out.println(text.toUpperCase()); 
    } 
} 