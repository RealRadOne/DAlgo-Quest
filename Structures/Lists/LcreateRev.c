#include<stdio.h>
#include<malloc.h>
struct node
{
	int data;
	struct node *next;
};
struct node *head=NULL;
void insert(int data)
{
	struct node *link=(struct node*)malloc(sizeof(struct node));
	link->data=data;
	if(head==NULL)
	{
		link->next=head;
		
		head=link;
	}
	else
	{
		struct node *ptr=head;
		while(ptr->next!=NULL)
		{ptr=ptr->next;}
		link->next=ptr->next;
		ptr->next=link;
	}
}
void rev(int n,int k)
{
	int i,j;
	struct node *ptr=head;
    for(i=0;i<n/k;i++)
    {
    	struct node *kpr=ptr; 
    	int a[k];
    	for(j=0;j<k;j++)
    	{
    		a[k-j-1]=ptr->data;
    		ptr=ptr->next;
		}
		for(j=0;j<k;j++)
		{
			kpr->data=a[j];
			kpr=kpr->next;
		}
	}
	int a[n%k];
	struct node *kpr=ptr;
	for(i=0;i<n%k;i++)
	{
		a[n%k-i-1]=ptr->data;
		ptr=ptr->next;
	}
	for(i=0;i<n%k;i++)
	{
		kpr->data=a[i];
		kpr=kpr->next;
	}
}
void display()
{
	struct node *ptr=head;
	while(ptr!=NULL)
	{
		printf("%d ",ptr->data);
		ptr=ptr->next;
	}
}
int main()
{
	int n,k,i;
	printf("Enter the number of nodes and the number by which reversal is to be done:");
	scanf("%d%d",&n,&k);
	for(i=0;i<n;i++)
	{
		int p;
		printf("Enter the data");
		scanf("%d",&p);
		insert(p);
	}
	display();
	rev(n,k);
	printf("\n");
	display();
}
