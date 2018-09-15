import java.util.*;

public class Feynman {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        int t;
        while((t = ob.nextInt()) != 0){
            long ans = (t*(t+1)*(2*t+1))/6;
            System.out.println(ans);
        }
    }
}
