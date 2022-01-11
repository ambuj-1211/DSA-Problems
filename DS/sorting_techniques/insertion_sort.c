#include<stdio.h>
int main(){

    int i,t,j;
    // printf("Enter the no. of elements to be entered in the array : \n");

    // scanf("%d",&n);
    int arr[]={12,45,67,3,17,8,9,0,10,18,13,4,22,6,7,4,1};
    //initialization 
    // for (i=0;i<n;i++)
    // {
    //     scanf("%d",&arr[i]);
    // }
    
    for(i=1;i<17;i++)
    {
        int min=arr[i];//one element ko min maan lo
        j=i-1;
        while(j>=0&&arr[j]>min){//this is a main condition. 
            arr[j+1]=arr[j];//helps in sorting  if 
            j--;//take j to zero
        }
        arr[j+1]=min;//if the current i iteration is greater then the j iteration 
    }
    printf("the array is : \n");
    for(i=0;i<17;i++){
       
         printf("%d ",arr[i]);
    }
return 0;
}