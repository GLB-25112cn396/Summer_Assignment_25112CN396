#include<stdio.h>
int main()
{
    int i,n;
    printf("Enter the number ");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            printf("%d\n",i);//factors of 6 will be printed
        }
    }
    return 0;
}