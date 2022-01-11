#include <stdio.h>

void merge(int arr[], int l, int m, int r)
{
    int i, j, k;
    
}

void mergesort(int arr[], int l, int r)
{
    if (l < r)
    {
        int m = (l + r - 1) / 2;
        mergesort(arr, l, m);
        mergesort(arr, m + 1, r);
        merge(arr, l, m, r);
    }
}
int main()
{

    return 0;
}