//The Pascal Triangle Problem
//All Leetcode test cases passed
class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
    List<List<Integer>>lisa=new ArrayList<List<Integer>>();
    for(int i=0;i<numRows;i++)
    {
        List<Integer>rosa=new ArrayList<Integer>();
        if(i==0)
            rosa.add(1);
        else if(i==1)
        {rosa.add(1);rosa.add(1);}
        else
        {
        rosa.add(1);
        for(int j=1;j<i;j++)
        {
            List<Integer>prea=lisa.get(i-1);
            rosa.add(prea.get(j-1)+prea.get(j));
        }
        rosa.add(1);
        }
        lisa.add(rosa);
    }
    return(lisa);
    }
}