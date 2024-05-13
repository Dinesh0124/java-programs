package string;

public class SirProgram 
{
	public static void main(String[] args) 
	{
		String s="sir";
		//print(s);
		print1(s);
	}
	static void print(String s) {
		for(int i=0;i<s.length();i++){
			for(int j=i;j<s.length();j++){
				System.out.println(s.substring(i,j+1));
			}
		}
	}
	static void print1(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(s.charAt(j));
			}System.out.println();
		}
	}
}
