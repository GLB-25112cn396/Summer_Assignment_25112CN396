#include<stdio.h>
#include<math.h>
int main()
{
    int a,n,count=0,Arm=0,temp;
    printf("Enter the number:\n");
    scanf("%d",&a);
    n=a;
    while(n!=0)
    {
        n=n/10;
        count++;
    }
    n=a;
    while(n>0)
    {
        temp=n%10;
        Arm+=pow(temp,count);
        n=n/10;
    }
    if(Arm==a)
    {
     printf("Number is Armstrong");
    }
    else
    {
        printf("Number is not Armstrong");
    }
    return 0;
}