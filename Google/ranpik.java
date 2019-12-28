/*
Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex which randomly picks an index in proportion to its weight.

Note:

1 <= w.length <= 10000
1 <= w[i] <= 10^5
pickIndex will be called at most 10000 times.
Example 1:

Input: 
["Solution","pickIndex"]
[[[1]],[]]
Output: [null,0]
*/
import java.util.*;
class Solution 
{
    Random random;
    int[] w;
    public Solution(int[] w) 
    {
      this.random=new Random();
      for(int i=1;i<w.length;i++)
          w[i]=w[i-1]+w[i];
      this.w=w;
    }
    
    public int pickIndex() 
    {
        int len=w.length;
        int lim=random.nextInt(w[w.length-1])+1;
        int left=0;
        int right=len-1;
        while(right>left)
        {
            int mid=left+(right-left)/2;
            if(w[mid]==lim)
                return mid;
            else if(w[mid]<lim)
                left=mid+1;
            else
                right=mid;
        }
        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */