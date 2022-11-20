import java.util.ArrayList;

public class permutation {
    public static void main(String[] args){
        ArrayList<String> ans = new ArrayList<>();
        ans = solution("","abc");
        System.out.println(ans);
    }

    static ArrayList<String> solution(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        } 
        ArrayList<String> ans = new ArrayList<>();
         char ch = up.charAt(0);
         for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            ArrayList<String> lis = solution(f+ch+s,up.substring(1));
            ans.addAll(lis);
         }
         return ans;
    }

}
