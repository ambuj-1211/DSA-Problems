import java.util.*;

class subset{
    public static void main(String[] args){
    String p = "";
    String s = "abc";
    ArrayList<String> lis = subseq(p, s);
    System.out.println(lis);
    }
    static void solution(String p, String up){
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        solution(p,up.substring(1));
        solution(p+up.charAt(0),up.substring(1));
        
    }

    static ArrayList<String> subseq(String p,  String u){
        if(u.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> left= subseq(p+u.charAt(0),u.substring(1));
        ArrayList<String> right = subseq(p,u.substring(1));
        left.addAll(right);
        return left;
    } 
    // For ascii we can just need to do this ch+0 this will give us the ascii value of the character ch.

    static ArrayList<String> sol(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for(int i: arr){
            
        }
    } 
}