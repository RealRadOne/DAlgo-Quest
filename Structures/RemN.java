//LeetCode Problem-Remove Nth Node from the End of List
//TestCases Passed-190/208
class Solution 
{
    public int Llens(ListNode head)
    {
        int count=0;
        ListNode ptr=head;
        while(ptr!=null)
        {ptr=ptr.next;count++;}
        return(count);
    }
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head!=null)
        {
        ListNode rpre=head;
        int len=Llens(head);
        if(len<=1)
            return(null);
        else
        {
        for(int i=0;i<len-n-1;i++)
        {
            rpre=rpre.next;
        }
        rpre.next=rpre.next.next;
        }
        }
        return(head);
    }
}