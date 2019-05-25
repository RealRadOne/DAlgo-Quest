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
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        else
        {
            int lheight=height(root.left);
            int rheight=height(root.right);
            if(lheight>=rheight)
                return(lheight+1);
            else
                return(rheight+1);
        }
    }
    public List<Integer> ltrav (TreeNode root,int level,List<Integer>node)
    {
        if(root==null)
            return  null;
        else
        {
            if(level==1)
                {node.add(root.val);}
            if(level>1)
            {ltrav(root.left,level-1,node);ltrav(root.right,level-1,node);}
            return(node);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> trav=new ArrayList<List<Integer>>();
        int height=height(root);
        System.out.println(height);
        for(int i=1;i<height+1;i++)
        {
            List<Integer>nodes=new ArrayList<Integer>();
            nodes=ltrav(root,i,nodes);
            trav.add(nodes);
        }
        return(trav);
    }
}