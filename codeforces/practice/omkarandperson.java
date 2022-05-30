import java.util.*;

class omkarandperson{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int i=0;
            Vector<Integer> v = new Vector<>();
            Set<Integer> s= new HashSet<Integer>();
            for(i=0;i<n;i++){
                v.add(sc.nextInt());
                s.add(v.get(i));
            }
            if(s.size()>1)
            System.out.println(1);
            else
            System.out.println(n);
            // first start from i=0 and then go till n
            // check i!=i+1 then add both store in i then remove i+1
            // else 
        }

    }
}