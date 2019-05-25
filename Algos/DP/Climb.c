//LeetCode Problem-70
#include<stdio.h>
int climbStairs(int n) 
{
if(n==0)
    return(0);
if(n==1)
    return(1);
else
{
int a[n];
    a[0]=1;
    a[1]=2;
    for(int i=2;i<n;i++)
    {
        a[i]=a[i-2]+a[i-1];
    }
    return(a[n-1]);
}
}
void main()
{
	printf("Enter the number of stairs\n");
	int num;
	scanf("%d",&num);
	int ans=climbStairs(num);
	printf("The number of ways:%d",ans);
}