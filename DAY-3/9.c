#include<stdio.h>
int main()
{
    int n,i,count=0;
    printf("Enter the number:");
    scanf("%d",&n);
    i=1;
    while(n>=i)
    {
        if(n%i==0)
        {
        count=count+1;                          
        }
        i++;
    }
    if(count==2)
        {
           printf("Prime no.");
        }
    else
        {
          printf("Not prime");
        }  

    return 0;
}