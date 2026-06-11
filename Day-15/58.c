#include<stdio.h>
int main()
//Left rotation in array
{
    int n,i,k,j,a[50],temp;
    printf("Enter the array size");
    scanf("%d",&n);
    printf("Enter the array elements");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter the number for left rotation");
    scanf("%d",&k);
    k=k%n;  //K>n
    for(i=0;i<k;i++)
    {
        temp=a[0];
        for(j=0;j<n-1;j++)
        {
            a[j]=a[j+1];
        }
        a[n-1]=temp;
    }
    printf("Array after left rotation\n");
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
    return 0;
}