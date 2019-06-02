//LeetCode Problem-Missing Number
//TestCases passed-111/122
class Solution {
    public int missingNumber(int[] nums) 
    {
    if(nums.length>1)
    {
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(min>nums[i])
                min=nums[i];
            if(max<nums[i])
                max=nums[i];
        }
        Arrays.sort(nums);
        int count=0;
        int ans=0;
        for(int i=min;i<=max;i++)
        {
            if(i!=nums[count])
            {ans=i;break;}
            count++;
        }
        return(ans);
    }
    else 
    {
        if(nums[0]==0)
            return(1);
        else
            return(nums[0]-1);
    }
    }
}