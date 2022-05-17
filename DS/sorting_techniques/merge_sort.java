

public class merge_sort {
    
    int[] arr=new int[20];
    void merge(int arr[],int l,int m, int u){
        int n1=m-l+1;
        int n2=u-m-1;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++)
        left[i]=this.arr[l+i];
        for(int i=0;i<n2;i++)
        right[i]=arr[i+l];
        int i=0,j=0;
        int k=l;
        while(i<n1&&j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else if(left[i]>right[j]){
                arr[k]=right[j];
                j++;
                k++;

            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            k++;
            j++;
        }
        }
        void sort(int[] arr,int l,int u){
            if(l<u){
                int m=(l+u)/2;
                sort(arr,l,m);
                sort(arr,m+1,u);
                merge(arr,l,m,u);
            }
        }
        // static void display(int[] a){
        //    int l=a.length;


        // }
        public static void main(String [] args){
            int arr[]=new int[]{23,33,1,2,3};
            merge_sort ms=new merge_sort();
            // System.out.println("unsorted array");
            ms.sort(arr,0,arr.length-1);
            System.out.println("sorted array");
            System.out.println(arr);
            
            
        }
}