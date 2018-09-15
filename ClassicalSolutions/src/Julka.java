import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Julka {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int c = 1;
        while(c++<=10) {
            BigInteger s = new BigInteger(bufferedReader.readLine());
            BigInteger a = new BigInteger(bufferedReader.readLine());
            BigInteger x = (s.add(a)).divide(new BigInteger("2"));
            BigInteger y = s.subtract(x);
            System.out.println(x);
            System.out.println(y);
        }
    }
}
