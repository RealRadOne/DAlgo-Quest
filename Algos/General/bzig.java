class Solution 
{
    int d=0;
    List<List<Integer>>store=new ArrayList<List<Integer>>();
    public void help(TreeNode root,int level,boolean status)
    {
        if(root==null)
            return;
        List<Integer>cur=new ArrayList<Integer>();
        if(store.get(level)!=null)
            cur=store.get(level);
        if(status)
            cur.add(0,root.val);
        else
            cur.add(root.val);
        help(root.right,level+1,!status);
        help(root.left,level+1,!status);
    }
    public int depth(TreeNode root)
    {
        if(root==null)
            return d;
        return(Math.max(depth(root.left),depth(root.right))+1);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        int fnl=depth(root);
        for(int i=0;i<fnl;i++)
        {
            List<Integer>lisa=new ArrayList<Integer>();
            store.add(lisa);
        }
        help(root,0,true);
        return store;
    }
}
