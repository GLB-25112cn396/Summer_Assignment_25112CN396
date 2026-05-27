
#include<stdio.h>

int main()
{
    int i, n, temp;

    printf("Enter the number: ");
    scanf("%d", &n);

    for(i = 1; i <= 10; i++)
    {
        temp = n * i;

        printf("%d x %d = %d\n", n, i, temp);
        
    }

    return 0;
}