#include<stdio.h>
#include<malloc.h>
struct node
{
	int data;
	struct node *next;
};
struct node *head=NULL;
struct node *last;
void inatfr(int data)
{
	struct node *link=(struct node*)malloc(sizeof(struct node*));
	link->data=data;
	if(head==NULL)
	{
		link->next=head;
		head=link;
		last=link;
	}
	else
	{
		link->next=head;
		head=link;
		last->next=head;
	}
}
void insmid(int data,int loc)
{
	int i;
	struct node *ptr=head;
	for(i=0;i<loc-1;i++)
	{
		ptr=ptr->next;
	}
    struct node *link=(struct node*)malloc(sizeof(struct node*));
	link->data=data;
	link->next=ptr->next;
	ptr->next=link;	
}
void inslast(int data)
{
	struct node *link=(struct node*)malloc(sizeof(struct node));
	link->data=data;
	last->next=link;
	link->next=head;
	last=link;
}
void delfr()
{
/*struct node *first=head;*/
head=head->next;
last->next=head;
/*free(first->next);*/
}
void delmid(int pos)
{
	struct node *ptr=head;
	int i;
	for(i=0;i<pos-2;i++)
	{
		ptr=ptr->next;
	}
		ptr->next=ptr->next->next;
	
}
void display(int k)
{
	int i;
	struct node *ptr=head;
	for(i=0;i<k;i++)
	{
		printf("%d ",ptr->data);
		ptr=ptr->next;
	}
}
int main()
{
	int s,i;
	scanf("%d",&s);
	for(i=0;i<s;i++)
	{
		int k;
		scanf("%d",&k);
		inatfr(k);
	}
	display(s);
	delfr();
	printf("\n");
	display(s);
	insmid(5,2);
	printf("\n");
	display(s+1);
	inslast(8);
	printf("\n");
	display(s+2);
	delmid(2);
	printf("\n");
	display(s+2);
}
