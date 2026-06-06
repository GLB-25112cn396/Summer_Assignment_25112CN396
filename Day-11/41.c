#include<stdio.h>
int sum(int a,int b);
int main()

{
    int num_1,num_2,total=0;
    printf("Enter the two numbers\n");
    scanf("%d%d",&num_1,&num_2);
    total = sum(num_1,num_2);
    printf("The sum of two numbers is %d",total);
    return 0;
}
//Function to find sum of two numbers  
int sum(int a,int b)
{
    return a+b;
}