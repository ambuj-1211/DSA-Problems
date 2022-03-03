/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class dist
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int d=sc.nextInt();
		if(d%2==0){
		    System.out.println(0+","+0);
		    System.out.println(d+","+0);
		    System.out.println(d/2+","+d/2);
		    System.out.println(-(d/2)+","+(-(d)/2));
		}
		else 
		System.out.println(-1);
	}
}
