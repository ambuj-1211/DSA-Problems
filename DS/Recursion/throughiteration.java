import java.util.*;

class throughiteration{
    public static void main(String[] args){
        int arr[] = {1,2,2,5,5};
        List<List<Integer>> l = iter2(arr);
        System.out.println("The subsequence is : ");
        System.out.println(l);

    }

    static List<List<Integer>> iter(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());

        for(int i: arr){
            int n = ans.size();
            for(int j=0; j<n ;j++){
                List<Integer> lis = new ArrayList<>(ans.get(j));
                lis.add(i);
                ans.add(lis);
            }
        }
        return ans;
    } 
// How to create empty list or vector in java - just by making new ArrayList<>(); this will create empty array list.

static List<List<Integer>> iter2(int[] arr){
    List<List<Integer>> ans = new ArrayList<>();
    ans.add(new ArrayList<>());
    int start = 0, end = 0;
    for(int i=0;i<arr.length;i++){
        start = 0;
        if(i>0 && arr[i]!=arr[i-1]){
            start = end+1;
        }
        end = ans.size()-1;

        // int n = ans.size();

        for(int j=start; j<=end ;j++){
            List<Integer> lis = new ArrayList<>(ans.get(j));
            lis.add(arr[i]);
            ans.add(lis);
        }
    }
    return ans;
} 
// The complexity of this probem is N*2^n
}