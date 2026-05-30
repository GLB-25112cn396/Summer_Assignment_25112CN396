#include<stdio.h>
int main()
{
    int n,r,temp=0,n1;
    printf("Enter the number:");
    scanf("%d",&n);
    n1 = n;
    while(n>0)
    {
        r=n%10;
        temp=temp*10+r;
        n=n/10;
    }
    if(temp==n1)
    {
        printf("Number is palindrome");
    }
    else{
        printf("Number is not palindrome");
    }
    return 0;

}