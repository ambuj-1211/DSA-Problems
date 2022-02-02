import java.util.Scanner;

public class wierdalgo {
    public static void main(String[] args){
    long n;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    System.out.print(n+" ");
    while(n!=1){
        if(n%2==0)
        n=n/2;
        else 
        n=n*3+1;
        System.out.print(n+" ");
    }
    }
}
