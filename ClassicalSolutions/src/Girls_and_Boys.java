import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Girls_and_Boys {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] a = bufferedReader.readLine().split(" ");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);

        while(x!=-1 && y!=-1){
            int min = Math.min(x,y);
            int max = Math.max(x,y);
            if(min == 0){
                System.out.println(max);
            }
            else{
                double ans = (double)max/(min+1);
                if(ans - (int)ans == 0){
                    System.out.println((int)ans);
                }
                else {
                    System.out.println((int)ans+1);
                }
            }
            a = bufferedReader.readLine().split(" ");
            x = Integer.parseInt(a[0]);
            y = Integer.parseInt(a[1]);
        }
    }
}
