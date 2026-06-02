#include<stdio.h>
int main()
{
    int n,sum=0,i;
    printf("Enter the number:");
    scanf("%d",&n);
     for(i=1;i<n;i++)
    {
    if(n%i==0)//Factors are calculated except number itself.
    {
        sum =sum+i;//Sum of factors is calculated.
    }
}
if(sum==n)//If sum is equal to the number then it is perfect.
{
    printf("It is a Perfect number");
}
else{
    printf("It is not a Perfect number");
}
return 0;
}
