/*
Given a string S and a string T, find the minimum window 
in S which will
contain all the characters in T in complexity O(n).
*/
import java.lang.*;
class Solution 
{
    public String minWindow(String s, String t) 
    {
        if(s == null || s.length() < t.length() || s.length() == 0)
        {
        return "";
        }
        HashMap<Character,Integer>hash=new HashMap<Character,Integer>();
        for(int i=0;i<t.length();i++)
        {
            if(hash.containsKey(t.charAt(i)))
            {
                int num=hash.get(t.charAt(i));
                hash.put(t.charAt(i),num+1);
            }
            else
                hash.put(t.charAt(i),1);
        }
        int left=0;
        int mwin=s.length()+1;
        int wsiz=0;
        int mlef=0;
        for(int right=0;right<s.length();right++)
        {
            if(hash.containsKey(s.charAt(right)))
            {
                int num=hash.get(s.charAt(right));
                hash.put(s.charAt(right),num-1);
                if(hash.get(s.charAt(right))>=0)
                    wsiz++;
            }
            while(wsiz==t.length())
            {
              if((right-left+1)<mwin)
              {
                  mwin=right-left+1;
                  mlef=left;
              }
            if(hash.containsKey(s.charAt(left)))
            {
               hash.put(s.charAt(left),hash.get(s.charAt(left))+1);
               if(hash.get(s.charAt(left))>0)
                    wsiz--;
            }
            left++;
            }
        }
        if(mwin>s.length())  
        {  
        return "";  
        }  
    
        return s.substring(mlef,mlef+mwin);
    }
}
/*
ABC-O(M)
111

  A B O B E C O D E B A  N  C
  0 1 2 3 4 5 6 7 8 9 10 11 12
                     
*/