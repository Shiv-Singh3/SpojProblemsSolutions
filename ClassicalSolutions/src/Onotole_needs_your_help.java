import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Onotole_needs_your_help {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        long ans = 0;
        while(t-- > 0){
            long n = Long.parseLong(bufferedReader.readLine());
            ans = ans^n;
        }
        System.out.println(ans);
    }
}
