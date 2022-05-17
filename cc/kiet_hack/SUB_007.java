import java.util.Scanner;

public class SUB_007 {
    public static void main(String[] args){
    int t;
    Scanner sc = new Scanner(System.in);
    t=sc.nextInt();
    String s;
    sc.nextLine();
    while(t-->0){
        s=sc.nextLine();
        int c0=0,ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')
            c0++;
            else if(s.charAt(i)=='7'){
                for(int j=1;j<c0;j++)
                ans=ans+j;
            }
        }
        System.out.println(ans);
        ans=0;
        c0=0;
    }
    }
}
