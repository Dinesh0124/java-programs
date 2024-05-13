package string;

public class StrPalindrome 
{
	static boolean palindrome(String str)
	{
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		return res.equals(str);
	}
	public static void main(String[] args) 
	{
		String []str= {"aba","acbca","malayalam","acca","acbbca","abb",};
		int length=0;
		int max=0;
		for(int i=0;i<str.length;i++)
		{
			if(palindrome(str[i]))
			{
				if(str[i].length()>length)
				{
					length=str[i].length();
					max=i;
				}
			}
		}
		System.out.println(str[max]);
	}
}
