import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Happy_Numbers_I {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bufferedReader.readLine());
        long c = 0;
        HashMap<Long,String> map = new HashMap<Long, String>();
        while(n!=1 && !map.containsKey(n)){
            map.put(n,"1");
            long t = n,num=0;
            while (t!=0){
                num=num+(long)(Math.pow(t%10,2));
                t=t/10;
            }
            c++;
            n=num;
        }
        if(n!=1){
            System.out.println("-1");
        }
        else {
            System.out.println(c);
        }
    }
}
