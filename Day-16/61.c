#include<stdio.h>
int main()
//Missing Number in an array
{
    int n,i,sum=0,expected,missing;
    printf("Enter the array size ");
    scanf("%d",&n);
    int a[n-1];
    printf("Enter the array elements\n");
    for(i=0;i<n-1;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n-1;i++)
    {
        sum+=a[i];
    }
    expected=n*(n+1)/2;
    missing=expected-sum;
    printf("Missing no. = %d",missing);
    return 0;
}