class Solution 
{
    public int sumOfLeftLeaves(TreeNode root) 
    {
        if(root==null)
            return 0;
        if(root.left!=null)
        {
            TreeNode cur=root.left;
            if(cur.left==null && cur.right==null)
            {
                    return cur.val+sumOfLeftLeaves(root.right);
            }
        }
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }
}
