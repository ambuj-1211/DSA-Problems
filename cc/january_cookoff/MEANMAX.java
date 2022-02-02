import java.util.*;
public class MEANMAX {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t;
        t=sc.nextInt();
        int n;
        Vector<Long> a=new Vector<>();
        float res;
        while(t-->0){
            n=sc.nextInt();
            

            for(int i=0;i<n;i++){
                a.add(sc.nextLong());
            }

            Collections.sort(a);
            float sum=0;

            for(int i=0;i<a.size()-1;i++){
                sum=sum+a.get(i);
            }

            res=a.get(a.size()-1)+sum/(a.size()-1);
            System.out.println(res);
            a.clear();
        }
    }
}
