class Solution
{
    public List<Integer> largestDivisibleSubset(int[] nums) 
    {
        Arrays.sort(nums);
        List<Integer>lisa=new ArrayList<Integer>();
        if(nums.length==0)
            return lisa;
        int count[]=new int[nums.length];
        int max=Integer.MIN_VALUE;
        Arrays.fill(count,1);
        for(int i=1;i<nums.length;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(nums[i]%nums[j]==0)
                    count[i]=Math.max(count[i],count[j]+1);
            }
        }
        int maxid=0;
        for(int i=1;i<nums.length;i++)
        {
            if(count[i]>count[maxid])
            {
                maxid = count[i] > count[maxid] ? i : maxid;
            }
        }
        int temp=nums[maxid];
        int curr=count[maxid];
        for(int i=maxid;i>=0;i--)
        {
            System.out.println(nums[i]+" "+temp+" "+count[i]);
            if(temp%nums[i]==0 && count[i]==curr)
            {
                lisa.add(nums[i]);
                temp=nums[i];
                curr--;
            }
        }
        return lisa;
    }
}
