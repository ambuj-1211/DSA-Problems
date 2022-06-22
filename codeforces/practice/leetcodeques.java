import java.util.*;
public class leetcodeques {
    
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                
            }
            
            
        }
        public int[] sortArrayByParityII(int[] nums) {
            int i=0,j=1;
            int n=nums.length;
            int t;
            while(i<n&&j<n){
                if(nums[i]+i%2==0)
                    i+=2;
                else if(nums[j]+j%2==0)
                    j+=2;
                else if(nums[i]+i%2==0 && nums[j]+j%2==0)
                {
                    t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
            }
            return nums;
        }
    }

