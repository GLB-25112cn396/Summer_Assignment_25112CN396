#include <stdio.h>
int main()
//Counting even and odd elements
{
    int n, i, a[50];
    int evncount = 0, oddcount = 0;

    printf("Enter the array size\n");
    scanf("%d", &n);

    if (n <= 0 || n > 50)
    {
        printf("Invalid array size\n");
        return 1;
    }

    printf("Enter the elements of array\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    for (i = 0; i < n; i++)
    {
        if (a[i] % 2 == 0)
        {
            evncount++;
        }
        else
        {
            oddcount++;
        }
    }

    printf("Odd count = %d\n", oddcount);
    printf("Even count = %d\n", evncount);

    return 0;
}