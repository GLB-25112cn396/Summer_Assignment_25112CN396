#include<stdio.h>
int main()
{
    int n,i,a[50],j;
    printf("Enter the array size\n");
    scanf("%d",&n);
    printf("Enter the array elements\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    //Duplicate element in array
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            {
                printf("%d is duplicate\n",a[i]);
                break;
            }
        }
    }
    return 0;
}

