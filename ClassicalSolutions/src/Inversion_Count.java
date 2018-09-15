import java.io.*;

public class Inversion_Count {

    public static void main(String[] args) throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(ob.readLine());

        while (t > 0) {

            String x = ob.readLine();
            int n = Integer.parseInt(ob.readLine());
            int a[] = new int[n];
            int i,max=-1;
            long count=0;

            for (i = 0; i < n; i++) {
                a[i] = Integer.parseInt(ob.readLine());
                if(max < a[i]){
                    max = a[i];
                }
            }

            long bit[] = new long[max + 1];

            for(i=n-1;i>=0;i--){
                count+=search(bit, a[i]-1);
                update(bit,max,a[i]);
            }

            System.out.println(count);
            t--;
        }
    }

    private static void update(long bit[],int n,int i){
        int index = i+1;
        while(index <= n){
            bit[index]+=1;
            index += index & (-index);
        }
    }

    private static long search(long bit[],int i){
        int index = i+1;
        long ans = 0;
        while(index > 0){
            ans+=bit[index];
            index -= index & (-index);
        }
        return ans;
    }
}
