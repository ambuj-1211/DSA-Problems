import java.util.*;
import java.lang.*;
import java.io.*;
public class andxor
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int dig=1+(int)(Math.log(n)/Math.log(2));
            int digc=dig;
            int n1=1,n2=1;
            int c1=0,c0=0;
            while(dig-->0){
                if((n&1)==1){
                    c1++;
                    if(c1==1)
                    n1=n1<<digc-dig;
                }
                else if((n&1)==0){
                        c0++;
                        if(c0==1)
                        n2=n2<<digc-dig;
                }
                n=n>>1;s
            }
            if(c1>1)
            System.out.println(n1);
            else{
            int ans=n1+n2;
            System.out.println(ans);
            }
        }
    }
}