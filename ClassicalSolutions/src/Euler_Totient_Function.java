import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Euler_Totient_Function {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        int x[] = new int[10000000];
        while(t-- > 0){
            int n = Integer.parseInt(bufferedReader.readLine());
            if(x[n]!=0){
                System.out.println(x[n]);
                continue;
            }
            System.out.println(compute(n,x));
        }
    }

    private static int compute(int n, int x[]) {
        int i;
        int ans = n;
        for(i=2;i*i<=n;i++){
            if(n%i==0){
                while (n%i==0){
                    n=n/i;
                }
                ans-=ans/i;
            }
        }
        if(n>1){
            ans-=ans/i;
        }
        x[n]=ans;
        return ans;
    }
}
