//Finding Lowest Common Ancestor in a Tree
//LeetCode All Test Cases Passed
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        int min,max;
        if(p.val>q.val)
        {max=p.val;min=q.val;}
        else
        {max=q.val;min=p.val;}
        if(root.val>=min && root.val<=max)
            return(root);
        if(root.val>max)
            return(lowestCommonAncestor(root.left,p,q));
        //if(root.val<min)
            return(lowestCommonAncestor(root.right,p,q));
    }
}