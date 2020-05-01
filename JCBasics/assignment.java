import java.util.*;
//Maggu cannot be instantiated being abstract
abstract class Maggu implements Cloneable
{
//Implements cloneable interface to generate copies of 
//his assignment
protected String Name;
abstract void print();
public Object clone()
{
	Object clone=null;
	try
	{
		clone=super.clone();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return clone;
}
}
class Client1 extends Maggu
{
	//Putting in my name while asking for a copy
	public Client1()
	{
		this.Name="Sakshi";
	}
	//providing implementation of abstract methods
	@Override
	void print()
	{
		System.out.println("Assignment delivered to Sakshi");
	}
}
class Client2 extends Maggu
{
	public Client2()
	{
		this.Name="Shrishti";
	}
	@Override
	void print()
	{
		System.out.println("Assignment delivered to Shrishti");
	}
}
class Mistry
{
	//Maggu keeping the record of clients in a hashmap
	private static Map<String,Maggu> store=new HashMap<String,Maggu>();
	//Maggu attaches copies of Maggu's assignments as per names(orders)
	static
	{
	store.put("Sakshi",new Client1());
	store.put("Shrishti",new Client2());
	}
	public static Maggu getAssignment(String Name)
	{
		return (Maggu)store.get(Name).clone();
	}
}
public class assignment
{
	public static void main(String[] args)
	{
		Mistry.getAssignment("Sakshi").print();
		Mistry.getAssignment("Shrishti").print();
	}
}