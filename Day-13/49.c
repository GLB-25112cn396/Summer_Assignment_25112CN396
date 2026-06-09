#include<stdio.h>
int main()
//Input and Display the array elements
{
    int n,a[20],i;
    printf("Enter size of array\n");
    scanf("%d",&n);
    printf("Enter the array elements\n");
    for(i=1;i<=n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=1;i<=n;i++)
    {
        printf("%d ",a[i]);
    }
    return 0;
}