/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class q1
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int t;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        sc.nextLine();
        while((t--)>0){
            String a;
            a=sc.nextLine();
            
            String s1;
            s1=sc.nextLine();
            
            if(s1.charAt(0)==a.charAt(0))
            System.out.println(a.charAt(0));
            else if(s1.charAt(2)==a.charAt(0))
            System.out.println(s1.charAt(2));
            else if(s1.charAt(0)==a.charAt(2)&&(s1.charAt(2)==a.charAt(4)))
            System.out.println(s1.charAt(0));
            else if(s1.charAt(2)==a.charAt(2) && s1.charAt(0)==a.charAt(4))
            System.out.println(s1.charAt(2));
        }
	}
}
