/*
Given a list of words, each word consists of English lowercase letters.

Let's say word1 is a predecessor of word2 if and only if we can add exactly one letter anywhere in word1 to make it equal to word2.  For example, "abc" is a predecessor of "abac".

A word chain is a sequence of words [word_1, word_2, ..., word_k] with k >= 1, where word_1 is a predecessor of word_2, word_2 is a predecessor of word_3, and so on.

Return the longest possible length of a word chain with words chosen from the given list of words.
*/
//All test cases passed
class Solution 
{
    public int longestStrChain(String[] words) 
    {
    Arrays.sort(words, new Comparator<String>()
    {
    public int compare(String s1, String s2) 
    {
        return s1.length() - s2.length();
    } 
    });
    int res=0;
    HashMap<String,Integer>lisa=new HashMap<String,Integer>();
    for(int i=0;i<words.length;i++)
    {
        String cur=words[i];
        if(lisa.containsKey(cur))continue;
        lisa.put(cur,1);
        for(int j=0;j<cur.length();j++)
        {
            StringBuilder sb = new StringBuilder(cur);
            sb.deleteCharAt(j);
            String next = sb.toString();
            if(lisa.containsKey(next) && lisa.get(next)+1>lisa.get(cur))
            {lisa.put(cur,lisa.get(next)+1);break;}
        }
        if(lisa.get(cur)>res)
            res=lisa.get(cur);
    }
    return(res);
    }
}