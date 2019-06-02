//LeetCode Problem-19
//Remove Nth Node from end
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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