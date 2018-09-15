import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Rectangles {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int i,j,k;
        long ans = 0;
        for(k=1;k<=n;k++) {
            ArrayList<Integer> x = new ArrayList<>();
            for (i = 1; i <= (int) Math.sqrt(k); i++) {
                int f = 0;
                if (k % i == 0) {
                    for (j = 0; j < x.size(); j++) {
                        if (i * x.get(j) == n) {
                            f = 1;
                            break;
                        }
                    }
                    if (f == 0) {
                        x.add(i);
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
