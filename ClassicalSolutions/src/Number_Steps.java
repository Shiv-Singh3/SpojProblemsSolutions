import java.util.Scanner;

public class Number_Steps {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();

        while (t > 0) {
            int x = ob.nextInt();
            int y = ob.nextInt();

            if(x < y || (x-y) > 2)
                System.out.println("No Number");

            else{
                if(x == y){
                    System.out.println(x+y-(y%2));
                }

                else if(x == y+2){
                    System.out.println(x+y-(y%2));
                }

                else{
                    System.out.println("No Number");
                }
            }
            t--;
        }
    }
}
