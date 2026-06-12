#include<stdio.h>
int main()
//Pairs with given sum
{
    int n,i,j,a[50],sum=0;
    printf("Enter the array size ");
    scanf("%d",&n);
    printf("Enter the array elements");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter the sum ");
    scanf("%d",&sum);
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]+a[j]==sum)
            {
                printf("(%d,%d)\n",a[i],a[j]);
            }
        }
    }
    return 0;
}