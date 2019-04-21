//Singleton class is important for design principles as well
public class singleton
{
	private static singleton ss;
	private int potat;
	private singleton()
	{
		this.potat=1;
	}
	public static singleton getObj(int val)
	{
		if(ss==null)
			ss=new singleton();
		return(ss);
	}
	public static void main(String args[])
	{
		singleton sbj=getObj(2);
		System.out.println(sbj.potat);
	}
}