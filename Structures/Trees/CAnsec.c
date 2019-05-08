#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

struct node {
    
    int data;
    struct node *left;
    struct node *right;
  
};

struct node* insert( struct node* root, int data ) {
		
	if(root == NULL) {
	
        struct node* node = (struct node*)malloc(sizeof(struct node));

        node->data = data;

        node->left = NULL;
        node->right = NULL;
        return node;
	  
	} else {
      
		struct node* cur;
		
		if(data <= root->data) {
            cur = insert(root->left, data);
            root->left = cur;
		} else {
            cur = insert(root->right, data);
            root->right = cur;
		}
	
		return root;
	}
}

/* you only have to complete the function given below.  
node is defined as  

struct node {
    
    int data;
    struct node *left;
    struct node *right;
  
};

*/
struct node *lehellper(struct node *root,int v1,int v2)
{
  if(root!=NULL)
  {
  if(root->left->data==v1 || root->right->data==v1)
  return(root);
  if(root->left->data==v2 || root->right->data==v2)
  return(root);
  else
  return(lehellper(root->left,v1,v2));
  }
  return(root);
}
struct node *rehellper(struct node *root,int v1,int v2)
{
  if(root!=NULL)
  {
    if(root->left->data==v1 || root->right->data==v1)
    return(root);
    if(root->left->data==v2 || root->right->data==v2)
    return(root);
    else
    return(rehellper(root->right,v1,v2));
  }
  return(root);
}
struct node *lca( struct node *root, int v1, int v2 ) 
{
if(root!=NULL)
{
  struct node *lan=lehellper(root,v1,v2);
  struct node *ran=rehellper(root,v1,v2);
  if(lan->data==ran->data)
  return(lan);
  else
  return(lca(root,lan->data,ran->data));
}
return(root);
}


int main() {
  
    struct node* root = NULL;
    
    int t;
    int data;

    scanf("%d", &t);

    while(t-- > 0) {
        scanf("%d", &data);
        root = insert(root, data);
    }
  	int v1;
  	int v2;
  
  	scanf("%d%d", &v1, &v2);
	struct node *ans = lca(root, v1, v2);
  	printf("%d", ans->data);
  	
    return 0;
}
