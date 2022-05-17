import java.math.BigInteger;
import java.util.*;

class newfile {
    public static void main(String [] args) {

        
        int[] deck=new int[]{1,1,1,1,1,1,2,2,2,1,1,1,4,4,4,3,3,3,3,3,3,3,3,3};
        boolean ans=isxofakind(deck);
        if(ans)
        System.out.println("it is x of kind");
        else 
        System.out.println("is not x of a kind");
        
    }
    public static boolean isxofakind(int[] deck){
        int res=0;
        HashMap<Integer,Integer> mp=new HashMap<>();          
        for(int i:deck) mp.put(i,mp.getOrDefault(i, 0)+1);
        for(int i:mp.values()) res=gcd(i,res);
        return res>1;
    }
    static int gcd(int a, int b){
        if(b==0)
        return a;
        else 
        return gcd(b,a%b);
    }
}