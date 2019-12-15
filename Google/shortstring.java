/*
From any string, we can form a subsequence of that string by deleting some number of characters (possibly no deletions).

Given two strings source and target, return the minimum number of subsequences of source such that their concatenation equals target. If the task is impossible, return -1.

*/
//All testcases passed
class Solution 
{
    public int shortestWay(String source, String target) 
    {
    int i=0;
    int ans=0;
    while(i<target.length())
    {
        int tar=i;
        int j=0;
        while(j<source.length())
        {
            if(i<target.length() && target.charAt(i)==source.charAt(j))
                i++;
            j++;
        }
        if(tar==i)
        {ans=-1;break;}
        else
            ans++;
    }
    return(ans);
    }
}