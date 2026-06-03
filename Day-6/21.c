#include<stdio.h>
int main()
{
    int r,n,ans=0,pow=1;
    printf("Enter the decimal number:");//Decimal to binary
    scanf("%d",&n);
    while(n>0)
    {
        r = n%2;
        ans+=r*pow;
        n = n/2;
        pow = pow*10;        
        
    }
    printf("%d",ans);//Binary no. will be printed.
    return 0;

    
}