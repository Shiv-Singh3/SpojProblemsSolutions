import java.util.Scanner;

public class Adding_Reversed_Numbers {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        int t = ob.nextInt();

        while(t > 0){
            int a = ob.nextInt();
            int b = ob.nextInt();

            System.out.println(reverse(reverse(a)+reverse(b)));
            t--;
        }
    }

    private static int reverse(int x){
        int a = 0;
        while (x != 0){
            a = (a*10) + x%10;
            x = x/10;
        }
        return a;
    }
}
