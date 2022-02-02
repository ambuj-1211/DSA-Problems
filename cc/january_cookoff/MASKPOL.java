import java.util.Scanner;

public class MASKPOL {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long t;
    t=sc.nextLong();
    int a,n;
    while(t-->0){
        n=sc.nextInt();
        a=sc.nextInt();
        int s=n-a;
        if(s>=a)
        System.out.println(a);
        else
        System.out.println();
    }
    }
}
