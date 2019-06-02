#include<stdio.h>
#include<stdlib.h>

struct node1
{
	int data1;
	struct node1 *next1;
};
struct node1 *front1=NULL;
struct node1 *rear1=NULL;
struct node1 *save1;
struct node1 *newptr1;

struct node2
{
	int data2;
	struct node2 *next2;
};
struct node2 *front2=NULL;
struct node2 *rear2=NULL;
struct node2 *save2;
struct node2 *newptr2;

void getnode1()
{
	newptr1=(struct node1*)malloc(sizeof(struct node1));
}

void getnode2()
{
	newptr2=(struct node2*)malloc(sizeof(struct node2));
}

void push1(int info)
{
	getnode1();
	newptr1->data1=info;
	newptr1->next1=NULL;
	
	if(front1==NULL)
		front1=rear1=newptr1;
	else
	{
		save1=rear1;
		rear1=newptr1;
		save1->next1=newptr1;
	}
}

int pop1()
{	
	int i=0;
	if(front1==NULL)
	{
		printf("Underflow\n");
		return i;
	}
	else
	{
		save1=front1;
		front1=front1->next1;
		i=save1->data1;
		free(save1);
		return i;
	}
}

void push2(int info)
{
	getnode2();
	newptr2->data2=info;
	newptr2->next2=NULL;
	
	if(front2==NULL)
		front2=rear2=newptr2;
	else
	{
		save2=rear2;
		rear2=newptr2;
		save2->next2=newptr2;
	}
}

int pop2()
{	
	int i=0;
	if(front2==NULL)
	{
		printf("Underflow\n");
		return i;
	}
	else
	{
		save2=front2;
		front2=front2->next2;
		i=save2->data2;
		free(save2);
		return i;
	}
}

int count=0;

void insert()
{
	int data;
	printf("Enter the data: ");
	scanf("%d",&data);
	push1(data);
	count++;
}

void deletion()
{
	int i;
	for(i=0;i<(count-1);i++)
	{
		push2(pop1());
	}
	pop1();
	count--;
	for(i=0;i<count;i++)
	{
		push1(pop2());
	}
}

void display()
{
	save1=front1;
	while(save1!=NULL)
	{
		printf("%d\n",save1->data1);
		save1=save1->next1;
	}
}

int main()
{
int ch;
    printf("\n1 - Add an element into queue");
    printf("\n2 - Pop an element from queue");
    printf("\n3 - Display the queue");
    printf("\n4 - Exit rom the Program");

//    create_Queue();

    while (1)
    {
        printf("\nEnter choice");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            insert();
            break;
        case 2:
            deletion();
            break;
        case 3:
            display();
            break;
        case 4:
            exit(0);
        default:
            printf("Wrong choice");
        }
    }

}
	
