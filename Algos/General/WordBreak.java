//WordBreak-LeetCode
//TestCases Passed-21/36
import java.util.*;
class Solution 
{
    public boolean wordBreak(String s, List<String> wordDict) 
    {
    if(s.length()==0)
        return(false);
    if(s.length()==1 && wordDict.contains(s))
        return(true);
    if(wordDict.size()==0)
        return(false);
    int a[]=new int[wordDict.size()];
    int st=0;
    for(int i=0;i<s.length();i++)
    {
        String subs=s.substring(st,i+1);
        if(wordDict.contains(subs))
        {
            st=i+1;a[wordDict.indexOf(subs)]=1;
        }
    }
    boolean ans=true;
    for(int i=0;i<a.length;i++)
    {
       if(a[i]==0)
       {ans=false;break;}
    }
    return(ans);
    }
}