package java_demo;

import java.util.Scanner;

public class Recursion_demo 
{
	static int sum=0;

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first range value");
		int num=sc.nextInt();
		System.out.println("Enter the final range  value");
		int end=sc.nextInt();
		sc.close();
		for(;num<=end;num++)
		{
			int temp=num;
			armStrong(num,temp);
		}
		
	}

	private static void armStrong(int num, int temp) 
	{
		int tc=count(temp);
		
		if(num>0)
		{
		
			int rem=num%10;
			sum=sum+(int)Math.pow(rem,tc);
			num/=10;
			armStrong(num,temp);
		}
		else if(sum==temp)
		{
			System.out.println(temp+" is ArmStrong Number");
			sum=0;
		}
		else
		{
			//System.out.println(temp+" is not ArmStrong number");
			sum=0;
		}
	}

	private static int count(int temp) 
	{
		int count=0;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		return count;
	}
}
