#include <stdio.h>
int main(void)
{
    int n, item, a[50], i, found = 0;

    printf("Enter the array size\n");
    scanf("%d", &n);

    printf("Enter the array elements\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    printf("Enter the item to be searched ");
    scanf("%d", &item);

    // Linear search
    for (i = 0; i < n; i++)
    {
        if (a[i] == item)
        {
            printf("%d is the item  at index = %d\n  and at location = %d\n", item,i, i + 1);
            found = 1;
            break;
        }
    }

    if (!found)
    {
        printf("Element not found\n");
    }

    return 0;
}