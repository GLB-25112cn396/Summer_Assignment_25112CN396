#include<stdio.h>
int main()
//Moving zeros to end
{
    int n,i,j=0,a[50],temp;
    printf("Enter the array size: ");
    scanf("%d",&n);
    printf("Enter the array elements ");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        if(a[i]!=0)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j++;
        }
    }
    printf("The array after moving zeros to end\n");
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
    return 0;

}