//Singleton class is important for design principles as well
public class tsafe
{
	private static tsafe ss;
	private int potat;
	private tsafe()
	{
		this.potat=1;
	}
	public static synchronized tsafe getObj(int val)
	{
		if(ss==null)
			ss=new tsafe();
		return(ss);
	}
	public static void main(String args[])
	{
		tsafe sbj=getObj(2);
		System.out.println(sbj.potat);
	}
}