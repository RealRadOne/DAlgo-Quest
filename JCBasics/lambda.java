//All types of Lambda Functions here
interface print
{
	public void print();
}
interface check
{
	public int adder(int a,int b);
}
public class lambda
{
	public static void main(String args[])
	{
		print ps=()->{
			int a=5;
			System.out.println(a);
		};
		ps.print();
		check csk=(int a,int b)->{
			int c=a+b;
		     System.out.println("Hennoo");
			return(c);
		};
		csk.adder(2,5);
	}
}