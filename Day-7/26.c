#include<stdio.h>
int fibo(int n);
int main(void)
{
    int n, i;
    printf("Enter the no. of terms: "); // Fibo series using recursion
    scanf("%d", &n);
    for(i = 0; i < n; i++)
    {
        printf("%d\t", fibo(i));
    }
    return 0;
}
int fibo(int n)
{
    if(n == 0)
        return 0;
    else if(n == 1)
        return 1;
    else
        return fibo(n - 1) + fibo(n - 2);
}