import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Build_a_Fence {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        while(a!=0){
            double ans = (Math.pow(a,2)/(2*3.14159));
            ans = Double.parseDouble(df2.format(ans));
            System.out.printf("%.2f\n",ans);
            a = Integer.parseInt(bufferedReader.readLine());
        }
    }
}
