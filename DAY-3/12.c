#include<stdio.h>
int main()
{
    int m,n,x;
    printf("Enter the numbers m and n :");
    scanf("%d%d",&m,&n);
    x=m*n;
    if(m>=n)
    {
        if(m%n==0)
        {
            printf("%d",m);
        }
        else
        {
           
            printf("%d",x);
        }
    }
    else
    {
        if(n%m==0)
        {
            printf("%d",n);
        }
        else 
        {
            printf("%d",x);
        }
        
            
        
    }
    return 0;
}