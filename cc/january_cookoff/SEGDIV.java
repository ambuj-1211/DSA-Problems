import java.util.Scanner;
import java.util.Vector;

public class SEGDIV {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    int n;
    Vector<Integer> a= new Vector<>();
    while(t-->0){
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        for(int i=2;i<=n;i++){
            for(int j=0;j<n;j++){
                for(int k=j;k<j+i;k++){
                    
                }
            }
        }
    }
    }
}
