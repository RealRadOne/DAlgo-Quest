class Solution 
{
public:
    int maxs(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
public:
    int lengthOfLIS(vector<int>& nums) 
    {
        int ans[nums.size()];
        for(int i=0;i<nums.size();i++)
            ans[i]=1;
        for(int i=1;i<nums.size();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {ans[i]=maxs(ans[i],(ans[j]+1));}
            }
        }
        int max=0;
        for(int i=0;i<nums.size();i++)
        {
            max=maxs(ans[i],max);
        }
        return max;
    }
};
