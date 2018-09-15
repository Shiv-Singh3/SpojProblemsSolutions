import java.io.*;
import java.util.Stack;

public class Street_Parade {

    public static void main(String[] args) throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(ob.readLine());
        while(n!=0){
            String a[] = ob.readLine().split(" ");
            int b[] = new int[a.length];
            int c[] = new int[a.length];
            Stack<Integer> stack = new Stack<Integer>();
            int i,ic=0;

            for(i=0;i<n;i++){
                b[i]=Integer.parseInt(a[i]);
            }
            i=0;
            while(i < b.length){
                while (!stack.empty() && (stack.peek() < b[i])){
                    c[ic++] = stack.pop();
                }
                stack.push(b[i++]);
            }
            while(!stack.empty() ){
                c[ic++] = stack.pop();
            }

            boolean ans = true ;
            for(i = 1;i<n;i++) {
                if (c[i] != (c[i - 1]+1)) {
                    ans = false;
                    break;
                }
            }

            if(ans)
                System.out.println("yes");
            else
                System.out.println("no");
            n = Integer.parseInt(ob.readLine());
        }
    }
}
