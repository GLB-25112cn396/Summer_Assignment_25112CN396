#include <stdio.h>
int fibo(int n);
int main()
{
    int n;
    printf("Enter number of terms: ");
    scanf("%d", &n);
    fibo(n);
    return 0;
}
//Function for fibonacci series
int fibo(int n)
{
    int i,a=0,b=1,nth_term;
    for(i=1;i<=n;i++)
    {
        if(i==1)
        {
        printf("%d\n",a);
        }
        else if(i==2)
        {
        printf("%d\n",b);
        }
        else
        {
        nth_term = a+b;
        printf("%d\n",nth_term);
        a=b;
        b=nth_term;
        }

    }
    printf("\n");
}