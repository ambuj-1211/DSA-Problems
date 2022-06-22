import java.util.*;
import java.lang.*;
import java.io.*;
public class pedestial
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int h2=0,h1=0,h3=0;
            if(n%3==0){
                h1=(n/3)+1;
                h2=(n/3);
                h3=(n/3)-1;
            }
            if(n%3==1){
                h1=(n/3)+2;
                h2=(n/3);
                h3=(n/3)-1;
            }
            if(n%3==2){
                h1=(n/3)+2;
                h2=(n/3)+1;
                h3=(n/3)-1;
            }
            System.out.println(h2+" "+h1+" "+h3);
        }
    }
}