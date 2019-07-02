//Merging two linked lists
//All LeetCode Test Cases Passed
class Solution 
{
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) 
    {
      if(head1==null)
          return(head2);
      if(head2==null)
          return(head1);
      if(head1==null && head2==null)
          return(head1);
      ListNode ptr2=head2;
      if(head1.val>=ptr2.val)
      {
        ListNode temp=ptr2.next;
        ptr2.next=head1;
        head1=ptr2;
        ptr2=temp;
      }
      ListNode prev=head1;
      while(prev.next!=null && ptr2!=null)
      {
        ListNode cur=prev.next;
        if(cur.val>=ptr2.val)
        {
          ListNode temp=ptr2.next;
          prev.next=ptr2;
          ptr2.next=cur;
          ptr2=temp;
          prev=prev.next;
        }
        else
        {prev=prev.next;}
      }
      if(ptr2!=null)
      prev.next=ptr2;
      return(head1); 
    }
}