import java.util.Scanner;

class safm{
    public static void main(String[] args){
    int arr[][]=new int[5][5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("largest total is "+matrixScore(arr));
    }
    public static int matrixScore(int[][] A) {
            int i,j;
            int m=A[0].length;
            int n=A.length;
            for(i=0;i<n;i++){
                if(A[i][0]==0)
                fliprow(A,0);
            }
            for(i=1;i<A[0].length;i++){
                int total1=0;
                for(j=0;j<A.length;j++){
                    total1+=A[j][i];
                }
                if(total1*2<n){
                    flipcol(A,i);
                }
            }
            int totalsum=0;
            for(i=0;i<A.length;i++){
                for(j=0;j<A[0].length;j++){
                    totalsum+=A[i][j]*(1<<(m-j-1));
                }
            }
            return totalsum;
        }
        static void fliprow(int[][] nums,int r){
            for(int i=0;i<nums[0].length;i++){
                nums[r][i]=(nums[r][i]^1);
            }
        }
        static void flipcol(int[][] nums,int c){
            for(int i=0;i<nums.length;i++)
                nums[i][c]=(nums[i][c]^1);
        }
}