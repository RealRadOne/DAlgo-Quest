//CodeChef May Challenge Problem-Reduce to One
import java.io.*;
import java.util.*;
public class red
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int ans[]=new int[t];
		for(int i=0;i<t;i++)
		{
			List <Integer> sample=new ArrayList<Integer>();
			int n=sc.nextInt();
			for(int j=0;j<n;j++)
			{
				sample.add(j+1);
			}
			for(int j=0;j<n-1;j++)
			{
				int x=sample.get(0);
				int y=sample.get(sample.size()-1);
				//System.out.println(sample);
				if(x!=y)
				{
				int rep=x+y+(x*y);
				sample.remove(0);
				sample.remove(sample.size()-1);
				sample.add(rep);
			    }
			    else
			    	{
			    	ans[i]=sample.get(sample.size()-1);
			    	//System.out.println(sample.get(sample.size()-1));break;
			    	}
			}
			ans[i]=sample.get(sample.size()-1);
			//System.out.println(sample.get(sample.size()-1));
		}
	   for(int i=0;i<t;i++)
	   {
	   	System.out.println(ans[i]);
	   }
	}
}