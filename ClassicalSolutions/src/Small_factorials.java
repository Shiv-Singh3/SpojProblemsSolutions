import java.util.*;

public class Small_factorials {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        int t = ob.nextInt();

        while(t > 0){
            int a = ob.nextInt();
            ArrayList<Integer> num = new ArrayList<Integer>();
            num.add(1);
            compute(a,num);
            for(int i = num.size()-1;i >= 0;i--){
                System.out.print(num.get(i));
            }
            System.out.println();
            t--;
        }
    }

    private static void compute(int a, ArrayList<Integer> num){

        for(int i = 2;i <= a;i++){
            multiply(i,num);
        }
    }

    private static void multiply(int x, ArrayList<Integer> num){

        int carry = 0, product;
        for(int i = 0; i < num.size(); i++){
            int b = num.get(i);
            product = b*x + carry;
            carry = product/10;
            product = product%10;
            num.set(i, product);
        }

        while(carry != 0){
            num.add(carry%10);
            carry = carry/10;
        }
    }
}
