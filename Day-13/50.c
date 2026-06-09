#include <stdio.h>
int main()
//Sum and average of elements of array
{
    int n, i, a[50], sum = 0;
    float avg;

    printf("Enter the array size\n");
    scanf("%d", &n);

    printf("Enter the array elements\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
        sum += a[i];
    }

    avg = sum / n;

    printf("Sum = %d\n", sum);
    printf("Average = %f\n", avg);

    return 0;
}