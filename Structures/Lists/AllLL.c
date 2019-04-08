#include<stdio.h>
#include<conio.h>
#include<malloc.h>
struct n1
{
       int data;
       struct n1 *next1;
       struct n1 *prev1;
};
struct n1 *h1=NULL;
struct n1 *l1=NULL;
struct n2
{
       int data;
       struct n2 *next2;
       struct n2 *prev2;
};
struct n2 *h2=NULL;
struct n2 *l2=NULL;
void insert(int ch,int data)
{
     if(ch==0)
     {
             struct n1 *link=(struct n1*) malloc(sizeof(struct n1));
             link->data=data;
             if(h1==NULL)
    {
    link->next1=h1;
    link->prev1=l1;
    h1=link;
    l1=link;
    }
    else
    {
    link->next1=h1;
    link->prev1=NULL;
    h1=link;
    link->next1->prev1=link;
     }
     }
     else
     {
         struct n2 *link=(struct n2*)malloc(sizeof(struct n2));
         link->data=data;
         if(h2==NULL)
         {
         link->next2=h2;
         link->prev2=l2;
         h2=link;
         l2=link;
         }
         else
         {
             link->next2=h2;
             link->prev2=NULL;
             h2=link;
             link->next2->prev2=link;
         }
      }
}
void srch()
{
     int flag=0;
     struct n1 *ptr=h1;
     while(ptr!=NULL)
     {     int dat=ptr->data;
                    int c=0;
                    struct n2 *pr=h2;
                    while(pr!=NULL)
                    {
                    if(dat==pr->data)
                    {
                    c=1;
                    flag=1;
                    printf("There are common elements in the linked lists");
                    break;
                    }
                    pr=pr->next2;
                    }
                    if(flag==1)
                    break;
                    ptr=ptr->next1;
     }
     if(flag==0)
     printf("There are no common elements in the linked lists");
}
void display()
{
     struct n1 *ptr=h1;
     while(ptr!=NULL)
     {printf("%d ",ptr->data);ptr=ptr->next1;}
     struct n1 *kpr=l1;
     while(kpr!=NULL)
     {printf("*%d ",kpr->data);kpr=kpr->prev1;}
     printf("\n");
     struct n2 *pr=h2;
     while(pr!=NULL)
     {printf("%d ",pr->data);pr=pr->next2;}
     struct n2 *kr=l2;
     while(kr!=NULL)
     {printf("*%d ",kr->data);kr=kr->prev2;}
}
int main()
{
    int n1,n2,i;
    scanf("%d%d",&n1,&n2);
    for(i=0;i<n1;i++)
    {
            int ch=0;
            int k;
            scanf("%d",&k);
            insert(ch,k);
    }
    for(i=0;i<n2;i++)
    {
            int ch=1;
            int k;
            scanf("%d",&k);
            insert(ch,k);
    }
    display();
    printf("\n");
    srch();
    getch();
}
