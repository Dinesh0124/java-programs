package pattens;

public class Demo 
{
	static int fib(int n)
	{
		if(n==1||n==0)
			return 0;
		else if(n==2||n==3)
			return 1;
		else 
			return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) 
	{
		System.out.println(fib(5));
	}
}
