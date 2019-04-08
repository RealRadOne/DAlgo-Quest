#include<stdio.h>
#include<malloc.h>
struct node
{
	int data;
	struct node *next;
	struct node *prev;
};
struct node *head=NULL;
struct node *last=NULL;
void insert(int data)
{
	struct node *link=(struct node*)malloc(sizeof(struct node*));
	link->data=data;
	if(head==NULL)
	{
		link->next=head;
		link->prev=head;
		head=link;
		last=link;
	}
	else
	{
		link->next=head;
		link->prev=last;
		head->prev=link;
		head=link;
		last->next=head;
	}
}
void insmid(int data,int pos)
{
	int i;
	struct node *link=(struct node*)malloc(sizeof(struct node));
	link->data=data;
	struct node *ptr=head;
	for(i=0;i<pos;i++)
	ptr=ptr->next;
	link->next=ptr;
	link->prev=ptr->prev;
	ptr->prev->next=link;
	ptr->prev=link;
}
void display(int n)
{
	int i;
	struct node *ptr=head;
	for(i=0;i<n;i++)
	{
		printf("%d ",ptr->data);
		ptr=ptr->next;
	}
    struct node *ktr=last;
    for(i=0;i<n;i++)
    {
    	printf("**%d** ",ktr->data);
    	ktr=ktr->prev;
	}
}
void delmid(int pos)
{
	int i;
	struct node *ptr=head;
	for(i=0;i<pos-1;i++)
	ptr=ptr->next;
	struct node *kpr=ptr;
	ptr->prev->next=ptr->next;
	kpr->next->prev=kpr->prev;
}
void search(int data)
{
	int ctr=0;
	struct node *ptr=head;
	if(ptr->data==data)
	printf("%d",ctr);
	else
	{
		ctr++;
		ptr=ptr->next;
	}
}
int main()
{
	int n,i;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		int k;
		scanf("%d",&k);
		insert(k);
	}
	display(n+2);
	insmid(9,2);
	printf("\n");
	display(n+3);
	delmid(3);
	printf("\n");
	display(n+2);
	search(4);
}

