import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anti_Blot_System {

    public static void main(String[] args) throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(ob.readLine());

        while (t > 0) {

            String x = ob.readLine();
            String a = ob.readLine();
            System.out.println(compute(a));
            t--;
        }
    }

    private static String compute(String a){
        int indp = a.indexOf("+");
        int inde = a.indexOf("=");

        String b = a.substring(0,indp-1);
        String c = a.substring(indp+2,inde-1);
        String d = a.substring(inde+2);
        String answer;

        if(b.contains("machula")){
            long numc = Long.parseLong(c);
            long numd = Long.parseLong(d);
            long ans = numd-numc;
            answer = ans + " + " + c + " = " + d;
        }
        else if(c.contains("machula")){
            long numb = Long.parseLong(b);
            long numd = Long.parseLong(d);
            long ans = numd - numb;
            answer = b + " + " + ans + " = " + d;
        }
        else{
            long numb = Long.parseLong(b);
            long numc = Long.parseLong(c);
            long ans = numb + numc;
            answer = b + " + " + c + " = " + ans;
        }
        return answer;
    }
}
