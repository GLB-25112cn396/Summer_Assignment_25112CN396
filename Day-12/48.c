#include<stdio.h>
int perfect(int n);
int main()
{
    int n;
    printf("Enter the number : ");
    scanf("%d",&n);
    perfect(n);
    return 0;
}
//Function for perfect number
int perfect(int n)
{
    int i,sum=0;
    for(i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
    }
        if(sum==n)
        {
            printf("Perfect");
        }
        else{
            printf("Not Perfect");
        }
    
}