#include<stdio.h>
char* prime(int a);
int main()
{
    int x ;
    char *temp;
    printf("Enter the number\n");
    scanf("%d",&x);
    temp = prime(x);
    printf("%s",temp);
    return 0;
}
//Function to check the  no. is prime
char* prime(int a)
{
     int i,count=0;
    for(i=1;i<a;i++)
    {
     if(a%i==0)
     {
        count++;
     }
    }
    if(count==1)
    {
         char *p="prime";
      return p; 
    }
    else
    {
         char *b="not prime";
      return b;
    }
    
}