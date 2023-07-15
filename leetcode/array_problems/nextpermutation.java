public class nextpermutation {
    public void nextPermutation(int[] A) {
        if(A == null || A.length<=1)
        return;
        int i=A.length-2;
        while(i>=0 && A[i]>=A[i+1])
        i--;
        if(i==-1){
            reverse(A,0,A.length-1);
            return;
        }
        
        reverse(A,i+1,A.length-1);
        for(int j=i+1;j<A.length;j++){
            if(A[j]>A[i]){
                swap(A,i,j);
                break;
            }
        }
    }
    void swap(int[] A, int i , int j){
        int t=A[i];
        A[i]=A[j];
        A[j]=t;
        return;
    }
    void reverse(int[] A, int i, int j){
        while(i<j){
            swap(A,i,j);
            i++;
            j--;
        }
        return;
    }
}