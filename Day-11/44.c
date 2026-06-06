#include<stdio.h>
int factorial(int m);
int main()
{
    int n,fact;
    printf("Enter the number\n");
    scanf("%d",&n);
    fact=factorial(n);
    printf("The factorial of the number = %d",fact);
    return 0;
}
//Function for factorial of a number

    int factorial(int m)
    {
        int i,f=1;
        for(i=1;i<=m;i++)
        {
            f=f*i;
        }
        return f;
    }

