#include <stdio.h>
int main()
//Maximum and minimum element in array
{
    int n, i, a[20], max, min;

    printf("Enter the array size\n");
    scanf("%d", &n);

    printf("Enter the array elements\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

        max = min = a[0];
        for (i = 1; i < n; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
            if (a[i] < min)
            {
                min = a[i];
            }
        }

        printf("max = %d\n", max);
        printf("min = %d\n", min);
        return 0;
    }
    
