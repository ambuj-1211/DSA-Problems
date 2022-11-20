public class countingpermutation {
    public static void main(String[] args){
    int ans = solutioncount("","abc");
    System.out.println("the permutations are "+ans);
    }

    static int solutioncount(String p, String up){
        if(up.isEmpty()){
           return 1;
        }
         char ch = up.charAt(0);
         int count = 0;
         for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            count = count+ solutioncount(f+ch+s,up.substring(1));
         }
         return count;
    }

}
