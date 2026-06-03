#include<stdio.h>
int main ()
{
    int n,r,ans=0,pow=1;
    printf("Enter the binary number:");//Binary to decimal
    scanf("%d",&n);
    while(n>0)
    {
        r =n%10;
        ans+=r*pow;
        n = n/10;
        pow = pow*2;
    }
    printf("%d",ans);//Decimal no, will be printed.
    return 0;
}