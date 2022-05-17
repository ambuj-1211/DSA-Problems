

import java.util.*;

public class prof{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int n;
        
        while(t-->0){
            n=sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            if (n==1){
                System.out.println("YES");
                return;
            }
            int j=0,k=1;
            while(j<a.length && k<a.length){
                if(a[j]<0)
                j++;
                else if(a[k]>=0)
                k++;
                else if(a[j]>=0&&a[k]<0){
                    a[j]=a[j]*-1;
                    a[k]=a[k]*-1;
                }
            }
            issort(a);
        }
    }
    static void issort(int[] a){
        for(int c=1;c<a.length;c++){
            if(a[c]<a[c-1])
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        return;
    }
}