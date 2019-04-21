class Res
{
	//int reso=-1;
	synchronized static void adder()
	{
		System.out.println("In hands");
		try
		{
		Thread.sleep(400);
		Thread th=new Thread();
		System.out.println(th.getName());
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Too long");
	    }
    }
    public void subber()
    {
    	synchronized(this)
	{
		System.out.println("Too long");
		try
		{
	    this.wait();
		this.notify();
		Thread.sleep(400);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Too long");
	    }
	}
    }

}
class t1 extends Thread
{
	public void run()
	{
		Res r1=new Res();
		r1.adder();
		r1.subber();
	}
}
class t2 extends Thread
{
	public void run()
	{
		Res r2=new Res();
		r2.subber();
		r2.adder();
	}
}
public class deadlock
{
	public static void main(String args[])
	{
		t1 ts=new t1();
		ts.start();
		t2 tsk=new t2();
		tsk.start();
	}
}