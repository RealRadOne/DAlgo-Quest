#include<stdio.h>
#include<malloc.h>
#include<string.h>
struct node
{
char data;
struct node *left;
struct node *right;
};
struct node* create()
{
char a[2];
printf("Enter # for no further data:");
scanf("%s",a);
if(a[0]=='#')
return NULL;
struct node *current=(struct node*)malloc(sizeof(struct node));
current->data=a[0];
printf("Enter left child of %c:\n",a[0]);
current->left=create();
printf("Enter right child of %c:\n",a[0]);
current->right=create();
return current;
}
void inorder(struct node *root)
{
if(root!=NULL)
{
inorder(root->left);
printf("%c\n",root->data);
inorder(root->right);
}
}
void preorder(struct node *root)
{
if(root!=NULL)
{
printf("%c",root->data);
preorder(root->left);
preorder(root->right);
}
}
void postorder(struct node *root)
{
if(root!=NULL)
{
postorder(root->left);
postorder(root->right);
printf("%c",root->data);
}
}
void convert(int ch,struct node *root)
{
if(ch==1)
inorder(root);
printf("\n");
else if(ch==2)
preorder(root);
printf("\n");
else
postorder(root);
printf("\n");
}
void helper(struct node *root)
{
printf("Enter 1 for converting in in-order form,2 for converting in pre-order form and 3 for converting in post-order form:");
printf("\n");
printf("Enter 5 if you do not want to convert in other forms:");
int ch;
scanf("%d",&ch);
if(ch!=5)
{
convert(ch,root);
helper(root);
}
}
int main()
{
struct node *root;
root=create();
helper(root);
}

