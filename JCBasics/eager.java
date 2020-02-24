public class eager
{
	private static final eager ss=new eager();
	private int potat;
	private eager()
	{
		this.potat=1;
	}
	public static eager getObj(int val)
	{
		return(ss);
	}
	public static void main(String args[])
	{
		eager sbj=getObj(2);
		//But the default value assigned will be printed 
		System.out.println(sbj.potat);
	}
}