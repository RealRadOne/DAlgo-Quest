//Serial Telecast XD
//Refer Serialization and Marshalling
import java.io.*;
import java.util.*;
public class serial implements Serializable
{
	String name;
	transient int pridata;
	int telec;
	serial(String name,int pridata,int telec)
	{
		this.name=name;
		this.pridata=pridata;
		this.telec=telec;
	}
	public static void main(String args[])throws Exception
	{
		serial ssc=new serial("Sakshi",2,23);
		FileOutputStream fin=new FileOutputStream("tester.txt");
		ObjectOutputStream oosd=new ObjectOutputStream(fin);
		oosd.writeObject(ssc);
		oosd.flush();
		FileInputStream fsk=new FileInputStream("tester.txt");
		while((int)fsk.read()!=1)
		{
			System.out.println((char)fsk.read());
		}
		ObjectInputStream oosk=new ObjectInputStream(fsk);
		serial ssk=(serial)oosk.readObject();
		System.out.println("Name"+ssk.name);
		oosk.close();
	}
}