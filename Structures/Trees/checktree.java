//Tree implementation in JAVA
import java.util.*;
import java.io.*;
class Node
{
	int data;
	Node left;
	Node right;
}
public class BCheck
{  
	static Node rekt(int data)
	{
		    Node rc=new Node();
		    rc.data=data;
			if(data!=-1)
			{
				Scanner sc=new Scanner(System.in);
			    System.out.println("Enter leftChild");
				int ldata=sc.nextInt();
				rc.left=rekt(ldata);
				System.out.println("Enter rightChild");
				int rdata=sc.nextInt();
				rc.right=rekt(rdata);
				return(rc);
			}
			else
			return(rc);
	}
	static boolean checkTree(Node root)
	{
		if(root!=null)
		{
			if(checkTree(root))
			{
				if()
			}
			return(false);
		}
		return(true);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the root data:");
		int rdata=sc.nextInt();
		Node root=rekt(rdata);
		traverse(root);
	}
}