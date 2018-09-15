import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Will_it_ever_stop {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bufferedReader.readLine());
        if((n & (n-1)) == 0){
            System.out.println("TAK");
        }
        else {
            System.out.println("NIE");
        }
    }
}
