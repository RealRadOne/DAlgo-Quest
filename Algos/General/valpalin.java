class Solution 
{
    public boolean isPalindrome(String s)
    {
        s=s.toLowerCase().replaceAll(" ","");
        s=s.replaceAll("[^a-z0-9]", "");
        int start=0;
        int ends =s.length()-1;
        while(ends>=start)
        {
            if(s.charAt(ends)!=s.charAt(start))
                return false;
            ends--;start++;
        }
        return true;
    }
}
