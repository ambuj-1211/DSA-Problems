#include <stdio.h>
int partition(int arr[], int l, int h)
{
    int pivot = arr[l];
    int i = l;
    int j = h;
    int t;
    while (i < j)
    {
        while (arr[i] <= pivot)
            i++;
        while (arr[j] > pivot)
            j--;
        if (i < j)
        {
            t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
    if (j <= i)
    {
        t = arr[l];
        arr[l] = arr[j];
        arr[j] = t;
    }
    return j;
}
void quicksort(int arr[], int l, int h)
{
    if (l < h)
    {
        int pivot = partition(arr, l, h);
        quicksort(arr, l, pivot - 1);
        quicksort(arr, pivot + 1, h);
    }
}
int main()
{
    int arr[6];
    printf("enter array elements \n");

    for (int i = 0; i < 6; i++)
    {
        scanf("%d", &arr[i]);
    }
    quicksort(arr, 0, 5);
    printf("The sorted array is :-\n");
    for (int i = 0; i < 6; i++)
        printf("%d ", arr[i]);
    return 0;
}