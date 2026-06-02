#include<stdio.h>
#include<math.h>
int main()
{
    int a,b,i,n,count,Arm,temp,digit;
    printf("Enter the start of the range:\n");
    scanf("%d",&a);
    printf("Enter the end of the range:\n");
    scanf("%d",&b);
    int found=0;
    if(a>b)
    {
        int swap=a;
        a=b;
        b=swap;
    }
    printf("Armstrong number between %d and %d:\n", a, b);
    for(n=a;n<=b;n++)
    {
        temp=n;
        count=0;
        Arm=0;
        if(temp<0)
        {
            continue;
        }
        while(temp!=0)
        {
            temp /= 10;
            count++;
        }
        if(count==0)
        {
            count=1;
        }
        temp=n;
        while(temp>0)
        {
            digit = temp % 10;
            Arm += pow(digit,count);
            temp /= 10;
        }
        if(Arm==n)
        {
            printf("%d ", n);
            found=1;
        }
    }
    if(!found)
    {
        printf("No Armstrong number found");
    }
    return 0;
    
}