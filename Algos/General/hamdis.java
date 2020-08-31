class Solution 
{
    public int hammingDistance(int x, int y) 
    {
        int num=x^y;
        int cou=0;
        while(num!=0)
        {
            num=(num)&(num-1);
            cou++;
        }
        return cou;
    }
}
