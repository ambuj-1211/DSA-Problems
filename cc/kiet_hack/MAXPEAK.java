import java.util.*;

class MAXPEAK
{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t;
    t=sc.nextInt();
    int n;
    Vector<Integer> v=new Vector<>();
    while(t-->0){
        n=sc.nextInt();
        for(int j=0;j<n;j++){
            v.add(sc.nextInt());
        }
        Vector<Integer> maxlength =new Vector<>();

        int c1=0;
        for(int i =0;i<v.size();i++){
            if(v.get(i)<v.get(i+1)){
                c1++;
            }
            else if(v.get(i)>v.get(i+1))
            {
                c1++;
            }
            else if(c1!=0 && v.get(i)<v.get(i+1)&&i!=v.size()){
                maxlength.add(c1);
                c1=0;
            }
            else if(i==v.size()){
                maxlength.add(c1);
            }
        }
        int ans =Collections.max(maxlength);
        System.out.println(ans);
        v.clear();
        maxlength.clear();
    }
    }
}