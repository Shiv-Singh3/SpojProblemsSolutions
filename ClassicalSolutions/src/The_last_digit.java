import java.util.Scanner;

public class The_last_digit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0) {
            int a = scanner.nextInt();long b = scanner.nextLong();
            if(b == 0) System.out.println("1");
            else { String patt  = pattern(a%10);
                System.out.println(patt.charAt((int)(b%patt.length()-1+patt.length())%patt.length())); }t--;
        } }
    private static String pattern(int a){
        int i=1; String c="";
        while(true){ int b = (int)Math.pow(a,i++)%10;
            if(c.contains(String.valueOf(b))) break; c=c+b; }
        return c;
    }
}
