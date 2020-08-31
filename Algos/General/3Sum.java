class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        if(nums.length<3)
            return new ArrayList<>();
        Set<List<Integer>>lisa=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            int start=i+1;
            int end=nums.length-1;
            while(end>start)
            {
                int sum=nums[i]+nums[start]+nums[end];
                if(sum==0)
                {
                    List<Integer>cur=new ArrayList<Integer>();
                    cur.add(nums[i]);
                    cur.add(nums[start]);
                    cur.add(nums[end]);
                    lisa.add(cur);
                    end--;
                    start++;
                }
                else if(sum>0)
                    end--;
                else if(sum<0)
                    start++;
            }
        }
        return new ArrayList<>(lisa);
    }
}
