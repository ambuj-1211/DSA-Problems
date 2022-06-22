import java.util.*;
import java.lang.*;
import java.io.*;

public class maxsizebits {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            long k = sc.nextInt();
            long a, b = 0, c, d;
            for (int i = 0; i < 31; i++) {
                a = (1 << (i + 1)) - 1;
                if (k/ (a * n) == 0) {
                    b = i;
                    break;
                }
                c = a * n;
                d = a;
            }

            long ans = b * n;
    long ex = k - c;
    long e = (1 << b);
    
    ans = ans + (ex / e);
    long rem = ex % e;
    ans -= countsetbit(d);
    d+=rem;
    ans+=countsetbit(d);
    System.out.println(ans);
        }
    }
}

/*ind is b
 * n is n 
 * val is k
 * prev is c
 * ding is d
 * r is a
 * extra is ex
 * e is e
 */