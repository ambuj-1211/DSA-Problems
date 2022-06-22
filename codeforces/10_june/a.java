import java.util.*;
import java.lang.*;
import java.io.*;
public class a
{
    public static void main (String[] args) throws java.lang.Exception
    {
       Scanner sc=new Scanner(System.in);
       
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            char[] a2=a.toCharArray();
            char[] b2 =b.toCharArray();
            String c="";
            Arrays.sort(a2);
            Arrays.sort(b2);
            int l1=a2.length;
            int l2= b2.length;
            int i=0,j=0;
            int k2=0;
            while(a2[i]<b2[j] && k2++<=k){
                c+=a2[i];
            }

            // while( i<l1 && j<l2 ){
            //     if(a2[i]<b2[j])
            //     {
            //         c+=a2[i];
            //         i++;
            //     }
            //     else{
            //         c+=b2[j];
            //         j++;
            //     }
                
            // }
        }
    }
}