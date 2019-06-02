//LeetCode-Find the Closest Palindrome
//TestCases Passed-143/212
class Solution {
    public int chpa(int s)
    {
        String sp=Integer.toString(s);
        StringBuffer sb=new StringBuffer(sp);
        String ck=sb.reverse().toString();
        if(sp.compareTo(ck)==0)
            return(1);
        else
            return(0);
    }
    public int pows(int a,int b)
    {
        int ans=1;
        for(int i=0;i<b;i++)
            ans=ans*a;
        return(ans);
    }
    public int contoInt(String n)
    {
        int count=0;
        int num=0;
        for(int i=n.length()-1;i>-1;i--)
        {
         int dig=(int)n.charAt(i)-48;
         num=num+dig*pows(10,count);
         count++;
        }
        return(num);
    }
    public String nearestPalindromic(String n) 
    {
    if(n.length()==0)
        return("0");
    if(n.length()==1)
        return(Integer.toString(contoInt(n)-1));
    String ansf="";
    int num1=0;
    System.out.println(contoInt(n));
    for(int i=0;i<contoInt(n);i++)
    {
        int ck=contoInt(n)-i;
        //System.out.println(chpa(ck));
        if(chpa(ck)==1)
        {
            String ans=Integer.toString(ck);
            ansf=ans;num1=i;break;
        }
    }
    int num2=0;
    for(int i=0;i<num1;i++)
    {
         int ck=contoInt(n)+i;
        //System.out.println(chpa(ck));
        if(chpa(ck)==1)
        {
            String ans=Integer.toString(ck);
            ansf=ans;num2=i;break;
        }
    }
    return(ansf);
    }
}