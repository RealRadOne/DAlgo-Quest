//Brace Expansion
/*
A string S represents a list of words.

Each letter in the word has 1 or more options.  If there is one option, the letter is represented as is.  If there is more than one option, then curly braces delimit the options.  For example, "{a,b,c}" represents options ["a", "b", "c"].

For example, "{a,b,c}d{e,f}" represents the list ["ade", "adf", "bde", "bdf", "cde", "cdf"].

Return all words that can be formed in this manner, in lexicographical order.

*/
class Solution 
{
    public void Trav(List<String>lisa,String wrds[],int cur,String word)
    {
        if(cur>=wrds.length)
        {lisa.add(word);}
        else
        {
        String[] poss=wrds[cur].split(",");
        Arrays.sort(poss);
        for(String let:poss)
        {
            Trav(lisa,wrds,cur+1,word+let);
        }
        }
    }
    public String[] expand(String S) 
    {
     String wrds[]=S.split("\\{|\\}");
     List<String>lisa=new ArrayList<String>();
     Trav(lisa,wrds,0,"");
     return lisa.toArray(new String[lisa.size()]);
    }
}