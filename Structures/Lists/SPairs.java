//LeetCode Problem-Swap Nodes in Pairs
//55/55 testcases passed
class Solution 
{
    public int LenList(ListNode head)
    {
        int len=0;
        ListNode ptr=head;
        while(ptr!=null)
        {
            ptr=ptr.next;
            len++;
        }
        return(len);
    }
    public ListNode swapPairs(ListNode head)
    {
       int size=LenList(head);
       if(size==0 || size==1)
           return(head);
       ListNode cur=head;
       for(int i=0;i<size-1;i=i+2)
       {
          int temp=cur.val;
          cur.val=cur.next.val;
          cur.next.val=temp;
          //System.out.println(i);
          cur=cur.next.next;
       }
       return(head);
    }
}