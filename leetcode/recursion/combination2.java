import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class combination2 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println("The output: "+combinationSum2(candidates,target));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(candidates);
    combination(0,target,candidates,res,new ArrayList<>());
    return res;
}
static void combination(int ind, int target, int[] can, List<List<Integer>> ans, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind; i<can.length; i++){
            // think of waht you want to avoid
            if(can[i]>target) break;
            if(i>ind && can[i]==can[i-1]) continue;
            // take if it is not avoided in first
            ds.add(can[i]);
            // call the recursion so that it can start from this stage
            combination(i+1, target-can[i],can,ans,ds);
            // backtrack the recursion so that the ds gets cleaned for the next input
            ds.remove(ds.size()-1);
        }
    }
}