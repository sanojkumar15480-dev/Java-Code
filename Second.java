
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter num : ");
        String name = br.readLine();

        System.out.println("Welcom " + name);
    }
}