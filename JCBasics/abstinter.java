//Abstract classes+Interfaces
abstract class class1
{
	//Object cannot be created of an abstract-class
	abstract void printer();
	//Can contain abstract non-abstract mthods
	public void demo(int a,int b)
	{
		System.out.println(a+b);
	}
}
interface AdvancedArithmetic
{
	//All methods abstract by default
	int divisor_sum(int n);
}
interface Ad extends AdvancedArithmetic
{
	int addr_sum(int n);
}
class My extends class1
{
	public void printer()
	{
		System.out.println("Calling prints");
	}
}
class MyCalc implements Ad
{
	public int divisor_sum(int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
			sum=sum+i;
		return(sum);
	}
	public int addr_sum(int n)
	{
		return(n+n*2);
	}
}
public class abstinter
{
	public static void main(String args[])
	{
		My m1=new My();
		m1.printer();
		MyCalc mc=new MyCalc();
		int sums=mc.divisor_sum(5);
		System.out.println(sums);
		int s2=mc.addr_sum(6);
		System.out.println(s2);
	}
}