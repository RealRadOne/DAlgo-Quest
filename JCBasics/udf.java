class MyExec extends Exception
{
public void message()
{
	System.out.println("This is an exception");
}
}
public class udf
{
	public static void main(String args[])
	{
		int num1=0;
		try
		{
			throw new MyExec();
		}
		catch(MyExec e)
		{
			e.message();
		}
	}
}