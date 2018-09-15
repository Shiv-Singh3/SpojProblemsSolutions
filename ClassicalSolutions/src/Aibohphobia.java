import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aibohphobia {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while(t-- > 0){
            String s = bufferedReader.readLine();
            String r = rev(s);
            int mat[][] = new int[s.length()+1][s.length()+1];
            System.out.println(s.length()-LCS(mat,s,r));
        }
    }

    private static String rev(String s){
        String ans = "";
        for(int i=s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
        }
        return ans;
    }

    private static int LCS(int mat[][],String s,String r){
        int i,j;
        for(i=1;i<mat.length;i++){
            char sc = s.charAt(i-1);
            for(j=1;j<mat[0].length;j++){
                char rc = r.charAt(j-1);
                if(sc==rc){
                    mat[i][j] = mat[i-1][j-1] + 1;
                }
                else{
                    mat[i][j] = Math.max(mat[i-1][j], mat[i][j-1]);
                }
            }
        }
        return mat[s.length()][s.length()];
    }
}
