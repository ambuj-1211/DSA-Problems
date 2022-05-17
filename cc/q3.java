/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class q3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0){
		    int n,x;
		    n=sc.nextInt();
		    x=sc.nextInt();
		    int[] h = new int[n];
		    int totalhealth=0;
		    for(int i=0;i<n;i++){
		        h[i]=sc.nextInt();
		        totalhealth+=h[i];
		    }
		    int c=0;

		    while(c<n){
                c=0;
                for(int i=0;i<h.length;i++)
                if(h[i]==0)
                c++;

            }
 		}
	}
}
