class MyCalculator
{
	int power(int a,int b)
	{
		if(a<0 || p<0)
		{
			
			try
			{
				throw new MyException;
			}
			catch(MyException e)
			{
				System.out.println(e);
			}
		}
	}
}
class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}
public class userexc
{
	public static void main(String args[])
	{

	}
}