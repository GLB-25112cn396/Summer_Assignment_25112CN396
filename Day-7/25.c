#include<stdio.h>
int fact(int m);
int main()
{
 int n,f;
    printf("Enter the term:");//Factorial of number using recursion
    scanf("%d",&n);
    f=fact(n);
    printf(" Factorial is = %d",f);
    return 0;
}
               
int fact(int m)
{
    if(m==0)
     return 1;
    else 
     return(m*fact(m-1));
}
