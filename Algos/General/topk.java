class Solution 
{
        public int[] topKFrequent(int[] nums, int k) 
        {
            if(k == nums.length) return nums;
            int ans[]=new int[k];
            HashMap<Integer,Integer>hash=new HashMap<Integer,Integer>();
            for(int i=0;i<nums.length;i++)
            {
                if(!hash.containsKey(nums[i]))
                    hash.put(nums[i],1);
                else
                {
                    hash.put(nums[i],hash.get(nums[i])+1);
                }
            }
            Queue<Integer> PQ = new PriorityQueue<>((a, b) -> hash.get(b) - hash.get(a));
            for(int x:hash.keySet())
            {
                PQ.add(x);
            }
            for(int i=0;i<k;i++)
            {
                ans[i]=PQ.poll();
            }
            return ans;
        }
}
