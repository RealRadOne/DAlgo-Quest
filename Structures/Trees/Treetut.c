#include<stdio.h>
#include<malloc.h>
struct node
{
	int data;
	struct node *left;
	struct node *right;
};
struct node *insert(int data)
{
	struct node *current=(struct node*) malloc(sizeof(struct node));
	current->data=data;
	int chdata;
	scanf("%d",&chdata);
	if(chdata!=-1)
	current->right=insert(chdata);
	else
	current->right=NULL;
	scanf("%d",&chdata);
	if(chdata!=-1)
	current->left=insert(chdata);
	else
	current->left=NULL;
	return(current);
}
void traverse(struct node *t)
{    
    if(t->left==NULL&&t->right==NULL)
    {
        printf("\n%d",t->data);           
    }
    else
    {
    	traverse(t->left);       
        traverse(t->right);   
	}
}
int main()
{
	int data;
	scanf("%d",&data);
	struct node *root;
	root=insert(data);
	traverse(root);
}
