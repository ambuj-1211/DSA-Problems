import java.util.*;
import java.lang.*;
import java.io.*;
public class beautiful
{
    public static void main (String[] args) throws java.lang.Exception
    {
        
        Scanner sc = new Scanner(System.in);
        int a;
        int k=0,l=0;
        int[][] arr=new int[5][5];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++){
                a=sc.nextInt();
                arr[i][j]=a;
                if(arr[i][j]==1)
                {
                    k=i;
                    l=j;
                }
            }
        }
        int ans=Math.abs(k-2)+Math.abs(l-2);
        System.out.println(ans);
    }
}