public class garbage
{
	int meth;
	public garbage()
	{
		this.meth=1;
	}
	public static void main(String args[])
	{
		garbage g1=new garbage();
		garbage g2=new garbage();
		g1=null;
		//Would throw null pointer exception
		//System.out.println(g1.meth);
		System.out.println(g2.meth);
		System.gc();
	}
	@Override
	protected void finalize()throws Throwable
	{
		System.out.println("Object garbage collected");
	}
}