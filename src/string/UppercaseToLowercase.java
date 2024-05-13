package string;

import java.util.*;

public class UppercaseToLowercase 
{
public static void main(String[] args) 
{
	Scanner s1 = new Scanner(System.in);
    System.out.println("Enter the word");
	String s = s1.nextLine();
	s1.close();
	for(int i=0;i<s.length();i++)
	{
		char ch = s.charAt(i);
		if (ch>='a'&&ch<='z')
		{
			System.out.print((char)((int)ch-32));
		}
		else if(ch>='A'&&ch<='Z')
		{
			System.out.print((char)((int)ch+32));
		}
	}
	System.out.println();
  }
}
