#include<stdio.h>
int main(){
    int n,i,t,j;
    printf("Enter the no. of elements to be entered in the array : ");

    scanf("%d",&n);
    int arr[n];
    for (i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }

    for(i=0;i<n-1;i++){
        for (j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
    } 
    printf("The sorted array is : ");
    for(i=0;i<n;i++){
        if(i!=n-1)
        printf("%d ,",arr[i]);
        else
         printf("%d ",arr[i]);
    }
    return 0;
}