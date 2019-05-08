import java.io.*;
import java.util.*;
public class RLE
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String chk=sc.nextLine();
		String Rl="";
		int c=0;
		for(int i=0;i<chk.length()-1;i++)
		{
			if(chk.charAt(i)==chk.charAt(i+1))
				c++;
			else
			{Rl=Rl+chk.charAt(i)+(c+1);c=0;}
		}
		System.out.println(Rl);
	}
}