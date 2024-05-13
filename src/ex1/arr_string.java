package ex1;

public class arr_string {
	static boolean palindrome( String s) {
		String rev ="";
		for (int i = s.length()-1; i >=0 ; i--) {
			rev+=s.charAt(i);
		}
		//System.out.println(s);
		return rev.equals(s);
		
	}
public static void main(String[] args) {
	String []s = {"abc","aba","abba","madam","malayalam"};
	for (int i = 0; i < s.length; i++) {
		if(palindrome(s[i])) {
			System.out.println(s[i]);
		}
	}
	
	}
}
	

