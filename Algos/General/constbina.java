class Solution 
{
    public TreeNode help(int[] inorder,int[] postorder,int start,int end,int cur)
    {
        if(start<0 || start>end)
            return null;
        else
        {
            TreeNode root=new TreeNode(postorder[cur]);
            int i=start;
            for(;i<end;i++)
            {
                if(inorder[i]==root.val)
                    break;
            }
            root.left=help(inorder,postorder,start,i-1,cur-1+i-end);
            root.right=help(inorder,postorder,i+1,end,cur-1);
            return root;
        }
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) 
    {
        return help(inorder,postorder,0,inorder.length-1,postorder.length-1);
    }
}
