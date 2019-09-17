/*Given an array of integers that is already sorted in ascending order, 
find two numbers such that they add up to a specific target number.
LeetCode All TestCases Passed*/
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
    int start=0;
    int ans[]=new int[2];
    int end=nums.length-1;
    while(end>start)
    {
        if(nums[start]+nums[end]==target)
        {ans[0]=start+1;ans[1]=end+1;break;}
        if(nums[start]+nums[end]>target)
        end--;
        if(nums[start]+nums[end]<target)
        start++;
    }
    return(ans);
    }
}