#include<stdio.h>
#include<conio.h>
int sum(int n);
int main()
{
    int n,s;
    printf("Enter the number:");//Sum of digits using recursion
    scanf("%d",&n);
    s = sum(n);
    printf("The sum of digits of number is %d",s);
    return 0;
}
int sum(int n)
{
    if(n==0)
     return 0;
    else 
     return(n%10 + sum(n/10));
}