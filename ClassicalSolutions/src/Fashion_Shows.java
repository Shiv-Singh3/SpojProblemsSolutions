import java.util.*;

public class Fashion_Shows {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while(t > 0){
            int n = scanner.nextInt();
            int m[] = new int[n];
            int w[] = new int[n];
            int i;
            long sum = 0;

            for(i = 0;i < n;i++){
                m[i] = scanner.nextInt();
            }

            for(i = 0;i < n;i++){
                w[i] = scanner.nextInt();
            }

            Arrays.sort(m);
            Arrays.sort(w);

            for(i = 0;i < n;i++){
                sum+= m[i]*w[i];
            }
            System.out.println(sum);
            t--;
        }
    }
}
