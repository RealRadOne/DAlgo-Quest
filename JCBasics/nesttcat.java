//Checking nested try catch.The nested one has no matching catch
public class nesttcat
{
	public int cat(int a,int b)
	{
		try
		{
			a=a/10;
			try
			{
				b=b/0;
			}
			catch(NullPointerException e)
			{
				System.out.println("Ctaches here");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		return(5);
	}
	public static void main(String args[])
	{
		nesttcat n1=new nesttcat();
		n1.cat(2,5);
	}
}