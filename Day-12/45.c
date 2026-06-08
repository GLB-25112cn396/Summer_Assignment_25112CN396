#include<stdio.h>
char* palindrome(int a);
int main()
{
    int x;
    char* temp;
    printf("Enter the number\n");
    scanf("%d", &x);
    temp = palindrome(x);
    printf("%s\n", temp);
    return 0;
}
char* palindrome(int a)
//Function for palindrome number
{
    int original = a;
    int r;
    int sum = 0;
    while (a > 0)
    {
        r = a % 10;
        sum = sum * 10 + r;
        a = a / 10;
    }
    if (sum == original)
    {
        return "palindrome";
    }
    else
    {
        return "Not palindrome";
    }
}