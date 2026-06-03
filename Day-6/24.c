#include<stdio.h>
int main()
{
    int i,x,n,count=1;
    printf("Enter the Base:");
    scanf("%d",&x);
    printf("Enter the exponent:");//Get input from the user
    scanf("%d",&n);
    for(i=1;i<=n;i++)               
    {
        count=count*x;//calculating x to the power n without pow().
        
    }
    printf("The required answer will be:%d\n",count);
    return 0;
}