//Converting Array to BST
//All LeetCode testcases passsed
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
    public static TreeNode construct(int[] nums,int start,int end)
    {
        if(end>start)
        {
            int mid=(start+end)/2;
            TreeNode cur=new TreeNode(nums[mid]);
            cur.left=construct(nums,start,mid);
            cur.right=construct(nums,mid+1,end);
            return(cur);
        }
        else
        return null;
    }
    public TreeNode sortedArrayToBST(int[] nums) 
    {
    return(construct(nums,0,nums.length));    
    }
}