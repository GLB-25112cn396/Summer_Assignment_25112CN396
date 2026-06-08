#include<stdio.h>
#include<math.h>
char* Armstrong(int a);
int main()
{
int x;
char* temp;
printf("Enter the number");
scanf("%d",&x);
temp = Armstrong(x);
printf("%s",temp);
return 0;
}
//Function for Armstrong number
char* Armstrong(int a)
{
    int count = 0;
    int r, sum = 0;
    int n = a;
    while (a!= 0)
    {
        a = a/ 10;
        count++;
    }

    n = a;
    while (a > 0)
    {
        r = a % 10;
        sum = sum + pow(r, count);
        a = a / 10;
    }

    if (sum == n)
    {
        return "Armstrong";
    }
    else
    {
        return "Not Armstrong";
    }
}

  
  