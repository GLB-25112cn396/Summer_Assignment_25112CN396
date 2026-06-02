#include<stdio.h>
int main()
{
    int n,i,a=0,b=1,nth_term=0;
    printf("Enter the number upto which series will bw printed: ");
    scanf("%d",&n);
    printf("The 1th term is :0\n");
    printf("The 2th term is :1\n");
    for(i=2;i<n;i++)
    {
       nth_term = a+b;
        a=b;
        b=nth_term;
        printf("The %dth term is %d\n",(i+1),nth_term);
    }
    return 0;
}