#include<stdio.h>
int fmax(int a,int b);
int main()

{
    int x,y,temp=0;
    printf("Enter the two numbers\n");
    scanf("%d%d",&x,&y);
    temp = fmax(x,y);
    printf("The Maximum of two numbers is %d",temp);
    return 0;
}
//Function to find the maximum 
int fmax(int a,int b)
{
    if(a>b)
    return a;
    else
    return b;
}