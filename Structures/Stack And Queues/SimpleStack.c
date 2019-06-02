#include<stdio.h>
int max=-1;
int f1=-1;
int f2=-1;
int stk1[20];
int stk2[20];
void insert(int k)
{
	if(f1<max-1)
	{
		f1=f1+1;
		stk1[f1]=k;
	}
}
int pop(int f1)
{
	return(stk1[f1+1]);
}
void transfer()
{
	if(f2<max-1)
	{
		f2=f2+1;
		f1=f1-1;
		stk2[f2]=pop(f1);
		transfer();
	}
}
void display()
{
	if(f2>-1)
	{
		printf("%d\n",stk2[f2]);
		f2=f2-1;
	}
}
int main()
{
	int i,j;
	scanf("%d",&max);
	for(i=0;i<max;i++)
	{
		int k;
		scanf("%d",&k);
		insert(k);
	}
	transfer();
   for(i=0;i<max;i++)
   {
   	 display();
    }	
}
