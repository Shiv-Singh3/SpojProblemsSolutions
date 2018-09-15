import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Edit_distance {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while(t-- > 0){
            String s1 = bufferedReader.readLine();
            String s2 = bufferedReader.readLine();
            int mat[][] = new int[s2.length()+1][s1.length()+1];
            int i;

            if(s1.length()==0){
                System.out.println(s2.length());
                continue;
            }

            if(s2.length() == 0){
                System.out.println(s1.length());
                continue;
            }

            for(i=0;i<s1.length();i++){
                mat[0][i]=i;
            }
            for(i=0;i<s2.length();i++){
                mat[i][0]=i;
            }
            System.out.println(MED(mat,s1,s2));
        }
    }

    private static int MED(int mat[][],String s1,String s2){
        int i,j;
        for(i=1;i<=s2.length();i++){
            char s2c = s2.charAt(i-1);
            for(j=1;j<=s1.length();j++){
                char s1c = s1.charAt(j-1);
                int v = Math.min(Math.min(mat[i-1][j-1],mat[i-1][j]),mat[i][j-1]);
                if(s1c==s2c){
                    mat[i][j]=mat[i-1][j-1];
                }
                else {
                    mat[i][j]=v+1;
                }
            }
        }
        return mat[s2.length()][s1.length()];
    }
}
