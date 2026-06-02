#include<stdio.h>
int main()
{
    int i,n,nth_term,a=0,b=1;
    printf("Enter the  nth number:");
    scanf("%d",&n);
    for(i=2;i<n;i++)
    {
        nth_term=a+b;
        a=b;
        b=nth_term;
    }
    printf("The %dth fibonacci term is %d\n",i,nth_term);
    return 0;
}
