//Check-collection framework
import java.util.*;
public class coll
{
	public static void main(String args[])
	{
		List<Integer>al=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			al.add(i);
		}
		for(int i=0;i<al.size();i++)
		{
			System.out.println("The num:"+al.get(i));
		}
		al.clear();
		al.add(0,1);
		al.add(1,0);
		System.out.println(al.toString());
		System.out.println(al);
	}
}