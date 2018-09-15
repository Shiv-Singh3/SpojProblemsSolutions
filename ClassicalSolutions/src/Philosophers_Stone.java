import java.util.Scanner;

public class Philosophers_Stone {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        while(t > 0){
            int r = ob.nextInt();
            int c = ob.nextInt();
            int a[][] = new int[r+1][c+1];
            int max = -1;
            int i,j;

            for(i=1;i<=r;i++){
                for(j=1;j<=c;j++){
                    a[i][j] = ob.nextInt();
                }
            }

            for(i=1;i<=r;i++){
                for(j=1;j<=c;j++){
                    a[i][j] = Math.max(Math.max(a[i-1][j],a[i-1][j-1]),(j<c?a[i-1][j+1]:-1))+a[i][j];
                }
            }

            for(i=0;i<=c;i++){
                if(max<a[r][i]){
                    max=a[r][i];
                }
            }

            System.out.println(max);
            t--;
        }
    }
}
