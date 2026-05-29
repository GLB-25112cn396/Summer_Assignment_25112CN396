#include<stdio.h>
int main()
{
    int i, n, a, b, count;
    printf("Enter the range (2 numbers): ");
    scanf("%d%d", &a, &b);
    
    printf("Prime numbers between %d and %d are:\n", a, b);
    for(n = a; n <= b; n++)
    {
         count = 0;
        
        for(i = 1; i<=n; i++)
        {
            if(n % i == 0)
                count++;
        }
        
        if(count == 2)
        {
            printf("%d ", n);
        }
    }
    
    
    return 0;
}