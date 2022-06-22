import java.util.*;
import java.lang.*;
import java.io.*;
public class Beat_The_Odds
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
            int e=0,o=0;
            for(int i:a){
                if(i%2==0)
                e++;
                else
                o++;
            }
            if(e>o)
            System.out.println(o);
            else
            System.out.println(e);
        }
    }
}