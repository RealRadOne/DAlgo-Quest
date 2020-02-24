public class stat
{
	private static stat ss;
	private int potat;
	private stat()
	{
		this.potat=1;
	}
	static 
	{
		try
		{
			ss=new stat();
		}
		catch(Exception e)
		{
			System.out.println("Ain't got no potat");
		}
	}
	public static stat getObj(int val)
	{
		return(ss);
	}
	public static void main(String args[])
	{
		stat sbj=getObj(2);
		System.out.println(sbj.potat);
	}
}