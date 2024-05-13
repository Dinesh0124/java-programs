package string;

import java.util.Scanner;

public class xyz 
{
	public static void main(String[] args) 
	{
		String s1 ="xyz";
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the step");
		int num=s.nextInt();
		s.close();
		String res="";
		for (int i = 0; i <s1.length(); i++) 
		{
			char ch=(char) (s1.charAt(i)+num);
			if(ch>'z')
			{
				res=res+(char)(ch-26);
			}
			else 
			{
				res=res+ch;
			}
		}
		System.out.println(res);
	
	}
}
