import java.io.*;
import java.util.*;

public class goldmine {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int arr[][]= new int[n][m];
        for(int i =0;i< n;i++){
            for(int j =0; j<m;j++){
                arr[i][j] = sc.nextInt();
                
            }
        }
        
        int[][] dp = new int[n][m];
        for(int j=m-1;j>=0;j--){
            for(int i=0;i<n;i++){
                if(j == m-1){
                    dp[i][j] = arr[i][j];
                }
                    else if(i==0){
                        dp[i][j]=arr[i][j]+Math.max(arr[i][j+1],arr[i+1][j+1]);
                    }
                    else if(i==n-1){
                        dp[i][j] = arr[i][j]+Math.max(arr[i][j+1],arr[i-1][j+1]);
                    }
                    else{
                        dp[i][j] = arr[i][j]+Math.max(arr[i][j+1],Math.max(arr[i-1][j+1],arr[i+1][j+1]));
                    }
                }
            }
            int max = dp[0][0];
            
            for(int i =1;i<n;i++){
                if(dp[i][0]>max){
                    max = dp[i][0];
                }
            }
            System.out.println(max);
        }
}