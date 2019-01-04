import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
    private String name;

    public static void main(String[] args) {

        System.out.println("input:");
        InputStream inputStream = System.in;
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        try {
            String result = bufferedReader.readLine();
            System.out.println("result:"+result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
