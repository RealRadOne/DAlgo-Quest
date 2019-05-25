//Flatten Binary Tree To List-LeetCode Prob
class Solution 
{
    public List<TreeNode> hellper(TreeNode root,List<TreeNode> ll)
    {
       if(root!=null)
       {
           ll.add(root);
           hellper(root.left,ll);
           hellper(root.right,ll);
           return(ll);
       }
       return(ll);
    }
    public void flatten(TreeNode root) 
    {
        List<TreeNode>ls=new ArrayList<TreeNode>();
        List<TreeNode>lk=hellper(root,ls);
        for(int i=0;i<lk.size()-1;i++)
        {
            root=lk.get(i);
            root.left=null;
            root.right=lk.get(i+1);
            //System.out.println(lk.get(i).val);
        }
    }
}