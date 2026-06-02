#include<stdio.h>
int main()
{
    int j, i,n,count=0,lrg;
    printf("Enter the number ");//largest prime factors
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        if(n%i==0)//Condition for the factors of n.
        {
            for(j=2;j<i;j++)    //Checking if i is prime.
            {
                if(i%j==0)
                {
                    count++;  
                }
            }
            if(count==0)    //If i is prime lrg stores the largest such i.
                {
                    lrg=i; 
                }
            }
            count =0;   
    }
    printf("%d",lrg);    //Large prime factor will be printed.
    return 0;
 }