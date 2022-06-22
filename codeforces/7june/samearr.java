import java.util.*;
import java.lang.*;
import java.io.*;
public class samearr
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
            if(helper(a, b, n))
            System.out.println("Yes"); 
            else
            System.out.println("No");   
            
        }
    }
    static boolean helper(int[] a,int[] b,int n){
        int[] d=new int[n];
            for(int i=0;i<n;i++){
                d[i]=a[i]-b[i];
                if(d[i]<0)
                    return false;
               
            }
            Map<Integer,Integer> mp= new HashMap<>();
            for(int i=0;i<n;i++){
                mp.put(d[i],mp.getOrDefault(d[i], 0)+1);
            }
            int max=-1;
            for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
                if(entry.getValue()>max){
                    max=entry.getValue();
                }
            }
            int c=0;
            for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
                if(entry.getValue()>max)
                {
                    return false;
                }
                else
                c++;
            }
            return true;

    }
}