#include<stdio.h>
int main()
//Reverse of array
{
    int n ,i,a[50],temp;
    printf("Enter the  array size: ");
    scanf("%d",&n);
    printf("Enter the elements of array\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n/2;i++)
    {
        temp=a[i];
        a[i]=a[n-1-i];
        a[n-1-i]=temp;
    }
    printf("Reversed array:\n");
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);

    }
    return 0;
}