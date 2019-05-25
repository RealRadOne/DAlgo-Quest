//LeetCode Problem-Twos #Microsoft Interview Problem
import java.util.*;
class TwoS
{
    public int[] twoSum(int[] nums, int target)
    {
        int ans[]=new int[2];
        HashMap<Integer,Integer>hash=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hash.put(nums[i],i);
            if(hash.containsKey(target-nums[i]))
            {
                int num1=hash.get(target-nums[i]);
                if(num1!=i)
                {
                ans[0]=num1;
                ans[1]=i;
                break;
                }
            }
        }
        return(ans);
    }
}