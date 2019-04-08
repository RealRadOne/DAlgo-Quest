#include<stdio.h>
#include<malloc.h>
struct node
{
	int data;
	struct node *prev;
	struct node *next;
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
	link->prev=last;
	head=link;
	last=link;
	}
	else
	{
	link->next=head;
	link->prev=NULL;
	head=link;
	link->next->prev=link;
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
    struct node *ktr=last;
    while(ktr!=NULL)
    {
    	printf("**%d** ",ktr->data);
    	ktr=ktr->prev;
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
	link->prev=ptr;
	link->next=ptr->next;
	ptr->next->prev=link;
	ptr->next=link;
}
void delfr()
{
	head=head->next;
	head->prev=NULL;
}
void delmid(int pos)
{
	int i;
	struct node *ptr=head;
	for(i=0;i<pos-1;i++)
	{
		ptr=ptr->next;
	}
    ptr->next=ptr->next->next;
	ptr->next->prev=ptr;	
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
display();
insmid(5,2);
printf("\n");
display();
delfr();
printf("\n");
display();
delmid(2);
printf("\n");
display();
}
