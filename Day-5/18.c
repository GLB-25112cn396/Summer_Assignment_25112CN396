#include<stdio.h>
int main()
{
    int a,r,i,n,sum=0,fact=1;
    printf("Enter the number\n");//Enter for checking strong number.
    scanf("%d",&a);
    n=a;
    while(n>0)
    {
         r = n%10;
        for(i=1;i<=r;i++)
        {
            fact = fact*i;//factorial will be calculated.
        }
        sum = sum + fact;//Sum of factorial of all digits of number entered.
        n=n/10;
        fact=1;
    }
    if(sum==a)//If sum is equal to the number entered then it is strong number.
    {
        printf("It is a strong number");
    }
    else
    {
        printf("It  is not a strong number");
    }
    return 0;
}