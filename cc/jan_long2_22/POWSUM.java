/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class POWSUM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t;
		t=sc.nextInt();
		Vector<Long> v=new Vector<>();
		int n;
		while(t-->0){
		    
		    long s=0;
		    n=sc.nextInt();
		    for(int i=0;i<n;i++){
		        v.add(sc.nextLong());
				s=s+v.get(i);
		    }
		    Vector<Long> v2= new Vector<>(v);
		    Collections.sort(v2);
		    long smallest=v2.get(0);
		    long s2=0;
			Vector<Long> v3=new Vector<>();
		    for(int i=0;i<n;i++){
		        v3.add(v2.get(i)/smallest);
		        s2=s2+v3.get(i);
		        
		    }
		    long digit=(int)(Math.log((int)s2)/Math.log(2));
		    long x=(1<<(digit+1))-s2+1;
		    int index=0;
		    for(int i=0;i<n;i++){
		        if(v.get(i)==smallest){
		            index=i+1;
		            break;
		        }
		    }
		    if((s&(s-1))==0)
		    System.out.println(0);
		    else
		    {
		        System.out.println(1);
		        System.out.println(1+" "+x);
		        System.out.println(index);
		    }
		    v.clear();
		    v2.clear();
			v3.clear();
		}
	}
}
