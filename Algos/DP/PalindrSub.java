//LeetCode All TestCases Passed
//Finding Palindrome Substring
class PalindrSub
{
    public int chckpal(String s)
    {
        int ans=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {ans=0;break;}
        }
        return(ans);
    }
    public int countSubstrings(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(chckpal(s.substring(i,j+1))==1)
                    count++;
            }
        }
        return(count);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scnner(System.in);
        String s=sc.next();
        System.out.println(countSubSubstrings(s));
    }
}