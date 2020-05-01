import java.util.*;
interface Maggu
{
	Maggu clone();
}
class Tom implements Maggu{
	private final String NAME = "Tom";

    @Override
    public Maggu clone() {
        return new Tom();
    }
}
class Dick implements Maggu{
	private final String NAME = "Dick";

    @Override
    public Maggu clone() {
        return new Dick();
    }
}
class Harry implements Maggu{
	private final String NAME = "Harry";

    @Override
    public Maggu clone() {
        return new Harry();
    }
}
class Mistry 
{
	private static final Map<String,Maggu>registry=new HashMap<String,Maggu>();
	static
	{
    registry.put("Tom",new Tom());
    registry.put("Dick",new Dick());
    registry.put("Harry",new Harry());
	}
	public static Maggu get_Assignment(String num)
	{
		try 
		{
            return registry.get(num).clone();
        } 
        catch (NullPointerException ex) 
        {
            System.out.println("Prototype with name: " + num + ", doesn't exist");
            return null;
        }
	}
}
public class Student 
{
	public static void main(String args[])
	{
		if (args.length > 0) 
		{
            for (String type : args)
             {
                Maggu prototype = Mistry.get_Assignment(type);
                if (prototype != null) 
                {
                    System.out.println(prototype);
                }
             }
        } 
        else 
        {
            System.out.println("Run again with arguments of command string ");
        }
	}
}