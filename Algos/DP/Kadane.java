//LeetCode prob-Calculate max product of subarray
//Trial Algo-Kadane
//The code however works only for 55/184 testcases
class Solution {
    public int maxProduct(int[] nums) 
    {
     int locmax=1;
     int globmax=0;
     for(int i=0;i<nums.length;i++)
     {
         locmax=locmax*nums[i];
         if(locmax>globmax)
             globmax=locmax;
         if(locmax<0)
             locmax=1;
     }
        return(globmax);
    }
}