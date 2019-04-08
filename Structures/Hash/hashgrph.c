#include<stdio.h>
#include<malloc.h>
struct node
{
	int key;
	struct node *next;
	int keylink;
};
struct node *G[20];
void insert(int data,int key)
{
	struct node* p;
	p=(struct node*)malloc(sizeof(struct node*));
	p->key=key;
	p->keylink=data;
	p->next=NULL;
	if(G[key-1]==NULL)
	G[key-1]=p;
	else
	{
		struct node*r=G[key-1];
        while(r->next!=NULL)
        r=r->next;
        r->next=p;
	}
}
void print(int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		struct node *ptr=G[i];
		while(ptr!=NULL)
		{
			printf("%d  ",ptr->key);
			printf("%d ",ptr->keylink);
			ptr=ptr->next;
		}
		printf("\n");
	}
}
void rem(int count,struct node *main)
{
	int ctr=1;
	if(main->next!=NULL)
	{
		int keynew=main->next->keylink;
		printf("%d\n",keynew);
		G[keynew];
		struct node *ptr=G[keynew];
		while(ptr!=NULL)
		{
			ctr++;
			ptr=ptr->next;
		}
		printf("**%d\n**",ctr);
		if(ctr%2==0)
		count++;
		rem(count,main->next);
	}
}
int main()
{
	int n,m,i;
	printf("Enter the number of edges and vertices");
	scanf("%d%d",&n,&m);
	for(i=0;i<n;i++)
	{
		int data,key;
	    scanf("%d%d",&data,&key);
		insert(data,key);
	}
	struct node* main=G[0];
	int count=0;
	rem(count,main);
	printf("%d",count);
}
