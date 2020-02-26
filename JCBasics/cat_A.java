abstract class incharge
{
	public abstract void addSabji();
	public abstract void addDal();
	public abstract void addRice();
	public abstract void addRoti();
	public void serve()
	{
		System.out.println("Dish it out!");
	}
}
public class cat_A extends incharge
{
	@Override
	public void addSabji()
	{System.out.println("Serve lauki!");}
	@Override
	public void addDal()
	{System.out.println("Serve water!");}
	@Override
	public void addRice()
	{System.out.println("Serve Insects!");}
	@Override
	public void addRoti()
	{System.out.println("Serve rubber!");}
	public static void main(String args[])
	{
		cat_A server=new cat_A();
		server.addSabji();
		server.addRoti();
		server.addRice();
		server.addDal();
	}
}