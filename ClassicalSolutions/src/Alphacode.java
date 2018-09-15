import java.util.Scanner;

public class Alphacode {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        while (true){

            String a = ob.nextLine();
            if(a.equals("0")){
                break;
            }
            System.out.println(compute(a));
        }
    }

    private static long compute(String a){
        int l=a.length();
        a=" "+a;
        long dp[] = new long[l+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=l;i++){
            int ch = Character.getNumericValue(a.charAt(i));
            int num = Character.getNumericValue(a.charAt(i-1))*10 + ch;
            if(ch != 0){
                dp[i]=dp[i-1];
            }
            if(num >= 10 && num <= 26){
                dp[i]+=dp[i-2];
            }
        }
        return dp[l];
    }
}
