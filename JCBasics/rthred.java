import java.util.*;
import java.io.*;
class th1 implements Runnable
{
	public void run()
	{
		System.out.println("Printing from thread");
	}
}
class th2 extends Thread
{
	public void run()
	{
		System.out.println("Calling a run");
	}
}
public class rthred
{
	public static void main(String args[])
	{
		th1 thr=new th1();
		Thread t1=new Thread(thr);
		t1.start();
		th2 ths=new th2();
		ths.start();
	}
}