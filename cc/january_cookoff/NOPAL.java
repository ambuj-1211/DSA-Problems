import java.util.*;
public class NOPAL{
    public static void main(String[] args){
    int t;
    Scanner sc = new Scanner(System.in);
    t=sc.nextInt();
    StringBuilder s;
    int n;
    while(t-->0){
        n=sc.nextInt();
        s=new StringBuilder("");
        char c='a';
        for(int i=1;i<=n;i++){
            s.append(c);
            c++;
            if(i%26==0)
            c='a';
        }
        System.out.println(s);
    }
    }
}