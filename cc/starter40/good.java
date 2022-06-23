import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
        
            int[] b=new int[n];
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            Map<Integer,Integer> mp = new HashMap<>();
            for(int i=0;i<n;i++){
                mp.put(a[i]^b[i],mp.getOrDefault(a[i]^b[i], 0)+1);
            }
            int sum=0;
            for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
                if(entry.getValue()>1){
                    sum+=combination(entry.getValue(), 2);
                }
            }
            System.out.println(sum);
        }
    }
    static int combination(int n,int r){
        int f1=1,f2=1,f3=1;
        for(int i=1;i<=n;i++)
        f1*=i;
        for(int i=1;i<r;i++)
        f2*=i;
        for(int i=1;i<n-r;i++)
        f3*=i;
        return f1/(f2*f3);
    }
}