public class nest
{
	static class nest1
	{
		public static void printer()
		{
			System.out.println("Sttaic in Sttaic");
		}
		public void printers()
		{
			System.out.println("Non sttaic in sttatic");
		}
	}
	class nest2
	{
		public void prints()
		{
			System.out.println("Non Sttaic non Sttaic");
		}
		void tprint()
		{
			System.out.println("Static in non sttatic");
		}
	}
	public static void main(String args[])
	{
		nest.nest1.printer();
		nest n1=new nest();
		nest.nest1 nj=new nest.nest1();
		nj.printers();
		nest.nest2 ns=n1.new nest2();
		ns.prints();
	}
}