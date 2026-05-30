#include<stdio.h>
int main()
{
    int a,b,i,gcd=0;
    printf("Enter the numbers a and b:");
    scanf("%d%d",&a,&b);
    for(i=1;i<=b;i++)
    {
        if(a%i==0 && b%i==0)
        {
            gcd=i;
        }
     }
    printf(" The GCD of the number a and b is %d",gcd);
    return 0;
}