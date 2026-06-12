#include<stdio.h>
int main()
//Maximum frequency element 
{
    int i,j,a[50],n;
    printf("Enter the array size ");
    scanf("%d",&n);
    printf("Enter the array elements\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int maxfreq=0,maxelement;
    for(i=0;i<n;i++)
    {
        int count=1;
        for(j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            count++;
        }
        if(count>maxfreq)
        {
          maxfreq=count;
          maxelement=a[i];
        }

    }
    printf("Maximum frequency element = %d\n",maxelement);
    printf("Frequency is = %d\n",maxfreq);
}