#include<stdio.h>
#include<malloc.h>
# define size 11
struct node
{
	int data;
	struct node *next;
};
struct node *heads[size];
void hashfunct()
{
	int data;
	scanf("%d",&data);
	int i=data%11;
	struct node *ptr=(struct node*)malloc(sizeof(struct node));
	ptr->data=data;
	ptr->next=heads[i];
	heads[i]=ptr;
}
void display()
{
	int i;
	for(i=0;i<11;i++)
	{
	struct node *ptr=heads[i];
	while(ptr!=NULL)
	{printf("%d ",ptr->data);ptr=ptr->next;}
	printf("\n");
    }
}
int main()
{
	int n,i;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	hashfunct();
	display();
}
