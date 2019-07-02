//Comparing Version Numbers 
//All LeetCode Test Cases Passed
class Solution 
{
    public static int mins(int a,int b)
    {
        if(a>b)
            return(b);
        else
            return(a);
    }
    public int compareVersion(String version1, String version2) 
    {
    String[] ver1=version1.split("\\.");
    String[] ver2=version2.split("\\.");
    int n=mins(ver1.length,ver2.length);
    int a=0;
    for(int i=0;i<n;i++)
    {
        if(Integer.parseInt(ver1[i])<Integer.parseInt(ver2[i]))
        {a=-1;break;}
        if(Integer.parseInt(ver1[i])>Integer.parseInt(ver2[i]))
        {a=1;break;}
    }
    if(ver1.length>ver2.length && a==0)
    {
        for(int i=n;i<ver1.length;i++)
        {
            if(Integer.parseInt(ver1[i])!=0)
            {a=1;break;}
        }
    }
    if(ver1.length<ver2.length && a==0)
    {
        for(int i=n;i<ver2.length;i++)
        {
            if(Integer.parseInt(ver2[i])!=0)
            {a=-1;break;}
        }
    }
    return(a);
    }
}