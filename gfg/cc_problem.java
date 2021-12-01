import java.io.IOException;
import java.io.BufferedReader;
import java.math.BigInteger;
import java.io.InputStreamReader;

public class cc_problem {
    public static void main(String [] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        final int n=Integer.parseInt(bufferedReader.readLine());
        System.out.println(factorial(n));

    }
    public  static BigInteger factorial (int n){
        BigInteger result =BigInteger.ONE;
        for(int i=2;i<=n;i++){
        result =result.multiply(BigInteger.valueOf(i));
        }
        return result;

    }
}
