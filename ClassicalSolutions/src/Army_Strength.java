import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Army_Strength {

    public static void main(String[] args) throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(ob.readLine());
        while(t-- > 0){
            String b=ob.readLine();
            String f=ob.readLine();
            int c = Integer.parseInt(f.split(" ")[0]);
            int d=Integer.parseInt(f.split(" ")[1]);
            int maxc=-1,maxd=-1;
            int i;
            String z[] = ob.readLine().split(" ");
            for(i=0;i<c;i++){
                int e=Integer.parseInt(z[i]);
                if(maxc<e){
                    maxc=e;
                }
            }
            String z1[] = ob.readLine().split(" ");
            for(i=0;i<d;i++){
                int e=Integer.parseInt(z1[i]);
                if(maxd<e){
                    maxd=e;
                }
            }
            if(maxc>=maxd)
                System.out.println("Godzilla");
            else
                System.out.println("MechaGodzilla");
        }
    }
}
