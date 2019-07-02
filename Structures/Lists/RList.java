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
    public static int length(ListNode head)
    {
        int count=0;
        ListNode ptr=head;
        while(ptr!=null)
        {
            ptr=ptr.next;
            count++;
        }
        return(count);
    }
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null)
            return(head);
        int n=length(head);
        if(n==1)
            return(head);
        if(k>=n)
            k=k-(k/n)*n;
        ListNode kswp=head;
        ListNode last=head;
        for(int i=0;i<n-k-1;i++)
            kswp=kswp.next;
        for(int i=0;i<n-1;i++)
            last=last.next;
        last.next=head;
        head=kswp.next;
        kswp.next=null;
       // System.out.println(head.val+"**"+kswp.val+"**"+last.val);
        return(head);
    }
}