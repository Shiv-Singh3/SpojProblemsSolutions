import java.util.*;

public class Factorial {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        int t = ob.nextInt();

        while(t > 0){
            long a = ob.nextLong();
            System.out.println(compute(a));
            t--;
        }
    }

    public static long f(long x) {
        long d = 5;
        long ans = 0;
        while(x/d>0) {
            ans += (x/d);
            d*=5;
        }
        return ans;
    }

    public static long compute(long a){
        long count5 = 0;
        long x5 = 5;

        while (x5 <= a){
            count5 = count5 + (a/x5);
            x5 = x5*5;
        }

        return count5;
    }
}
