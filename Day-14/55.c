#include<stdio.h>
int main()
{
    int n,i,j,a[50],swap;
    printf("Enter the array size");
    scanf("%d",&n);
    printf("Enter the array elements\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    //Second largest element using Bubble sorting
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(a[j]>a[j+1])
            {
                swap = a[j];
                a[j] = a[j+1];
                a[j+1] = swap;
            }
        }

    }
    printf("Seconf largest = %d",a[n-2]);
    return 0;
}