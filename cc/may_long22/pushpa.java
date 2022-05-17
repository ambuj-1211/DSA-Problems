import java.util.*;
class pushpa{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t,n;
    t=sc.nextInt();
    while(t-->0){
        n=sc.nextInt();
        int[] h=new int[n];
        for(int i=0;i<n;i++)
        h[i]=sc.nextInt();
        HashMap<Integer,Integer> mp = new HashMap<>();
        int max=-1;
        for(int i:h){
            if(i>max)
            max=i;

        if(mp.containsKey(i))
        mp.put(i,mp.get(i)+1);
        else
        mp.put(i,1);
        }
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(max<(entry.getKey()+entry.getValue()-1))
                max=(entry.getKey()+entry.getValue()-1);
        }
        System.out.println(max);

    }
    }
}