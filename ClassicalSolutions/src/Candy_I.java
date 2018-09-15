import java.util.Arrays;
import java.util.Scanner;

public class Candy_I {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            if(a == -1){
                break;
            }
            int b[] = new int[a];
            int i,sum = 0, swaps = 0;
            double mean;

            for(i = 0;i < a;i++){
                b[i] = scanner.nextInt();
            }

            for(i = 0;i < a;i++){
                sum += b[i];
            }

            mean = (double)sum/a;
            if((mean - (int)mean) != 0){
                System.out.println("-1");
            }
            else{
                Arrays.sort(b);
                int c = 0;
                while(b[c] < mean){
                    swaps += mean-b[c];
                    c++;
                }
                System.out.println(swaps);
            }
        }
    }
}
