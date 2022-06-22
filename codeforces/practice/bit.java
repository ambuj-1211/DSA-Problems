import java.util.*;
import java.lang.*;
import java.io.*;
public class bit
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Vector<String> v= new Vector<>(n);
        int ans =0;
        // int nc=n;
        String a;
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            a=sc.nextLine();
            v.add(a);
            
            if(v.get(i).charAt(0)=='+'||v.get(i).charAt(1)=='+'){
                ans=ans+1;
            }
            else if(v.get(i).charAt(0)=='-'||v.get(i).charAt(1)=='-'){
                ans=ans-1;
            }
        }
        System.out.println(ans);
    
    }
}