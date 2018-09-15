import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class He_is_offside {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a[] = bufferedReader.readLine().split(" ");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);

        while(x!=0 && y!=0){
            String in1[] = bufferedReader.readLine().split(" ");
            String in2[] = bufferedReader.readLine().split(" ");
            int b[] = new int[x];
            int c[] = new int[y];
            int i;
            for(i=0;i<x;i++){
                b[i] = Integer.parseInt(in1[i]);
            }
            for(i=0;i<y;i++){
                c[i] = Integer.parseInt(in2[i]);
            }
            Arrays.sort(b);
            Arrays.sort(c);
            if(b[0] < c[1])
                System.out.println("Y");
            else
                System.out.println("N");
            a = bufferedReader.readLine().split(" ");
            x = Integer.parseInt(a[0]);
            y = Integer.parseInt(a[1]);
        }
    }
}
