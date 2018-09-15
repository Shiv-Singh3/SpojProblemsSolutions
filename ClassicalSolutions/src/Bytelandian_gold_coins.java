import java.util.HashMap;
import java.util.Scanner;

public class Bytelandian_gold_coins {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<Long,Long> map = new HashMap<>();
        while (scanner.hasNext()){
            long a;
            a = scanner.nextLong();
            if(a == -1){
                break;
            }
            System.out.println(divide(a, map));
        }
    }

    private static long divide(long num, HashMap<Long,Long> map){
        if(num==0 || num == 1) return num ;

        if(map.containsKey(num)){
            return map.get(num);
        }

        long count = divide(num/2, map) + divide(num/3, map) + divide(num/4, map);

        if(count < num){
            map.put(num,num);
            return num;
        }

        else{
            map.put(num,count);
        }

        return map.get(num);
    }
}
