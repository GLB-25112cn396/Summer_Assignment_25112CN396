#include<stdio.h>
#include<conio.h>
int rev(int n,int acc);
int main()
{
   int n,r;
   printf("Enter the number:");//Reverse of number using recursion
   scanf("%d",&n);
   r = rev(n,0);
   printf("The reverse of the number is: %d",r);
   return 0;
}
int rev(int n,int acc)
{
    if(n==0)
        return acc;
    else
        return rev(n/10,acc*10 + n%10);
}

