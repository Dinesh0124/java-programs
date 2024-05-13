package string;

public class alpha 
{
	public static void main(String[] args) 
	{
		String s="DINESH";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||
					s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				res=res+(char)(s.charAt(i)+32);
			}
			else
				res=res+s.charAt(i);
		}
		System.out.println(res);
	}

}
