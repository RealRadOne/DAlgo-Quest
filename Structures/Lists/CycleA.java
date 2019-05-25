//Checking for cycle in Linked List using Floyd's Algorithm
//The code however does not work for all test cases
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) 
    {
        if(head==null)
            return(false);
        if(head.next==null)
            return(false);
        else
        {
        ListNode ptr=head;
        ListNode ptr2=head;
        boolean retval=false;
        while(ptr!=null)
        {
            if(ptr.val==ptr2.val)
            {retval=true;break;}
            else
            ptr=ptr.next;
            ptr2=ptr2.next.next;
        }
      return(retval);  
       }
    }
}