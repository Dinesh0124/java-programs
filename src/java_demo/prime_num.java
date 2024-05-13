package java_demo;
public class prime_num 
{
	static boolean prime (int n) {
	int count =0;
	for (int i =1;i<=n;i++)
	{
		if (n%i==0)
     	{ 
	    count++;
		 if (count>2)
		  {
			break;
		  }
	    }
	}
	if (count==2)
		return true;
	else
		return false;
}
	public static void main (String[]args)
	{
		for (int g =1;g<=100;g++)
		{
			if (prime(g))
			{
				System.out.println(g);
			}
		}
	}
	
}
