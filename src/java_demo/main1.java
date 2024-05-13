package java_demo;
class DineshExceotion extends Exception
{

	private static final long serialVersionUID = 1L;

public void m1()
{
System.out.println("hiii");	
}
}
public class main1
{
@SuppressWarnings("unused")
public static void main(String[] args) throws DineshExceotion{
	if (2>7)
	{
		System.out.println("oiii");
	}
	else
	{
		try
		{
			throw new DineshExceotion();
		}
		catch(DineshExceotion d)
		{
			d.m1();
		}
		
	}
}
	
}
