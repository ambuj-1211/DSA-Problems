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
            //a=[6,3,8,2,1,5,2,1]
            /** a=[4,1,6,0,1,3,0,1]
             *  a=[2,1,4,0,1,1,0,1]
             *  a=[2,0,4,0,0,0,0,0]
             *  a=[0,0,2,0,0,0,0,0]
             *  a=[0,0,0,0,0,0,0,0]
             */
            //a=[2,3,4,2,1,1,2,1]
            //a=[0,1,2,0,1,1,0,1]
            //a=[0,0,2,0,0,0,0,0]
            //a=[0,0,0,0,0,0,0,0]
            //ans=4
            int n=sc.nextInt();
            int[] a=new int[n];
            HashMap<Integer,Integer> mp = new HashMap<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(mp.containsKey(a[i])){
                    mp.put(a[i],mp.get(a[i]+1));
                }
                else
                mp.put(a[i],1);
            }
            for(int i:a){
                if(mp.containsKey(i))
            }
        }                        
   }
}