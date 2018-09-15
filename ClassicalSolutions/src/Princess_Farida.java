import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Princess_Farida {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        int c = 1;
        while(t-- > 0){
            int n = Integer.parseInt(bufferedReader.readLine());
            String[] a = bufferedReader.readLine().split(" ");
            long dp[] = new long[n+2];
            int i;
            for(i=2;i<(n+2);i++){
                dp[i] = Math.max(dp[i-2]+Long.parseLong(a[i-2]),dp[i-1]);
            }
            System.out.println("Case "+ c+": "+dp[dp.length-1]);
            c++;
        }
    }
}
