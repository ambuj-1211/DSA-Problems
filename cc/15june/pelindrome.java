/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pelindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    String s="";
		    for(int i=0;i<n;i++)
		    s+='a';
		    StringBuilder st=new StringBuilder(s);
			x=x-1;
			if((n+1)/2<=x)
			System.out.println(-1);
			int k=(n+1)/2;
			char ch='b';
		    while(k<n){
				st.setCharAt(k,ch);
				st.setCharAt(n-k-1,ch);
				ch++;
				k++;
			}
			System.out.println(st);
		}
	}
}
