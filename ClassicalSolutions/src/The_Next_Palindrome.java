import java.util.*;

public class The_Next_Palindrome {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        String z=ob.nextLine();
        while(t!=0){
            char[] a = ob.next().toCharArray();

            if(check(a)){
                a[0]='1';
                for(int i=1;i<a.length;i++){
                    a[i]='0';
                }
                System.out.print(a);
                System.out.println("1");
            }
            else {
                fetchNext(a);
            }
            t--;
        }
    }

    private static boolean check(char[] a) {
        int l=a.length,i;
        for(i=0;i<l;i++){
            if(a[i]!='9'){
                return false;
            }
        }
        return true;
    }

    private static void fetchNext(char a[]){
        int i,j,l=a.length;
        boolean inc=false;
        for(i=0,j=l-1;i<=j;i++,j--){
            if(a[i]>a[j]){
                inc=true;
            }
            else if(a[j]>a[i])
                inc = false;
            a[j]=a[i];
        }
        if(!inc){
            int right=l/2;
            int left=l-right-1;

            while (a[right] == '9'){
                a[right]=a[left]='0';
                right++;
                left--;
            }
            a[right]++;
            a[left]=a[right];
        }
        System.out.println(a);
    }
}
