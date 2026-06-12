#include <stdio.h>

int main()
//Array after removing duplicates
{
    int n, i, j, a[50], flag;
    printf("Enter the array size ");
    scanf("%d", &n); 
    printf("Enter the array elements\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    printf("Array after removing duplicates:\n");
    for (i = 0; i < n; i++) {
        flag = 0;
        for (j = 0; j < i; j++) {
            if (a[i] == a[j]) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            printf("%d ", a[i]);
        }
    }
    printf("\n");

    return 0;
}