import java.util.*;
import java.io.*;
class meth
{
synchronized static void adder(int a,int b)
{
	System.out.println(a+b);
}
public void syntest(String message)
{
	synchronized(this)
	{
	System.out.println(message);
	//this.wait(40);
    }
}
}
class th1 extends Thread
{
	public void run()
	{
		System.out.println("Runs1");
		meth m1=new meth();
		m1.adder(2,5);
		m1.syntest("Thread1");
	}
}
class th2 extends Thread
{
	public void run()
	{
		System.out.println("Runs2");
		meth m2=new meth();
		m2.adder(3,7);
		m2.syntest("Thread2");
	}
}
public class syntut
{
public static void main(String args[])
{
	th1 th=new th1();
	th2 ths=new th2();
	th.run();
	ths.run();
}
}