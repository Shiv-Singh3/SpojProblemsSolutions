import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cards {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while(t-- > 0){
            long n = Long.parseLong(bufferedReader.readLine());
            long x = n-1;
            long ans = ((x*(10+(x-1)*3))/2+2)%1000007;
            System.out.println(ans);
        }
    }
}
