/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class gcd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    long n=sc.nextLong();
		    long c=0;
		    for(long i=0;i<=Math.sqrt(n);i++){
		        if(n%i==0){
		            if(n/i==i)
		            c++;
		            else
		            c+=2;
		        }
		    }
		    if(n%2==0)
		    System.out.println((c-1)*2-1);
		    else
		    System.out.println((c-1)*2);
		}
	}
}
