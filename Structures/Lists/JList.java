//list Implementation in Java
class ListNode
{
	int val;
	ListNode next;
}
public class JList
{
	static ListNode head=null;
	public static void insert(int num)
	{
			ListNode cur=new ListNode();
			cur.val=num;
			if(head==null)
			{
				cur.next=head;
				head=cur;
				//System.out.print(cur.val+"->");
			}
			else
			{
				ListNode ptr=head;
				while(ptr.next!=null)
					ptr=ptr.next;
				cur.next=ptr.next;
				ptr.next=cur;
				//System.out.print(cur.val+"->");
			}
	}
	public static void show()
	{
		ListNode ptr=head;
		while(ptr!=null)
		{
			System.out.print(ptr.val+"=>");
			ptr=ptr.next;
		}
		System.out.print("null");
	}
	public static void main(String args[])
	{
		insert(5);
		insert(6);
		insert(9);
		insert(1);
		show();
	}
}