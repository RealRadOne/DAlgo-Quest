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
    public void trav(TreeNode root,List<Integer>alls)
    {
        if(root==null)
            return;
        trav(root.left,alls);
        alls.add(root.val);
        trav(root.right,alls);
    }
    public int kthSmallest(TreeNode root, int k) 
    {
       List<Integer>alls=new ArrayList<Integer>();
       trav(root,alls);
       return(alls.get(k-1));
    }
}