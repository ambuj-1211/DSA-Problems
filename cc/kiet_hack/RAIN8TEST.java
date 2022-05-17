import java.sql.PseudoColumnUsage;
import java.util.Scanner;
import java.util.Vector;

public class RAIN8TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, x;
        Vector<Integer> v = new Vector<>();
        while (t-- > 0) {
            int s = 0;
            n = sc.nextInt();
            x = sc.nextInt();
            for (int i = 0; i < n; i++) {
                v.add(sc.nextInt());
            }
            if(v.size()>1){
            for (int i = 1; i < n; i++) {
                if(v.get(i-1)==1&&i==v.size()-1){
                    s=s+2;
                }
                else if(v.get(i-1)==1){
                    s=s+1;
                }
                else if(v.get(i-1)==0&&v.get(i-2)==1&&i!=1)
                s=s+1;
                else if(v.get(i-1)==0)
                s=s+1;
                
                else if(v.get(i-1)==0)
                s=s+0;
                
                }
            }
            
        
            else if(v.size()==1){
                if(v.get(0)==0)
                s=s+0;
                else
                s=s+1;
            }

            int cost;
            cost = x * s;
            System.out.println(cost);
            v.clear();

        }
    }
}
