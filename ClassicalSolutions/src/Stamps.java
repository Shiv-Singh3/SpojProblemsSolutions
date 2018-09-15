import java.util.*;

public class Stamps {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t=ob.nextInt(),e=1;
        while(t-- > 0){
            int a=ob.nextInt();
            int b=ob.nextInt();
            int c[]=new int[b];
            int i,d=0;
            long sum=0;
            for(i=0;i<b;i++){
                c[i]=ob.nextInt();
            }
            Arrays.sort(c);
            i=b-1;
            while(i>=0 && sum<a){
                sum+=c[i--];
                d++;
            }
            System.out.println("Scenario #"+e+":");
            e++;
            if(sum<a)
                System.out.println("impossible");
            else
                System.out.println(d);
            System.out.println();
        }
    }
}
