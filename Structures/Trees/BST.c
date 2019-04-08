#include<stdio.h>
#include<malloc.h>
struct node
{
	int data;
	struct node *left;
	struct node *right;
};
struct node* create()
{
int data;
scanf("%d",&data);
struct node *temp=(struct node*)malloc(sizeof(struct node));
temp->data=data;
temp->left=NULL;
temp->right=NULL;
return(temp);
}
struct node* insert(struct node* root,struct node* temp)
{
	if(root->data>temp->data)
	{
	if(root->left!=NULL)
	insert(root->left,temp);
	else
	root->left=temp;
	}
	if(temp->data>root->data)
	{
		if(root->right!=NULL)
		insert(root->right,temp);
		else
		root->right=temp;
	}
}
void fw(struct node *root)
{
	int ch;
	printf("Enter choice as 0 or 1 for further data");
	scanf("%d",&ch);
	if(ch==1)
	{
    struct node *temp=create();
	insert(root,temp);
	fw(root);
	}
}
void print(struct node *root)
{
if(root!=NULL)
{
printf("%d\n",root->data);
print(root->left);
print(root->right);
}	
}
int main()
{
	int data;
	struct node *root=create();
	struct node *temp=create();
    insert(root,temp);
    fw(root);
    print(root);
}
