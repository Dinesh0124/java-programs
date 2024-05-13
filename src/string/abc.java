package string;

public class abc {
public static void main(String[] args) {
	String s1 ="abc";
	String s2="";
	print(s1,s2);
	
}

private static void print(String s1, String s2) {
	if (s1.length()==0) {
		System.out.println(s2);
	}
	for(int i =0;i<s1.length();i++) {
		char ch =s1.charAt(i);
		String res =s1.substring(i)+s2.substring(i);
		System.out.println(res);
		//print(res,ch+s2);
		
	}
	
}
}
