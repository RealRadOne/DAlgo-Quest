import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class game
{
    public static int mins(int m,int n)
    {
        if(m>n)
        return n;
        else
        return m;
    }
    public static int maxs(int m,int n)
    {
       if(m>n)
       return m;
       else
       return n;
    }
    public static void game(int m,int n,int ch)
    {
        if(m!=0 && n!=0)
        {
            //Flipping the chance for alternate chances to Ari and Rich
            if(ch==0)
            ch=1;
            else
            ch=0;
            int selpile=mins(m,n);
            int relpile=maxs(m,n);
            for(int i=selpile;i>0;i--)
            {
                if(relpile%i==0)
                {selpile=selpile-i;break;}
            }
            game(selpile,relpile,ch);
        }
        else
        {
            if(ch==0)
                System.out.println("Ari");
            else
              System.out.println("Rich");
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int m,n;
		    m=sc.nextInt();
		    n=sc.nextInt();
		    int ch=0;
		    game(m,n,ch);
		}
	}
}
