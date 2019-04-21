//Use of super
public class suptest
{
	int num1;
	int num2;
	public suptest()
	{
		System.out.println("In main class");
	}
	public int add(int num1,int num2)
	{
		System.out.println("In add method");
		return(num1+num2);
	}
	public static void main(String args[])
	{
		supstest s2=new supstest();
		s2.caller();
		int vat=s2.testcaller();
		System.out.println(vat);
	}
}
class supstest extends suptest
{	
	public int testcaller()
	{
		super.num1=3;
		super.num2=4;
		System.out.println("The first number is:"+super.num1);
		System.out.println("The second number is:"+super.num2);
	    return(super.add(2,5));
	}
}