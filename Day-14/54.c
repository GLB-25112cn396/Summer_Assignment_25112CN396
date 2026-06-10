#include <stdio.h>

int main()
{
    int i, n, a[50], count = 0, item;

    printf("Enter the array size\n");
    scanf("%d", &n);

    printf("Enter the array elements\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    printf("Enter the item to be counted\n");
    scanf("%d", &item);
    //Frequency of the element

    for (i = 0; i < n; i++)
    {
        if (a[i] == item)
        {
            count++;
        }
    }

    if (count == 0)
    {
        printf("%d is not in the array\n", item);
    }
    else
    {
        printf("%d is present %d time(s)\n", item, count);
    }

    return 0;
}
