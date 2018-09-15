import java.util.*;

public class Prime_Generator {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        int t = ob.nextInt();

        while(t > 0){
            int a = ob.nextInt();
            int b = ob.nextInt();

            for(int i = a;i <= b;i++){
                if(checkprime(i)){
                    System.out.println(i);
                }
            }

            System.out.println();
            t--;
        }
    }

    private static boolean checkprime(int x){

        if(x < 2)
            return false;

        for(int i = 2;i <= (int)(Math.sqrt(x)); i++){
            if(x%i == 0)
                return false;
        }
        return true;
    }
}
