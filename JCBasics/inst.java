///Use of this in Java
//Checking static and instance varible
public class inst
{
private int a;
static int b;
public void hello()
{
	System.out.println("Henno");
}
public void instinsrt(int a,int b)
{
	this.a=a;
	this.b=b;
}
inst()
{
	System.out.println("Constructor call using this");
}
inst(int x)
{
	this();
	System.out.println("This is x"+x);
}
public void caller()
{
this.hello();
}
public static void main(String args[])
{
	inst i1=new inst();
	i1.instinsrt(5,2);
	
	i1.caller();
	System.out.println(b);
	inst i2=new inst(5);

	System.out.println(i2.a+":"+i2.b);
}
}