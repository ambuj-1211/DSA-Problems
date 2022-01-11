import java.util.*;
class twosome{
    public static void main(String[] args){
    Solution s= new Solution();
        int a[] = new int[]{12,1,32,3,6,7};
            int a2[] = s.twoSum(a,4 );
            for(int i:a2)
            System.out.println(i);

    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
    TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int compl=target-nums[i];
            if(map.containsKey(compl))
                return new int[]{map.get(compl),i};
            else
                map.put(nums[i],i);
        }
        return new int[]{}; 
       }
    }