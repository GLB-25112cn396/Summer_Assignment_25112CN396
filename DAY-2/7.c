#include<stdio.h>
int main()
{
    int n,r,prd=1;
    printf("Enter the nuber:");
    scanf("%d",&n);
    while(n>0)
    {
        r = n%10;
        prd = prd*r;
        n = n/10;
    }
    printf("The product of the digits is %d",prd);
    return 0;

}