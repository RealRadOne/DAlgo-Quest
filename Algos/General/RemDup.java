//LeetCode-Remove Duplicate Letters
//Testcases passed-143/286
class Solution 
{
    public String removeDuplicateLetters(String s) 
    {
        List<Character>hash=new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(!hash.contains(s.charAt(i)))
                hash.add(s.charAt(i));
        }
        Collections.sort(hash);
        String str="";
        for(int i=0;i<hash.size();i++)
            str=str+hash.get(i);
        return(str);
    }
}