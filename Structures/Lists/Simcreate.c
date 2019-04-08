#include<stdio.h>
#include<malloc.h>
struct node
{
	int data;
	struct node *next;
};
struct node *head=NULL;
void insert(int k)
{
struct node *link=(struct node*)malloc(sizeof(struct node)); 
link->data=k;
link->next=head;
head=link;	
}
void finins()
{
	int k;
	scanf("%d",&k);
	insert(k);
	if(k!=-1)
	finins();
}
void display(int pos)
{
	int i;
	struct node *ptr=head;
    for(i=1;i<=pos;i++)
    ptr=ptr->next;
    printf("%d",ptr->data);
}
int main()
{
	int pos;
	finins();
	scanf("%d",&pos);
	display(pos);
}
