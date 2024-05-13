package java_demo;

public class Anagram 
{
public static void main(String[] args) {
	String s1="hihello";
	String s2="hellohi";
	if(s1.length()==s2.length()) {
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int c=0;
		for (int i = 0; i < c1.length; i++) {
			for(int j =0;j<c2.length;j++) {
				if(c1[i]==c2[j]) {
					c++;
					break;
				}
			}
		}if(c==s1.length()) {
			System.out.println("It is Anagram");
		}
		else {
			System.err.println("It is not Anagram");
		}
	}
	else {
		System.err.println("It is not Anagram");
	}
	
}
}
