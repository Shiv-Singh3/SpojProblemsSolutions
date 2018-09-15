import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Candy_III {

    public static void main(String[] args) throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(ob.readLine());
        while(t>0){
            String a=ob.readLine();
            long n=Long.parseLong(ob.readLine());
            long s=0;
            for(int i=0;i<n;i++){
                s=(s+Long.parseLong(ob.readLine()))%n;
            }
            if(s%n==0)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }
}
